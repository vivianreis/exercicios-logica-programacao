package exercicios;

import java.util.Scanner;

/*7k Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário, para que seja apresentado o valor em moeda americana.*/

public class Ex7k_RealParaDolar {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double cotacao, quantidadeReais, conversaoParaDolar; 
		
		System.out.println("Informe a cotação do dólar (ex: 4,50): ");
		cotacao = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de Reais que deseja converter para dólar: ");
		quantidadeReais = leitura.nextDouble();
		
		conversaoParaDolar = quantidadeReais/cotacao;
		
		System.out.println("O valor convertido para doláres é igual a: U$" + conversaoParaDolar);
		
	}

}
