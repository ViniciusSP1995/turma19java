package LacosRepeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		/*
		Solicitar a idade de várias pessoas e imprimir: Total de
		pessoas com menos de 21 anos. Total de pessoas com mais
		de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		Scanner leia = new Scanner(System.in);
			
		int idade = 0;
		int totalMenos21anos = 0;
		int totalMais50anos = 0;
		
		while(idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade <= 21) {
				totalMenos21anos++;
			} else if (idade >= 50 ) {
				totalMais50anos++;
			}
		}
		System.out.print("O total de pessoas que são menores de 21 anos são: " + (totalMenos21anos - 1));
		System.out.print("\nO total de pessoas que são maiores de 50 são: " + totalMais50anos);
	}

}
