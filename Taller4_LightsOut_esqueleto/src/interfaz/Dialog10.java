package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;


import com.formdev.flatlaf.FlatLightLaf;

import uniandes.dpoo.taller4.modelo.RegistroTop10;

public class Dialog10 extends JDialog
{
	private VentanaJuego padre;

	public Dialog10(VentanaJuego ventana) 
	{
		super(ventana, "Top 10", true);
		
		this.padre = ventana;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);
//		setSize(250, 400);
		
		Color colorAzul = new Color(80, 150, 255);
		
	
		
		Collection<RegistroTop10> registro10= padre.getTop10().darRegistros();
		
	
		
		JList listaTop10 = new JList(registro10.toArray());
		
		listaTop10.setBackground(colorAzul);
		listaTop10.setFont(new Font("Georgia", Font.ITALIC, 15));
		
		
		
		JScrollPane scroll = new JScrollPane(listaTop10);
		
		
		scroll.getVerticalScrollBar().setOpaque(false);
		
		add(scroll);
		pack();
		
		FlatLightLaf.install();
	}

}
