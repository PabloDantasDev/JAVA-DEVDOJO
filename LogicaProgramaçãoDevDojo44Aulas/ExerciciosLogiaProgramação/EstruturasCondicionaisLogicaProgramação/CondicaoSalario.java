package EstruturasCondicionaisLogicaPrograma��o;

import java.util.Scanner;
class CondicaoSalario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salario;
		float resultado;
		System.out.println("Qual seu Salario?");
		salario = ler.nextFloat();
		if (salario >= 4500.50) {
			resultado = salario * 0.3F;
			System.out.println("O Valor do Seu Desconto � de 30% = R$ " + resultado + " Reais");
			System.out.println("Valor a Receber � De: R$ " + (salario - resultado)) ;
		}else {
			resultado = salario * 0.1F;
			System.out.println("O Valor do Seu Salario com Desconto � de 10% = R$ " + resultado + " Reais");
			System.out.println("Valor a Receber � De: " + (salario - resultado));
			
		ler.close();}}}