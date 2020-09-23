package exercicios;

import java.util.Scanner;

/*7i Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
segundo.*/

public class Ex7i_QuadradoDiferenca {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int a, b, diferenca, quadradoDiferenca;
		
		System.out.println("Informe o valor de A: ");
		a = leitura.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = leitura.nextInt();
		
		diferenca = a - b;
		quadradoDiferenca = (int) Math.pow(diferenca, 2);
		
		System.out.println("O resultado do quadrado da diferença do primeiro valor(A) pelo segundo(B) é: " + quadradoDiferenca);
		
	}

}
