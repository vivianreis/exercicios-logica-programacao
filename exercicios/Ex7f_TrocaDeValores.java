package exercicios;

import java.util.Scanner;

/*7 f. Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
 * e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B 
 * e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
*/

//Corrigir depois para aceitar caractere

public class Ex7f_TrocaDeValores {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double a, b;
		
		System.out.println("Informe o primeiro valor: ");
		a = leitura.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		b = leitura.nextDouble();
		
		a = a + b;
		b = a - b;
		a = a - b;
	
		System.out.println("Valor trocado: A passou a ser: " + a +
				            "\nvalor trocado B passou a ser: " + b);		
	}

}
