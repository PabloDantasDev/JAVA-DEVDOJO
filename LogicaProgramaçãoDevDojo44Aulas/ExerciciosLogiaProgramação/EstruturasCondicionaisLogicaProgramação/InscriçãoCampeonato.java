package EstruturasCondicionaisLogicaPrograma��o;
import java.io.Closeable;
import java.util.Scanner;
class Inscri��oCampeonato {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.print("Qual Sua nome : ");
		nome = ler.next();
	
		System.out.print("Qual Sua Idade? : ");
		idade = ler.nextInt();
		
		if(idade<10) {
			System.out.println(nome+" Voc� Participar� da Categoria Infantil");
			
		}else if(idade ==11 && idade <=15) {
			System.out.println(nome+ " Voc� Participara Da Categoria Juvenil ");
				
		}
		else if(idade==16 && idade <=19  ) {
			System.out.println(nome+ " Voc� Participar� Da Categoria Pr�-Aduto");
		}
		else if(idade >20) {
			System.out.println(nome+ " Voc� Participar� da Categoria Adulto");
	
	
		
		}
	}}
