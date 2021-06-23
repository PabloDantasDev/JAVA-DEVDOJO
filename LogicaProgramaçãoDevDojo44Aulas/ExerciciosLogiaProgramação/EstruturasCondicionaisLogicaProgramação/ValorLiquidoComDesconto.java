package EstruturasCondicionaisLogicaProgramação;

import javax.swing.JOptionPane;


class ValorLiquidoComDesconto {

	public static void main (String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do Funcionario");
		
		String leitura =JOptionPane.showInputDialog("Salario Bruto");
		
		float salarioBruto =Float.parseFloat(leitura);
		
		leitura =JOptionPane.showInputDialog("Valor do Desconto");
		
		float valorDesconto = Float.parseFloat(leitura);
		
		double salarioLiquido = salarioBruto-valorDesconto;
		System.out.println("Nome do Funcionario :" +nome);
		System.out.println("Valor do Salario Bruto: R$ " +salarioBruto+" Reais");
		System.out.println("Valor do Desconto: R$ " +valorDesconto+" Reais");
		System.out.println("Valor Liquido a Receber = R$ " +salarioLiquido + " Reais");
		
		

	
	
	
	
	

	

	}

}
