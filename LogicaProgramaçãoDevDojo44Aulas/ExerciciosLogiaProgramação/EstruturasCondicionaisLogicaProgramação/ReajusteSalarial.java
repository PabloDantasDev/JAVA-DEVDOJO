package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;
class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int salario;
		float salarioMaiorque4500= 0.30F;
		float salarioMenorque4500= 0.15F;
		
		System.out.println("Qual Seu Salario:");
		salario = ler.nextInt();
		
		
		if(salario >=4500) {
		
		System.out.println(salario+salarioMaiorque4500);
		}else {
			System.out.println(salario+salarioMenorque4500);
		
		}
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
