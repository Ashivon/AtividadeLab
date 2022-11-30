package Exercícios;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Botao implements ActionListener{
	public Teclado teclado;
	public JLabel label;
	
	public Botao(Teclado teclado, JLabel label) {
		this.teclado=teclado;
	}
	
	public JButton CriarBotao(String texto) {
		JButton botao=new JButton();
		botao.addActionListener((ActionListener) this);
		
		if(texto=="AMARELO") {
			botao.setBackground(Color.YELLOW);
			botao.setText(texto);
		}
		if(texto=="VERDE") {
			botao.setBackground(Color.GREEN);
			botao.setText(texto);
		}
		if(texto=="AZUL") {
			botao.setBackground(Color.BLUE);
			botao.setText(texto);
		}
		
		return botao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();
		
		if(botao.getText()=="AMARELO") {
			teclado.setBackground(Color.YELLOW);
		}
		if(botao.getText()=="VERDE") {
			teclado.setBackground(Color.GREEN);
		}
		if(botao.getText()=="AZUL") {
			teclado.setBackground(Color.BLUE);
		}
	}
}
