package Exercícios;

public class Questao02 {

	public static void main(String[] args) {
		Teclas botoes = new Teclas();
		Interfac disp = new Interfac(botoes);
		Wind janela = new Wind(disp);
	}

}
