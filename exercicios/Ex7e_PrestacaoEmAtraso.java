package exercicios;

import java.util.Scanner;

/*7e e) Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, 
 * utilizando a f�rmula PRESTACAO <- VALOR + (VALOR * TAXA/100) * TEMPO)*/

public class Ex7e_PrestacaoEmAtraso {
	
	public static void main(String[] args) {
		
        Scanner leitura = new Scanner(System.in);
		
		double valorPrestacao, valorTaxaReajuste, valorPrestacaoReajustado;
		
		System.out.println("Informe o valor da presta��o: ");
		valorPrestacao = leitura.nextDouble();
		
		System.out.println("Informe o valor da taxa de reajuste (s� o n�mero sem o %)");
		valorTaxaReajuste = leitura.nextDouble();
		
		valorPrestacaoReajustado = (valorPrestacao + (valorPrestacao * valorTaxaReajuste/100));
	
		System.out.println("O valor da presta��o em atraso � de: R$" + valorPrestacaoReajustado);
	}

}
