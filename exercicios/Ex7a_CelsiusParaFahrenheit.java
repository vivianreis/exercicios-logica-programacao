package exercicios;

import java.util.Scanner;

/* Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
 * A fórmula de conversão é F <- (9 * C + 160)/5, 
 * sendo F temperatura em Fahrenheit e C a temperatura em Celsius. 
 * Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
 * A fórmula de conversão é F <- (9 * C + 160)/5, sendo F temperatura em Fahrenheit e C a temperatura em Celsius.*/


public class Ex7a_CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double celsius;
		double conversaoParaFahrenheit;
		
		System.out.println("Digite o valor em graus Celsius: ");
		celsius = leitura.nextFloat();
		
		conversaoParaFahrenheit = 1.8 * celsius + 32;
		
		System.out.println("O valor em fahrenheit é de: " + conversaoParaFahrenheit + " ºF");
	}
}
