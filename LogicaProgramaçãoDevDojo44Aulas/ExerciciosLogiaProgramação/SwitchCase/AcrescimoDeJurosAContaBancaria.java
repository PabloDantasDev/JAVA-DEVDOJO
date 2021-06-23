/*Como gerente eu gostaria que meus usuários pudessem
 * digita o tipo de conta e o sisteme imprima qual porcentagem de juros
 * aquela conta irá oferecer para o cliente, para agilizar o acessoas informações.
 * Os tipo de ccontas são:
 * CONTA_POUPANÇA 0.05%
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
				"Qual Tipo da Sua Conta : POUPANÇA DIgite ( 1 ) | CORRENTE Digite ( 2 ) | INVESTIMENTO Digite ( 3 )");
		conta = ler.nextInt();

		switch (conta) {
		case 1:
			System.out.println("Tipo de Conta POUPANÇA Receberá 0.05% de Juros");
			break;
		}
		switch (conta) {
		case 2:
			System.out.println("Tipo de Conta CORRENTE Receberá 0.02% de Juros");
			break;
		}
		switch (conta) {
		case 3:
			System.out.println("Tipo de Conta INVESTIMENTO Receberá 0.1% de Juros");
			break;
			
			
		}
		 System.out.println("Fim do Progama");

	}
}
