package exercicios;

import java.util.Scanner;

/*d. Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
 * utilizando um automóvel que faz 12 km por litro. 
 * Para obter o cálculo, o usuário deve fornecer 
 * o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. 
 * Desta forma, será possível obter a distância percorrida com a fórmula 
 * DISTANCIA <- TEMPO * VELOCIDADE. 
 * Possuindo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem
 *  com a fórmula LITROS_USADAS <- DISTANCIA / 12. Ao final,
 *   o programa deve apresentar os valores de velocidade média (VELOCIDADE), 
 *   tempo gasto na viagem (TEMPO), 
 *   a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

public class Ex7d_VelocidadeMediaTempoGastoDistancia {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double tempoGasto, velocidadeMedia, distanciaPercorrida, litrosUsados;
		
		System.out.println("Informe o tempo gasto na viagem: ");
		tempoGasto = leitura.nextDouble();
		
		System.out.println("Informe a velocidade média: ");
		velocidadeMedia = leitura.nextDouble();
		
		distanciaPercorrida = tempoGasto * velocidadeMedia;
		litrosUsados = distanciaPercorrida / 12;
		
		System.out.println("A velocidade média é de: " + velocidadeMedia +
				           "\nO tempo gasto é de: " + tempoGasto + 
				           "\nA distância percorrida é de: " + distanciaPercorrida +
				           "\nA quantidade de litros usados é de: " + litrosUsados);
		
	}

}
