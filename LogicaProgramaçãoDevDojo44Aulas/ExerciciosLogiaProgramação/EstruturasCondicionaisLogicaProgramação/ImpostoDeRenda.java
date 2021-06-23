package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;

class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario;
		
		System.out.println("Qual Seu salario");
		salario = ler.nextDouble();

		if (salario <= 1993.98) {

			System.out.println(
					"De Acordo com a Tabela Para o Imposto de Renda, o valor do Seu salario está inseto de Imposto!");

		}

		else if (salario >= 1993.99 && salario <= 2826.65) {
			System.out.println("De acorodo com a tabela para imposto de renda o seu salario tem uma taxa de importo de 7.5% "+ salario * 7.5 / 100);
		}

		
		else if(salario >=2826.66 && salario <=3751.05) {
			
			System.out.println("De acorodo com a tabela para imposto de renda o seu salario tem uma taxa de importo de 15% " + salario*15/100 );
			
		}
		
		else if(salario >=3751.06 && salario <=4664.68) {
			
			System.out.println("De acorodo com a tabela para imposto de renda o seu salario tem uma taxa de importo de 22.5% " + salario*22.5/100 );

	}
		
		else if(salario >=4664.96) {
			
			System.out.println("De acorodo com a tabela para imposto de renda o seu salario tem uma taxa de importo de 27.5% " + salario*27.5/100 );

		}
	}
}
