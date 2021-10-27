package interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;


public class PanelTablero extends JPanel implements MouseListener
{
	public Tablero juegotablero;
	
	private VentanaJuego padre;
	
	private ImageIcon bombillo;
	
	
	public PanelTablero(VentanaJuego padre, int tamaño, int dificultad) 
	{
		bombillo = new ImageIcon("./data/luz.png");
		
		this.padre = padre;
		nuevoTablero(tamaño, dificultad); 

		this.addMouseListener(this);

		
	}
	
	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.darkGray);
		g2d.fillRect(0,0,this.getWidth(),this.getHeight());
		
		dibujarCasillas(g2d);
		
	}
	
	
	private void dibujarCasillas(Graphics2D g2d) 
	{
		
		boolean[][] tablero = juegotablero.darTablero();
		int cantidad = tablero.length;
		
		
		int alto = this.getHeight();
		int ancho = this .getWidth();
		int altoCasilla = alto/cantidad;
		int anchoCasilla = ancho/cantidad;
		
		
		
		for (int fila=0; fila < cantidad; fila++)
		{
			int inicio_f = fila * altoCasilla;
			for(int columna = 0; columna < cantidad ; columna++)
			{
				int inicio_c = columna * anchoCasilla;
				Color colorBase = new Color(60, 60, 60);
				
				int delta = 6;
				if (tablero[fila][columna])
				{
					delta = 5;
					colorBase = new Color(240, 245, 95);
					
				}
				
				g2d.setColor(colorBase);
				g2d.fillRect(inicio_c , inicio_f ,anchoCasilla-delta,altoCasilla-delta);
				g2d.drawImage(bombillo.getImage(), inicio_c, inicio_f, anchoCasilla-delta, altoCasilla-delta, padre);
			
			}
		}
	}

	public Tablero getTablero()
	{
		return this.juegotablero;
	}


	public void actualizarse(int i, int j) 
	{
		//usar darTablero
		
		//esto se debe llamar cada vez que escogen una casilla
		
		
//		si ya gano no debe funcionar
		if(!(juegotablero.tableroIluminado()))
		{	
			juegotablero.jugar(i, j);
			
			padre.jugar();
			
			
			
			repaint();
		}
	}
	
	
	private int[] convertirCoordenadasACasilla(int x, int y)
	{
	int ladoTablero = juegotablero.darTablero().length;
	int altoPanelTablero = getHeight();
	int anchoPanelTablero = getWidth();
	int altoCasilla = altoPanelTablero / ladoTablero;
	int anchoCasilla = anchoPanelTablero / ladoTablero;
	int fila = (int) (y / altoCasilla);
	int columna = (int) (x / anchoCasilla);
	return new int[] { fila, columna };
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
	int click_x = e.getX();
	int click_y = e.getY();
	int[] casilla = convertirCoordenadasACasilla(click_x, click_y);

	
	actualizarse(casilla[0], casilla[1]);
//	this.ultima_fila = casilla[0];
//	this.ultima_columna = casilla[1];
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	public void nuevoTablero(int tamaño, Integer dif) 
	{
		// TODO Auto-generated method stub
		
		Tablero nuevo_tablero = new Tablero(tamaño);
		nuevo_tablero.desordenar(dif);
		this.juegotablero = nuevo_tablero;
		repaint();
		
	}
	
	

	

	


}
