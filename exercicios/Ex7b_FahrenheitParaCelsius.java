package exercicios;

import java.util.Scanner;

/* 7b Ler uma temperatura em graus Fahrenheit e apresent�-la convertida em graus Celsius.
 *  A f�rmula de convers�o � C <- (F - 32) * (5/9),
 *  sendo F temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class Ex7b_FahrenheitParaCelsius {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		double fahrenheit, conversaoParaCelsius;
		
		System.out.println("Digite o valor da temperatura em farenheit: ");
		fahrenheit = leitura.nextDouble();
		
		conversaoParaCelsius = (fahrenheit - 32) / 1.8;
		
		System.out.println("A temperatura em Celsius � de: " + conversaoParaCelsius + "�C");	
			
	}

}
