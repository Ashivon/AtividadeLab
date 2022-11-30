package Exercícios;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Interfac extends JPanel{
	public Teclas teclado;
	public JLabel label;
	
	public Interfac(Teclas teclado) {
		label = new JLabel();
		label.setText(teclado.text);
		
		this.teclado=teclado;
		this.teclado.label=label;
		
		setLayout(new BorderLayout());
		add(label, BorderLayout.NORTH);
		add(teclado, BorderLayout.SOUTH);
	}
}
