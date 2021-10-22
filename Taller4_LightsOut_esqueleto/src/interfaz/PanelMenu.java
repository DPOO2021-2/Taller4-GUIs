package interfaz;

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
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();
		
		setLayout(new GridLayout(4, 1));
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}
}
