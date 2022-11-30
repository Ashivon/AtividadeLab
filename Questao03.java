package Exercícios;

import javax.swing.JOptionPane;

public class Questao03 {
	static String texto;
	
	public static void main(String[] args) {
		texto=JOptionPane.showInputDialog("Digite uma mesagem:");
//		JOptionPane.showConfirmDialog(null, "TCHU", "Primeiro", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Sua mensagem foi:\n"+texto, "MENSAGEM DO USUÁRIO", JOptionPane.DEFAULT_OPTION);
	}

}
