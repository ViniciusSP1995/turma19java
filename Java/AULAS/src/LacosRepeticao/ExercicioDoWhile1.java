package LacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		/*
		 Crie um programa que leia um n�mero do teclado
		 at� que encontre um n�mero igual a zero. No final,
		 mostre a soma dos n�meros digitados.(DO...WHILE)

		 */
		Scanner leia = new Scanner(System.in);
		int numero = 0,soma = 0;
		
		
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			soma = soma + numero;
		
			
		} while (numero > 0);
		
		System.out.print("A soma dos n�meros digitados �: " + soma);
	}

}
