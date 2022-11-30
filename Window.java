package Exercícios;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class Window extends JFrame{
	public JPanel painel;

	public Window(JPanel disp) {
		setSize(400, 300);
		this.painel=disp;
		add(disp);
		setVisible(true);
	}
}
