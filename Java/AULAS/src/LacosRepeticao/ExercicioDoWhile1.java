package LacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		/*
		 Crie um programa que leia um número do teclado
		 até que encontre um número igual a zero. No final,
		 mostre a soma dos números digitados.(DO...WHILE)

		 */
		Scanner leia = new Scanner(System.in);
		int numero = 0,soma = 0;
		
		
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
		
			
		} while (numero > 0);
		
		System.out.print("A soma dos números digitados é: " + soma);
	}

}
