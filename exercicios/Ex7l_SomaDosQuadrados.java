package exercicios;

import java.util.Scanner;

/*7l Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
soma dos quadrados dos três valores lidos.*/

public class Ex7l_SomaDosQuadrados {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double a, b, c, somaDosQuadrados;
		
		System.out.println("Informe o valor de A: ");
		a = leitura.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		b = leitura.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		c = leitura.nextDouble();
		
		somaDosQuadrados = Math.pow(a, 2) + Math.pow(b,  2) + Math.pow(c, 2);
		
		System.out.println("A soma dos quadrados dos 3 valores é de: " + somaDosQuadrados);
			
	}

}
