package SwitchCase;

import java.util.Scanner;

class Aula1DiasDaSemana {

	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);

		int dia = 0;

		System.out.print("Me Informe Um Numero Correspondente ao dia da semana: ");
		dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Segunda Feira");
			break;
		case 2:
			System.out.println("Terça Feira");
			break;
		case 3:
			System.out.println("Quarta Feira");
			break;
		case 4:
			System.out.println("Quinta Feira");
			break;
		case 5:
			System.out.println("Sexta Feira");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Dia Ivalido");
		}

		System.out.println("Fim Do Programa");

	}
}