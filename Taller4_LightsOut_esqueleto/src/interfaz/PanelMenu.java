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
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		
		JPanel panelm1 = new JPanel();
		JPanel panelm2 = new JPanel();
		JPanel panelm3 = new JPanel();
	
		boton1 = new JButton("NUEVO");
		boton1.setBackground(colorAzul);
		boton2 = new JButton("REINICIAR");
		boton2.setBackground(colorAzul);
		boton3 = new JButton("TOP 10");
		boton3.setBackground(colorAzul);
		boton4 = new JButton("CAMBIAR JUGADOR");
		boton4.setBackground(colorAzul);
		
		setLayout(new GridLayout(13, 1));
		add(panel);
		add(panel2);
		add(panel3);
		add(boton1);
		add(panelm1);
		add(boton2);
		add(panelm2);
		add(boton3);
		add(panelm3);
		add(boton4);
		add(panel4);
		add(panel5);
		add(panel6);
	}
}
