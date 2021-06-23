package EstruturasCondicionaisLogicaProgramação;
/*
public class CalculadorDiferencaIdade {
	public static void main(String[] args) {

		int idadeGracy = 40;
		int idadePablo = 25;
		int diferencaIdade = idadeGracy - idadePablo;

		String nome1 = "Pablo Henrique";
		String nome2 = "Gracy Algoz";

		System.out.println("A diferença de idade entre  " + nome2 + " " + idadeGracy + " e seu namorado " + nome1 + " "
				+ idadePablo + " é de ");
		System.out.println(diferencaIdade + " Anos de Diferença");

	}
}
*/

import java.util.Scanner;
public class CalculadorDiferencaIdade{
	
	public static void main(String []args) {
		Scanner ler = new  Scanner(System.in);
		
		int salario;
		float resultado1;
		float resultado2;
		
		System.out.println("Qual seu salario:");
		salario =ler.nextInt();
		
		resultado1=salario*0.30F;
				
				if(salario <= 4500) {
					System.out.println(salario-resultado1);	
				}
				
				
				else {
					resultado2=salario*0.15F;
					System.out.println(salario-resultado2);
					
				}
		
		
;
		
		
		
		
		
		
	}
	
	
	
}