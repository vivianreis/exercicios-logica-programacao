package exercicios;

import java.util.Scanner;

/*7m Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
quadrado da soma dos três valores lidos.*/

public class Ex7m_QuadradoDaSoma {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double a, b, c, soma, quadradoDaSoma;
		
		System.out.println("Informe o valor de A: ");
		a = leitura.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		b = leitura.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		c = leitura.nextDouble();
		
		soma = a + b + c;
		quadradoDaSoma = Math.sqrt(soma);
		
		System.out.println("O quadrado da soma dos 3 valores lidos é de: " + quadradoDaSoma);

	}

}
