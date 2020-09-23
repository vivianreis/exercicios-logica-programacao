package exercicios;

import java.util.Scanner;

/*7j - Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário, para que seja apresentado o valor em moeda brasileira.*/
public class Ex7j_DolarParaReal {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);	
		double cotacao, quantidadeDolares, conversaoParaReal;
		
		System.out.println("Informe a cotação do dolar de hoje (Ex: 4.50): ");
		cotacao = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de dólares que deseja converter para real: ");
		quantidadeDolares = leitura.nextDouble();
		
	    conversaoParaReal = cotacao * quantidadeDolares;
	    
	    System.out.println("O valor convertido para Real é igual a: R$" + conversaoParaReal);
			
		
	}

}
