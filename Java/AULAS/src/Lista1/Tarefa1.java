package Lista1;

import java.util.Scanner;

public class Tarefa1 {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int dias, mes, idadeAno, diasTotais;
		
		
		
		System.out.println("Insira sua idade total em dias, meses e anos!");

		System.out.println("Por favor, insira quantos anos você tem: ");
		idadeAno = leia.nextInt();
		System.out.println("Por favor, insira quantos meses você tem: ");
		mes = leia.nextInt();
		System.out.println("Por favor, insira quantos dias você tem: ");
		dias = leia.nextInt();

		diasTotais = idadeAno*365 + mes*30 + dias*1;
		
		System.out.println("Sua idade em dias é: "+diasTotais+ "!");
		diasTotais = leia.nextInt();
		
		

	}

}
