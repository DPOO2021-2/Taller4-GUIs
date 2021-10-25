package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;



public class PanelMenu extends JPanel
{
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	
	public PanelMenu() 
	{
		Color colorAzul = new Color(80, 150, 255);
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
	
		boton1 = new JButton("NUEVO");
		boton1.setBackground(colorAzul);
		boton2 = new JButton("REINICIAR");
		boton2.setBackground(colorAzul);
		boton3 = new JButton("TOP 10");
		boton3.setBackground(colorAzul);
		boton4 = new JButton("CAMBIAR JUGADOR");
		boton4.setBackground(colorAzul);
		
		setLayout(new GridLayout(6, 1));
		add(panel);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(panel2);
	}
}
