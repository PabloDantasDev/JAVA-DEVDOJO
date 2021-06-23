package EstruturasCondicionaisLogicaProgramação;

import java.util.Scanner;

public class CondicionaisAula1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual sua Idade?");
		idade = ler.nextInt();
		
		if(idade >18 ) {
			System.out.println("Você é maior de Idade!");
	
		}else {
			System.out.println("Você ainda não é menor de idade!");
			
		}
		
		
		
		
		

		
	}

}
