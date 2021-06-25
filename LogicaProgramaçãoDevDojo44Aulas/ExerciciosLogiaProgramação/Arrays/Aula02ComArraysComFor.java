package Arrays;
import java.util.Scanner;
class Aula02ComArraysComFor {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		double [] notas = new double[4];
		
		for( int i=0;  i <notas.length; i++) {
			
			System.out.println("Digite a Nota "+(i+1));
			
			notas [i] = ler.nextDouble();
			
	} 
		int media=0;
		
		for( int i=0;  i <notas.length; i++) {
			
		media = (int) (media + notas[i]);
		
		System.out.println("Nota" +(i+1) + " : " +notas[i]);
	
	}
		media = media /4;
		System.out.println("Sua Media Final é "+media);
		if(media>=7) {
			System.out.println("Parabéns Você Passou!!!!!!!!!!!!!!");
		}else {
			System.out.println("Você REPROVOU!");
		}

}}
