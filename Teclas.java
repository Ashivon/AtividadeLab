package Exercícios;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teclas extends JPanel{
	public JPanel painel;
	public JLabel label;
	public String text;
	
	public Teclas() {
		text="Aperte um botão para imprimir:";
		add(Createbotoes());
	}
	
	public JPanel Createbotoes() {
		painel = new JPanel();
		Botones botons = new Botones(this, label);
		
		painel.setLayout(new GridLayout(2, 3));
		
		painel.add(botons.Criar("Java"));
		painel.add(botons.Criar("JavaScript"));
		painel.add(botons.Criar("Python"));
		painel.add(botons.Criar("C++"));
		painel.add(botons.Criar("C#"));
		painel.add(botons.Criar("C"));
		
		return painel;
	}
}
