package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class PanelOpciones extends JPanel
{
	private SeleccionMultiple dificultades;
	
	private Integer tama�o;
	
	
	

	public PanelOpciones()
	{
		Color colorAzul = new Color(80, 150, 255);
		this.setBackground(colorAzul);
		
		setLayout(new GridLayout(1, 4));
		
		dificultades = new SeleccionMultiple();
		
		
		JLabel tL = new JLabel();
		tL.setText("Tama�o:");
		
		JLabel dL = new JLabel();
		dL.setText("Dificultad:");

		
		
		JComboBox combo = new JComboBox();
		combo.addItem("3x3");
		combo.addItem("5x5");
		combo.addItem("7x7");
		combo.addItem("9x9");
		
		// Accion a realizar cuando el JComboBox cambia de item seleccionado.
		combo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						setTama�o(combo.getSelectedItem().toString());
					}
		});
		
		
		add(tL);
		add(combo);
		add(dL);
		add(dificultades);
		
		
	}
	
	public Integer getDificultad_Entero()
	{
		Integer dif = 1;
		String dific = dificultades.getDificultad();
		if("medio".equals(dific))
		{
			dif = 2;
		}
		else if("dificil".equals(dific))
		{
			dif = 3;
		}
		
		
		
		return dif;
	}
	
	public void setTama�o(String tam)
	{	
		this.tama�o = Integer.parseInt(String.valueOf(tam.charAt(0)));
	}
	
	public int getTama�o()
	{
		return this.tama�o;
	}
}
