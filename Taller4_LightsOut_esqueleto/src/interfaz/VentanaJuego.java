package interfaz;

import java.awt.BorderLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.Tablero;


public class VentanaJuego extends JFrame
{
	private Tablero modelo;
	private PanelMenu pMenu;
	private PanelJugadas pJugadas;
	private PanelOpciones pOpciones;
	
	public VentanaJuego()
	{
		
		modelo = new Tablero(5);
		pMenu = new PanelMenu();
		
		pack();
		setTitle("LightsOut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		add(pMenu, BorderLayout.EAST);
		add(new JButton(), BorderLayout.CENTER);
		add(new JButton(), BorderLayout.NORTH);
		add(new JButton(), BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) 
	{
		new VentanaJuego();
	}
	
	
}
