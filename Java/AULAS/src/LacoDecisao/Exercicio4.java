package LacoDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 Faça um programa em que permita a entrada de um número qualquer
		  e exiba se este número é par ou ímpar. Se for par exiba também
		  a raiz quadrada do mesmo; se for ímpar exiba o número elevado
		  ao quadrado.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		if ((numero % 2 ) == 0 && numero > 0 || numero  == 0) {
			System.out.println("O número digitado é par e a raiz quadrada dele é " + Math.sqrt(numero));
		} else if ( (numero % 2) == 1 && numero > 0) {
			System.out.println("O número é impar e o quadrado dele é " + Math.pow(numero,2));
		}
		
	}

}
