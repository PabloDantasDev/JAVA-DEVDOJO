package EstruturasCondicionaisLogicaProgramação;
import java.io.Closeable;
import java.util.Scanner;
class InscriçãoCampeonato {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.print("Qual Sua nome : ");
		nome = ler.next();
	
		System.out.print("Qual Sua Idade? : ");
		idade = ler.nextInt();
		
		if(idade<10) {
			System.out.println(nome+" Você Participará da Categoria Infantil");
			
		}else if(idade ==11 && idade <=15) {
			System.out.println(nome+ " Você Participara Da Categoria Juvenil ");
				
		}
		else if(idade==16 && idade <=19  ) {
			System.out.println(nome+ " Você Participará Da Categoria Pré-Aduto");
		}
		else if(idade >20) {
			System.out.println(nome+ " Você Participará da Categoria Adulto");
	
	
		
		}
	}}
