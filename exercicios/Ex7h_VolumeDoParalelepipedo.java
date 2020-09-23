package exercicios;

import java.util.Scanner;

/*7h Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
VOLUME ← COMPRIMENTO * LARGURA * ALTURA.*/

public class Ex7h_VolumeDoParalelepipedo {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double comprimento, largura, altura, volume;
		
		System.out.println("Informe o comprimento da caixa: ");
		comprimento = leitura.nextDouble();
		
		System.out.println("Informe a largura da caixa: ");
		largura = leitura.nextDouble();
		
		System.out.println("Informe a altura da caixa: ");
		altura = leitura.nextDouble();
		
		volume = comprimento * largura * altura;
		
		System.out.println("O volume da caixa retangular é de: " + volume);
		
		
	}

}
