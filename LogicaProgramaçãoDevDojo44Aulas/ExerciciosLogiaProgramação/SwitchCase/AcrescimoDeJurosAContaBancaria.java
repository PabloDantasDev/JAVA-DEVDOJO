/*Como gerente eu gostaria que meus usu�rios pudessem
 * digita o tipo de conta e o sisteme imprima qual porcentagem de juros
 * aquela conta ir� oferecer para o cliente, para agilizar o acessoas informa��es.
 * Os tipo de ccontas s�o:
 * CONTA_POUPAN�A 0.05%
 * CONTA_CONRRENTE 0.02%
 * CONTA_INVESTIMENTO 0.1%
*/

package SwitchCase;

import java.util.Scanner;

class AcrescimoDeJurosAContaBancaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int conta;

		System.out.println(
				"Qual Tipo da Sua Conta : POUPAN�A DIgite ( 1 ) | CORRENTE Digite ( 2 ) | INVESTIMENTO Digite ( 3 )");
		conta = ler.nextInt();

		switch (conta) {
		case 1:
			System.out.println("Tipo de Conta POUPAN�A Receber� 0.05% de Juros");
			break;
		}
		switch (conta) {
		case 2:
			System.out.println("Tipo de Conta CORRENTE Receber� 0.02% de Juros");
			break;
		}
		switch (conta) {
		case 3:
			System.out.println("Tipo de Conta INVESTIMENTO Receber� 0.1% de Juros");
			break;
			
			
		}
		 System.out.println("Fim do Progama");

	}
}
