package LacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final
		 * imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero,contador = 0, soma =0;
		double media = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			if ((numero % 3 ) == 0) {
				soma = soma + numero;
				contador++;
			}
		} while (numero > 0);
		media = soma/(contador - 1);
		System.out.print("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
		
	}

}
