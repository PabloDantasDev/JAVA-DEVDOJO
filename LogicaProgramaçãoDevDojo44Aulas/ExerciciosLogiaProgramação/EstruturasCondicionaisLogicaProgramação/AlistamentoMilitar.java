package EstruturasCondicionaisLogicaProgramação;
/*SE O SEXO FOR MASCULINO E AIDADE FOR MAIOR OU IGUAL A 18 IMPRIMA ALISTAMENTO OBRIGATORIO
 * SE O SEXO FOR MAS CULINO E A IDADE FOR MENOR QUE 18 IMPRIMA ALISTAMENTO NAO PERMITIDO
 * SE O SEXO FOR FEMININO E A IDADE FOR MAISR IGUAL A 18 IMPRIMA DESEJA SE ALISTAR
 * SE O SEXO FOR FEMININO E A IDADE FOR MENOR QUE 18 IMPRIMA ALISTAMENTO NAO PERMITIDO 
*/

import java.util.Scanner;


class AlistamentoMilitar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			String sexo;
			int idade;
			
			System.out.print("Qual Seu Sexo: [F] ou [M] ");
			sexo =ler.next();
			
			System.out.println("Qual Sua Idade?");
			idade =ler.nextInt();
			
			if(sexo.equalsIgnoreCase("m") && idade  < 18) {
				System.out.println("Alistamento não Permitido");
			
			}else if (sexo.equalsIgnoreCase("m") && idade >=18 ) {
				System.out.println("Alistamento Obrigatorio");
				
			}else if(sexo.equalsIgnoreCase("f")&& idade >=18) {
				System.out.println("Alistamento Não Permitido");
				
			}else if(sexo.equalsIgnoreCase("f")&& idade <18) {
				System.out.println("Gostaria de se alista?");
			}
		}
		
		
		
		}
			
		
		
		
		
		
		
		

	


