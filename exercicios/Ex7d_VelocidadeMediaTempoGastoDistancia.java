package exercicios;

import java.util.Scanner;

/*d. Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, 
 * utilizando um autom�vel que faz 12 km por litro. 
 * Para obter o c�lculo, o usu�rio deve fornecer 
 * o tempo gasto (TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem. 
 * Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula 
 * DISTANCIA <- TEMPO * VELOCIDADE. 
 * Possuindo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem
 *  com a f�rmula LITROS_USADAS <- DISTANCIA / 12. Ao final,
 *   o programa deve apresentar os valores de velocidade m�dia (VELOCIDADE), 
 *   tempo gasto na viagem (TEMPO), 
 *   a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

public class Ex7d_VelocidadeMediaTempoGastoDistancia {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double tempoGasto, velocidadeMedia, distanciaPercorrida, litrosUsados;
		
		System.out.println("Informe o tempo gasto na viagem: ");
		tempoGasto = leitura.nextDouble();
		
		System.out.println("Informe a velocidade m�dia: ");
		velocidadeMedia = leitura.nextDouble();
		
		distanciaPercorrida = tempoGasto * velocidadeMedia;
		litrosUsados = distanciaPercorrida / 12;
		
		System.out.println("A velocidade m�dia � de: " + velocidadeMedia +
				           "\nO tempo gasto � de: " + tempoGasto + 
				           "\nA dist�ncia percorrida � de: " + distanciaPercorrida +
				           "\nA quantidade de litros usados � de: " + litrosUsados);
		
	}

}
