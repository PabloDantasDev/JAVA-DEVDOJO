package EstruturasCondicionaisLogicaProgramação;
//Cadastre o usuario que não contem o nome "admin"  ou "Administrador" e tabém não pode ser vazio"
//caso o ussuario digite asinforções validas " mostre a mensagem Funcionario cadastrado 
//com sucesso se nao mostre mensagem de usuario invalido

import java.util.Scanner;

class CadastroUsusarioEmpresa {

	private static Scanner ler;

	public static void main(String[] args) {
			ler = new Scanner(System.in);
			String nome ;
			
			
			System.out.println("Qual Seu Usuario De Login?");
			nome = ler.next();
			
			if(nome.equalsIgnoreCase("admin")||nome.equalsIgnoreCase("administrador")|| nome.equalsIgnoreCase("")) {
				System.out.print("Usuario Invalido, Tente Novamente");
				
			}
			else {
				System.out.println(nome + " Usuario Cadastrado com sucesso! Bem Vindo");
			}
		}
		
		
	
		
		
		
		

	}


