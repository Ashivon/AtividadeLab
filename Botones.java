package Exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Botones implements ActionListener{
	public Teclas teclado;
	public String text;
	
	public Botones(Teclas teclado, JLabel label) {
		this.teclado=teclado;
		teclado=this.teclado;
	}
	
	public JButton Criar(String texto) {
		JButton botao = new JButton();
		botao.setText(texto);
		
		botao.addActionListener(this);
		
		return botao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botao =(JButton) e.getSource();
		
		if(botao.getText()=="Java") {
			text=botao.getText();
			teclado.label.setText(text);
		}
		if(botao.getText()=="JavaScript") {
			text=botao.getText();
			teclado.label.setText(text);
		}
		if(botao.getText()=="Python") {
			text=botao.getText();
			teclado.label.setText(text);
		}
		if(botao.getText()=="C++") {
			text=botao.getText();
			teclado.label.setText(text);
		}
		if(botao.getText()=="C#") {
			text=botao.getText();
			teclado.label.setText(text);
		}
		if(botao.getText()=="C") {
			text=botao.getText();
			teclado.label.setText(text);
		}
	}
}
