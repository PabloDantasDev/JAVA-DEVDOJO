package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;

public class CalculoDePorcentagemSalario {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		int salario;
		float porcentagem;
		int valor1;
		int valor2;
	

		System.out.println("========================================================================================");
		System.out.println("Informe o Valor do Seu Salario: ATENÇÂO: APENAS NUMEROS INTEIROS SEM VIRGULAS OU PONTO =");
		System.out.println("========================================================================================");
		System.out.println("Digite Aqui: ");
		salario = ler.nextInt();

		System.out.println("===============================");
		System.out.println("Digite o Valor da Porcentagem =");
		System.out.println("===============================\n");
		System.out.println("Digite Aqui: ");
		porcentagem = ler.nextFloat();
	
		System.out.println("===================================================================\n");	
		System.out.println(" O valor do seu Salario Mais a Porcentagem é de  + R$ " + salario * porcentagem / 100 + " Reais \n" );
		System.out.println("====================================================================");
		
		System.out.println("=========================================================");
		System.out.println("Vamos Calcular o valor total do Seu Salario + Acrescimo =");
		System.out.println("=========================================================\n");
		
		System.out.println("===================================");
		System.out.println("Informe o Valor do Seu Salario:   =");
		System.out.println("===================================\n");
		System.out.println("Digite Aqui: ");
		valor1 = ler.nextInt();
					
		System.out.println("===============================================================");
		System.out.println("Informe o Valor do acrescimo: ATENÇÂO : SEM PONTO OU VIRGULA  =");
		System.out.println("===============================================================");
		System.out.println("Digite Aqui");
		valor2 = ler.nextInt();
		System.out.println("Valor Total do Seu Salario é de:");
		System.out.println( valor1 + valor2 + " Reais");
		
		
	
		
	
		
	}

}

/*
 * import java.util.Sca; import java.util.Scanner; // 1. importando a classe
 * Scanner
 * 
 * public class CalculoDePorcentagemSalario {
 * 
 * public static void main(String[] args) { Scanner ler = new
 * Scanner(System.in); // 2. instanciando e criando um objeto Scanner int idade;
 * String nome;
 * 
 * System.out.printf("Informe a sua idade:\n"); idade = ler.nextInt(); // 3.
 * entrada de dados (lendo um valor inteiro)
 * 
 * ler.nextLine(); // esvazia o buffer do teclado
 * 
 * System.out.printf("\nInforme o seu nome:\n"); nome = ler.nextLine(); // 3.
 * entrada de dados (lendo uma String)
 * 
 * System.out.printf("\nResultado:\n"); System.out.printf("%s tem %d anos.\n",
 * nome, idade); }
 * 
 * }
 * 
 */