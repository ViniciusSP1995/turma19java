package LacoDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da
		  	em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto

		 */
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			
			System.out.println("Voc� se enquadrada na categoria infantil!");
			
		} else if (idade >= 15 && idade <= 17) {
			
			System.out.println("Voc� se enquadrada na categoria juvenil!");
			
		} else if (idade >= 18 && idade <= 25) {
			
			System.out.println("Voc� se enquadrada na categoria adulto!");
			
		} else {
			
			System.out.println("Voc� n�o se encaixa em nenhuma categoria!");
		}
		
	}

}
