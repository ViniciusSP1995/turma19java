package LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa em que permita a entrada de um n�mero qualquer
		  e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m
		  a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado
		  ao quadrado.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		if ((numero % 2 ) == 0 && numero > 0 || numero  == 0) {
			System.out.println("O n�mero digitado � par e a raiz quadrada dele � " + Math.sqrt(numero));
		} else if ( (numero % 2) == 1 && numero > 0) {
			System.out.println("O n�mero � impar e o quadrado dele � " + Math.pow(numero,2));
		}
		
	}

}
