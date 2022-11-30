package Exercícios;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Wind extends JFrame{
	public JPanel painel;

	public Wind(JPanel disp) {
		setSize(400, 300);
		this.painel=disp;
		add(disp);
		setVisible(true);
	}
}
