package interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatLightLaf;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;


public class VentanaJuego extends JFrame
{
	//modelo:
	private Top10 top10;
	
	//
	
	//paneles
	private PanelTablero pTablero;
	private PanelMenu pMenu;
	private PanelJugadas pJugadas;
	private PanelOpciones pOpciones;
	

	
	
	//facil, medio, dificil = 1,2,3
	
	public VentanaJuego()
	{
		top10 = new Top10();
		top10.cargarRecords(new File("data/top10.csv"));
		
		
		
		

		String nombre_jugador = pedirNombreJugador();
		
		
		// el primer tablero se pone en tamaño=5, dificultad = facil
		
		pTablero = new PanelTablero(this, 3, 1);
		//---
		
		
		
		
		pMenu = new PanelMenu(this);
		pJugadas = new PanelJugadas(pTablero.getTablero().darJugadas(), nombre_jugador);
		pOpciones = new PanelOpciones();
		
		pack();
		setTitle("LightsOut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
//		setLocationRelativeTo(null);
		setResizable(true);
		
		setSize(900, 500);
		
		
		setLayout(new BorderLayout());
		add(pMenu, BorderLayout.EAST);
		
		add(pTablero, BorderLayout.CENTER);
		add(pOpciones, BorderLayout.NORTH);
		add(pJugadas, BorderLayout.SOUTH);
		
		
		
		

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				try {
					salvarTop10();
				} catch (FileNotFoundException | UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
	}
	
	public void salvarTop10() throws FileNotFoundException, UnsupportedEncodingException
	{
		top10.salvarRecords(new File("data/top10.csv"));
	}
	
	public String pedirNombreJugador() 
	{
		String nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre:");
		
		//abrir nueva ventana con textbox que pide el nombre y aqui se retorna
		return nombre;
	}

	
	public void cambiarJugador()
	{
		String nombre_jugador = pedirNombreJugador();
		
		if(nuevoTablero())
		{
			pJugadas.actualizarJugador(nombre_jugador);
		}
	}
	
	public void reiniciar()
	{
		pTablero.getTablero().reiniciar();
		pTablero.actualizarse();
		
	}

	public boolean nuevoTablero() 
	{
		Integer dif = pOpciones.getDificultad_Entero();
		if (dif == null)
		{
			//mostrar un JLabel textual que diga: debes escoger primeor la dificultad
			JOptionPane.showMessageDialog(this, "Debes escoger primero la dificultad.","Error",
					JOptionPane.INFORMATION_MESSAGE);
			return false;
			
		}
		else
		{
			pTablero = new PanelTablero(this, pOpciones.getTamaño(), dif);
			add(pTablero, BorderLayout.CENTER);
			return true;
		}
		
		
		
	}
	
	
	
	public void mostrarTop10()
	{
		//sacar una nueva ventana que muestre el top10
	}
	
	public void jugar()
	{
		//este metodo se debe llamar cada vez que PanelTablero reciba una jugada
		// aqui se deben  actualizar toda la info de todos los paneles que cambien
		//en cada jugada: por jeemplo jugadas en el panel pJugadas (creo que es solo esa)
		
	}

	
	
	
	
	/* cada vez que se llama al metodo local jugar() (falta hacerlo): llamar a pJugadas.actualizarJugadas()
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * domingo 8:30 pm: 
	 * 
	 * 
	 * 
	 * 4. Falta hacer la ventana que muestra el top 10
	 * 
	 * 
	 * 5. Falta haver todo el PanelTablero por dentro
	 * 
	 * 6. Falta verificar cuando gana el jugador: esto se hara dentro del metodo local jugar que se llama 
	 * cuada vez que PanelTablero recibe una jugada
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		new VentanaJuego();
		
		FlatLightLaf.install();
		
	}
	
}
