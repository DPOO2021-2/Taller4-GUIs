package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SeleccionMultiple extends JPanel implements ChangeListener 
{
	private String dificultad;
	
	private JRadioButton boton_f, boton_m, boton_d;
    private ButtonGroup bg;
    
    
    public SeleccionMultiple()
    {
		Color colorAzul = new Color(80, 150, 255);
		
    	setLayout(new GridLayout(1, 3));
    	
    	bg=new ButtonGroup();
    	
        boton_f=new JRadioButton("Fácil");
        boton_f.addChangeListener(this);
        boton_f.setBackground(colorAzul);
        add(boton_f);
        bg.add(boton_f);
        
        boton_m=new JRadioButton("Medio");
        boton_m.addChangeListener(this);
        boton_m.setBackground(colorAzul);
        add(boton_m);
        bg.add(boton_m);
       
        boton_d=new JRadioButton("Difícil");
        boton_d.addChangeListener(this);
        boton_d.setBackground(colorAzul);
        add(boton_d);
        bg.add(boton_d);
    }

	@Override
	public void stateChanged(ChangeEvent e) 
	{
        if (boton_f.isSelected()) 
        {
        	setDificultad("facil");
        }
        if (boton_m.isSelected()) 
        {
        	setDificultad("medio");
        }
        if (boton_d.isSelected()) 
        {
        	setDificultad("dificil");
        }        
    }
	
	
	public String getDificultad()
	{
		return dificultad;
	}
	
	public void setDificultad(String dif)
	{
		this.dificultad = dif;
	}

}
