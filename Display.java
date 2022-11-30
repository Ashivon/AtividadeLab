package Exercícios;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel{
	public Teclado teclado;
	public JLabel label;
	
	public Display(Teclado teclado) {
		label = new JLabel();
		setBackground(teclado.getBackground());
		
		this.teclado=teclado;
		this.teclado.label=label;
		
		setLayout(new BorderLayout());
		add(label, BorderLayout.SOUTH);
		add(teclado, BorderLayout.NORTH);
	}
}
