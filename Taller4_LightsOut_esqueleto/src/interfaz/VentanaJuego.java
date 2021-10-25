package interfaz;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;

import javax.swing.JFrame;

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
		
		
		
		
//		cambiarJugador();
		
		
		// el primer tablero se pone en tamaño=5, dificultad = facil
		pTablero = new PanelTablero(3, 1);
		//---
		
		
		
		
		pMenu = new PanelMenu();
		pJugadas = new PanelJugadas(pTablero.getTablero().darJugadas(), "A");
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
	}
	
	public String pedirNombreJugador() 
	{
		
		//abrir nueva ventana con textbox que pide el nombre y aqui se retorna
		return null;
	}

	public static void main(String[] args) 
	{
		new VentanaJuego();
		
	}
	
	
	public void cambiarJugador()
	{
		String nombre_jugador = pedirNombreJugador();
		pJugadas.actualizarJugador(nombre_jugador);
		nuevoTablero();
		
		
		//esto debe llamarse cuando se oprime el boton "cambiarjugador"
	}

	public void nuevoTablero() 
	{
		Integer dif = pOpciones.getDificultad_Entero();
		if (dif.equals(null))
		{
			//mostrar un JLabel textual que diga: debes escoger primeor la dificultad
		}
		else
		{
			pTablero = new PanelTablero(pOpciones.getTamaño(), dif);
			add(pTablero, BorderLayout.CENTER);
		}
		
		//esto debe llamarse cuando se oprime el boton "nuevo"
		
		
	}
	
	public void reiniciar()
	{
		pTablero.getTablero().reiniciar();
		pTablero.actualizarse();
		
		//esto debe llamarse cuando se oprime el boton "reiniicar"
		
	}
	
	public void mostrarTop10()
	{
		//sacar una nueva ventana que muestre el top10
		//esto se debe llamar cuando se oprime el boton "top10"
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
	 * 1. falta hacer los setAction Command de los botones del Este (panelMenu)
	 * 2. falat hacer la ventana que dice escoge dificultad : linea103
	 * 3. Falta hacer la ventana que pide el nombre del jugador nuevo : linea78
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
	
}
