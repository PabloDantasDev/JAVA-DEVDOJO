package EstruturasCondicionaisLogicaProgramação;
import java.util.Scanner;
class ValorEmplacamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int conta;
		int gorjeta;
		
		
		
		System.out.println("Valor da Conta R$:");
		conta = ler.nextInt();
		System.out.println("Qual Valor da Porcentagem?");
		gorjeta =ler.nextInt();
		
		System.out.println("Valor da Conta a ser paga R$: " + conta +" Reais");
		System.out.println("Acrescimo Gorjeta 10% Taxe de Serviço R$ "+ conta+gorjeta);
		System.out.println("Valor Total R$: "+conta*.10/100);
		
		

	}

}
