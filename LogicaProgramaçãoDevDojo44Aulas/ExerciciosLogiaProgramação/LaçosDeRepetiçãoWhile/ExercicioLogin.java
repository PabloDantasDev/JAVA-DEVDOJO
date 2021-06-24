package LaçosDeRepetiçãoWhile;
import java.util.Scanner;
class ExercicioLogin {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
		String login ="Pablo";
		String senha ="1996";
		
		
		while(login.equals("Pablo")&&senha.equals("1996")) {
			
			System.out.println("Qual Seu Login?");
			login =ler.next();
			System.out.println("Qual A Senha?");
			senha = ler.next();
			
			if(login.equals("Pablo") && senha.equals("1996")) {
				System.out.println("Acesso Concedido");
				break;
				
			}else {
				System.out.println("invalido");
				
			}
			
		}



		}
	
		
	}

	

