package Exercícios;

public class Questao01 {

	public static void main(String[] args) {
		Teclado botoes = new Teclado();
		Display disp = new Display(botoes);
		Window janela = new Window(disp);
	}

}
