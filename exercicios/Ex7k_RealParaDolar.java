package exercicios;

import java.util.Scanner;

/*7k Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em
real. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel
com o usu�rio, para que seja apresentado o valor em moeda americana.*/

public class Ex7k_RealParaDolar {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double cotacao, quantidadeReais, conversaoParaDolar; 
		
		System.out.println("Informe a cota��o do d�lar (ex: 4,50): ");
		cotacao = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de Reais que deseja converter para d�lar: ");
		quantidadeReais = leitura.nextDouble();
		
		conversaoParaDolar = quantidadeReais/cotacao;
		
		System.out.println("O valor convertido para dol�res � igual a: U$" + conversaoParaDolar);
		
	}

}
