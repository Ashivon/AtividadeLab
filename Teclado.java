package Exercícios;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teclado extends JPanel{
	public JPanel painel;
	public JLabel label;
	
	public Teclado() {
		setBackground(Color.CYAN);
		add(CriarBotoes());
	}
	
	public JPanel CriarBotoes() {
		painel= new JPanel();
		Botao botao= new Botao(this, label);
		
		painel.setLayout(new GridLayout(1, 3));
		
		painel.add(botao.CriarBotao("AMARELO"));
		painel.add(botao.CriarBotao("VERDE"));
		painel.add(botao.CriarBotao("AZUL"));
		
		//painel.setBackground(botao.label.getBackground());
		return painel;
	}
}
