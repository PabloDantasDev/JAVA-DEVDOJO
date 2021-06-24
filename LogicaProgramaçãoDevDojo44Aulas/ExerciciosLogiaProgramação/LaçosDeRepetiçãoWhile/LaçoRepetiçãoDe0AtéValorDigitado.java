package LaçosDeRepetiçãoWhile;
import java.util.Scanner;
class LaçoRepetiçãoDe0AtéValorDigitado {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		
		int valorDigitado;
		int i =0;
		
		
		
		
		System.out.println("Me Informe um Valor?");
		valorDigitado = ler.nextInt();
		
		while(i<=valorDigitado) {
			if(i % 2 != 0) {
			System.out.println("i = " + i);
			}
			
				i = i + 1;
		}
						
			}
}


