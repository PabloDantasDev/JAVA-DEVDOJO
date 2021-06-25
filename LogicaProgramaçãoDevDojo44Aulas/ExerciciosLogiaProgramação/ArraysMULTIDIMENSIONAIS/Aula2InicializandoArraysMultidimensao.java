package ArraysMULTIDIMENSIONAIS;
import java.util.Scanner;
class Aula2InicializandoArraysMultidimensao {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		
		int [][] ArrayCom2DimiDimensao = new int [2][3];

		for (int i = 0; i < ArrayCom2DimiDimensao.length; i++) {
		for (int j = 0; j < ArrayCom2DimiDimensao[i].length; j++) {
				
			System.out.println("Digite o valor Da Primeira Posição ["+i+"]"+"["+j+"]");
			ArrayCom2DimiDimensao[i][j] = ler.nextInt();
		

}}
			for (int i = 0; i < ArrayCom2DimiDimensao.length; i++) {
			for (int j = 0; j < ArrayCom2DimiDimensao[i].length; j++) {
			System.out.println( "["+i+"]"+"["+j+"] = " + ArrayCom2DimiDimensao[i][j]);
	
	}}}}