package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;
class DiasDaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero ;
		
		System.out.println("Me Informe Um Numero Correspondente ao Dia da Semana; ");
		numero = ler.nextInt();
		
		if(numero == 1 ) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Segunda");
		}else if(numero==2 ) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Terça");
		}else if(numero==3) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Quarta");
		}else if(numero==4) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Quinta");
		}else if(numero==5) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Sexta");
		}else if(numero==6) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Sabado");	
		}else if(numero==7) {
			System.out.println(numero + " O Numero Corresponde ao dia da semana é Domingo");
		}
		else {
			System.out.println("Numero Não Corrsponde a algum dia da semana");
		}
	
		
		
	}

}
