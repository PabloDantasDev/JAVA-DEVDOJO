package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;
class SalarioDias {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		double a = 2021;
		int da =365;
		int m = 12;
		int d =30;
		int nasc;
		int dia = 20;
		
		
		 
		System.out.println("Qual é o Seu Nome?");
		nome = ler.next();
		System.out.println("Qual dia do Seu Nascimento?");
		d = ler.nextInt();
		System.out.println("Qual mês do seu nascimento? ");
		m = ler.nextInt();
		System.out.println("Qual Ano Do Seu Nascimento?");
		nasc = ler.nextInt();
		System.out.println(a-nasc+" Anos "+(12-m-1)+" Messes"+ (d*2-d-dia+10)+" Dias = "+nasc*a+ " Dias De Vida");
	}

}
