package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;
class MediaAlunos {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		int media1;
		int media2;
		
		System.out.println("Qual Sua Primeira nota?");
		media1= ler.nextInt();
		System.out.println("Qual sua Segunda Nota?");
		media2 =ler.nextInt();
		if((media1+media2)/2 >= 6.0) {
			System.out.println("Sua Media = "+(media1+media2)/2+ " Aprovado");
		}
		else {
			System.out.println("Sua Media = "+ (media1+media2)/2+" Reprovado");
		}


	}

}
