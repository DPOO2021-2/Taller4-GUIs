package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JPanel;



public class PanelMenu extends JPanel implements ActionListener
{
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	
	private VentanaJuego padre;
	
	public PanelMenu(VentanaJuego padre) 
	{
		this.padre = padre;
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
		boton1.setActionCommand("nuevo");
		boton1.addActionListener(this);
		boton1.setBackground(colorAzul);
		
		boton2 = new JButton("REINICIAR");
		boton2.setActionCommand("reiniciar");
		boton2.addActionListener(this);
		boton2.setBackground(colorAzul);
		
		boton3 = new JButton("TOP 10");
		boton3.setActionCommand("top10");
		boton3.addActionListener(this);
		boton3.setBackground(colorAzul);
		
		boton4 = new JButton("CAMBIAR JUGADOR");
		boton4.setActionCommand("cambiar_jugador");
		boton4.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if("nuevo".equals(comando))
		{
			padre.nuevoTablero();
		}
		else if("reiniciar".equals(comando))
		{
			padre.reiniciar();
		}
		else if("top10".equals(comando))
		{
			padre.mostrarTop10();
		}
		else if("cambiar_jugador".equals(comando))
		{
			padre.cambiarJugador();
		}
		
		
		
	}
}




