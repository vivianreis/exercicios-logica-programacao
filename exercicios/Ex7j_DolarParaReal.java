package exercicios;

import java.util.Scanner;

/*7j - Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em
d�lar. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
dispon�vel com o usu�rio, para que seja apresentado o valor em moeda brasileira.*/
public class Ex7j_DolarParaReal {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);	
		double cotacao, quantidadeDolares, conversaoParaReal;
		
		System.out.println("Informe a cota��o do dolar de hoje (Ex: 4.50): ");
		cotacao = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de d�lares que deseja converter para real: ");
		quantidadeDolares = leitura.nextDouble();
		
	    conversaoParaReal = cotacao * quantidadeDolares;
	    
	    System.out.println("O valor convertido para Real � igual a: R$" + conversaoParaReal);
			
		
	}

}
