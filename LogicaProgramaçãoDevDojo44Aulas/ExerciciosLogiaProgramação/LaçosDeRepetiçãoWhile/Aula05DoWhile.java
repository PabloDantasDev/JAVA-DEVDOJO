package LaçosDeRepetiçãoWhile;
import java.util.Scanner;
class Aula05DoWhile {

	public static void main(String[] args) {
	Scanner ler =new Scanner (System.in);
	
	int n1=0;
	int n2=0;
	int desejaContinuar =1;
	
				
					do {
						
						System.out.println("PLAYER 1 : Digite um numero de 1 a 10");
						n1 = ler.nextInt();
						System.out.println("PLAYER 2 : Digite um numero de 1 a 10");
						n2 = ler.nextInt();
						
						if(n1==n2) {
							System.out.println("Acertou");
						}else 
							System.out.println("Errou");
						
						
						System.out.println("-----------------------------------------");
						System.out.println("Deseja Continuar?");
						System.out.println("1.SIM");
						System.out.println("2.NÂO");
						desejaContinuar = ler.nextInt();
						
					}while (desejaContinuar==1);
						
						System.out.println("Fim Do Jogo");
						
					}
						
						
						
						
						
					}
	
			
	
				
			

		
				

	





