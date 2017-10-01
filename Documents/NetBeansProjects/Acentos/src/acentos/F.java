package acentos;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class F  {
	/*Constante que representa o número 5.*/
	private static final int CONS_05 = 5;
	/*Constante que representa o número 7.*/
	private static final int CONS_07 = 7;
	/*Constante que representa o número 4.*/
	private static final int CONS_04 = 4;
	// String que recebe a mensagem digitada.
	String msg;
	// Array de Strings com 5 letras.
	String letrasCorretas[] = new String[CONS_05];
	// Array de Strings para as letras digitadas no caso de serem 7 tentativas.
	String letrasDigitadas[] = new String[CONS_07];
        //char letrasAlfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
        //'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	/**
	 * Método que adiciona as cinco letras digitadas no array letrasDigitadas.
	 */
	void adicionaLetras() {
		int i = 0;
		int letra = 0;
		while (i < CONS_05) {
			msg = JOptionPane.showInputDialog("Digite a letra " + ++letra);
			if (letrasCorretas.length <= CONS_05) {
				letrasCorretas[i] = msg;
				i++;
			} else {
				System.out.println("A palavra é de cinco letras.");
			}
		}
	}
	/**
	 * Método que recebe as tentativas digitadas e verifica se existe a letra
	 * digitada na palavra.
	 */
	void letrasDigitadas() {
		int tentativa = 0;
		int i = 0;
		int acertos = 0;
		int erros = 0;
		while (i < CONS_07) {
			msg = JOptionPane.showInputDialog("Digite uma letra. Essa é sua "
					+ ++tentativa + " tentativa de 7.");
			letrasDigitadas[i] = msg;
			for (int x = 0; x < letrasCorretas.length; x++) {
				if (letrasCorretas[x].equals(letrasDigitadas[i])) {
					JOptionPane.showMessageDialog(null, "Letra Correta");
					++acertos;
					break;
				} else {
					if (x == CONS_04) {
						JOptionPane.showMessageDialog(null, "Letra Incorreta");
						++erros;
					}
				}
			}
			i++;
		}
		JOptionPane.showMessageDialog(null, "Você teve " + acertos + " acertos e " + erros + " erros.");
	}
    

}
