package LaçosDeRepetiçãoWhile;
import java.util.Scanner;
class ExercicioLogin {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner (System.in);
		
			String login ="Pablo";
			String senha ="1996";
			boolean tela =true;
		
			while(tela) {
			
			System.out.println("Qual Seu Login?");
			 login =ler.next();
			System.out.println("Qual A Senha?");
			 senha = ler.next();
			
			if(login.equals("Pablo") && senha.equals("1996")) {
				System.out.println("Acesso Concedido");
				tela=false;
					break;
				
			}
				System.out.println("invalido");
				
		}
			System.out.println("FIM DO PROGRAMA");
		}
			
	}

	

