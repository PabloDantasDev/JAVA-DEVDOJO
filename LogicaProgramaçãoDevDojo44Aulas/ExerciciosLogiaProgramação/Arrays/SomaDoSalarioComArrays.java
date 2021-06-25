//SOMA DE SALARIO BRUTO MENOS VALOR DESCONTO!


package Arrays;
import java.util.Scanner;
class SomaDoSalarioComArrays {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
	
		
		double [] SB = new double [1];
		double [] SL = new double [1];
		double [] somaSalarioSl = new double[1];
		int outroValor=0;
		
		
		for (int i = 0; i < SB.length; i++) {

			System.out.println("Informe o Valor do Salario Bruto");
			 SB[i]=ler.nextDouble();

			 System.out.println("Informe o Valor Do Desconto");
			 SL[i]=ler.nextDouble();
			 
			 somaSalarioSl[i]=SB[i]-SL[i];
			 
		}
		
		for (int i = 0; i < somaSalarioSl.length; i++) {
			
			System.out.println ("O salario a receber é : = R$" + (SB[i]-SL[i])+" Reais");
			
			
				System.out.println("Fim Da Operação");

		
		}}}		