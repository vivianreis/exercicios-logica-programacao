package exercicios;

import java.util.Scanner;

/*7c Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
 *  Volume <- PI * Raio² * Altura*/

public class Ex7c_VolumeDoCilindro {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		final double pi = 3.14;
		double raio, altura, volumeCilindro;
		
		System.out.println("Informe o valor o raio: ");
		raio = leitura.nextDouble();
		
		System.out.println("Informe o valor da altura: ");
		altura = leitura.nextDouble();
		
		
		volumeCilindro = pi * Math.pow(raio,  2) * altura;
		
		System.out.println("O volume da lata de óleo é de: " + volumeCilindro);

	}
}
