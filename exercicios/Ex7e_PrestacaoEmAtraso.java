package exercicios;

import java.util.Scanner;

/*7e e) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, 
 * utilizando a fórmula PRESTACAO <- VALOR + (VALOR * TAXA/100) * TEMPO)*/

public class Ex7e_PrestacaoEmAtraso {
	
	public static void main(String[] args) {
		
        Scanner leitura = new Scanner(System.in);
		
		double valorPrestacao, valorTaxaReajuste, valorPrestacaoReajustado;
		
		System.out.println("Informe o valor da prestação: ");
		valorPrestacao = leitura.nextDouble();
		
		System.out.println("Informe o valor da taxa de reajuste (só o número sem o %)");
		valorTaxaReajuste = leitura.nextDouble();
		
		valorPrestacaoReajustado = (valorPrestacao + (valorPrestacao * valorTaxaReajuste/100));
	
		System.out.println("O valor da prestação em atraso é de: R$" + valorPrestacaoReajustado);
	}

}
