package interfaz;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;


public class PanelTablero extends JPanel
{
	private Tablero tablero;
	
	public PanelTablero(int tamaño, int dificultad) 
	{
		Tablero nuevo_tablero = new Tablero(tamaño);
		nuevo_tablero.desordenar(dificultad);
		this.tablero = nuevo_tablero;
		
	}
	
	
	public Tablero getTablero()
	{
		return this.tablero;
	}


	public void actualizarse() 
	{
		//usar darTablero
		
		//esto se debe llamar cada vez que escogen un bombillo
		
	}
	


}
