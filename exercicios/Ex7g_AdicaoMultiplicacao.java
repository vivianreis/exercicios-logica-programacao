package exercicios;

import java.util.Scanner;

/*7g - Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
multiplicação e apresentar doze resultados de saída. */

public class Ex7g_AdicaoMultiplicacao {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int valorA, valorB, valorC, valorD; 
		
		
		System.out.println("Informe o valor de A: ");
		valorA = leitura.nextInt();
		
		System.out.println("Informe o valor de B: ");
		valorB = leitura.nextInt();
		
		System.out.println("Informe o valor de C: ");
		valorC = leitura.nextInt();
		
		System.out.println("Informe o valor de D: ");
		valorD = leitura.nextInt();
		
		System.out.println("A soma de A + B: " + (valorA + valorB));
		System.out.println("A soma de A + C: " + (valorA + valorC));
		System.out.println("A soma de A + D: " + (valorA + valorD));
		System.out.println("A soma de B + C: " + (valorB + valorC));
		System.out.println("A soma de B + D: " + (valorB + valorD));
		System.out.println("A soma de C + D: " + (valorC + valorD));
		
		System.out.println("A multiplicação de A * B: " + (valorA * valorB));
		System.out.println("A multiplicação de A * C: " + (valorA * valorC));
		System.out.println("A multiplicação de A * D: " + (valorA * valorD));
		System.out.println("A multiplicação de B * C: " + (valorB * valorC));
		System.out.println("A multiplicação de B * D: " + (valorB * valorD));
		System.out.println("A multiplicação de C * D: " + (valorC * valorD));
		
	}
}
