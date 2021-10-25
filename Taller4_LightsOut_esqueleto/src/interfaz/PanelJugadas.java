package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class PanelJugadas extends JPanel
{
	private String jugadas;
	private String nombre;
	private JLabel jugadasL;
	private JLabel nombreL;
	
	public PanelJugadas(Integer jugadas, String nombre)
	{
		this.jugadas = jugadas.toString();
		this.nombre = nombre;
		
		setLayout(new GridLayout(1, 4));
		
		jugadasL = new JLabel();
		jugadasL.setText(this.jugadas);
		jugadasL.setBorder( new MatteBorder(1, 0, 1, 1, Color.BLACK) );
		
		nombreL = new JLabel();
		nombreL.setText(nombre);
		nombreL.setBorder( new MatteBorder(1, 0, 1, 1, Color.BLACK) );
		
		JLabel nL = new JLabel();
		nL.setText("Jugador:");
		nL.setBorder( new MatteBorder(1, 0, 1, 1, Color.BLACK) );
		
		JLabel jL = new JLabel();
		jL.setText("Jugadas:");
		jL.setBorder( new MatteBorder(1, 1, 1, 1, Color.BLACK) );
		
		add(jL);
		add(jugadasL);
		add(nL);
		add(nombreL);
		
		
	}
	
	public void actualizarJugadas(Integer jugadas)
	{
		this.jugadas = jugadas.toString();
	}
	
	public void actualizarJugador(String jugador)
	{
		this.nombre = jugador;
	}
	
	
}
