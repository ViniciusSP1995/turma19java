package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		/*
		 	Uma empresa desenvolveu uma pesquisa para saber as 
		 	características psicológicas dos indivíduos de uma 
		 	região. Para tanto, a cada uma das pessoas era perg
		 	untado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 	e as opções (1, se a pessoa era calma; 2, se a pessoa era
		 	nervosa e 3, se a pessoa era agressiva). Pede-se para
		 	elaborar um sistema que permita ler os dados de 150 pessoas,
		 	calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			
			o número de mulheres nervosas;
			 
			o número de homens agressivos;
			 
			o número de outros calmos;
			
			o número de pessoas nervosas com mais de 40 anos;
			 
			o número de pessoas calmas com menos de 18 anos.
		 */
		
		int idade, numeroPessoas = 0,qtdeCalmo = 0, qtdeHomensAgressivos = 0, qtdeMulheresNervosas = 0, qtdeOutrosCalmo = 0, qtdeNervososMais40 = 0, qtdeCalmoMenor18 = 0;
		char genero, temperamento;
		
		while (numeroPessoas < 2) {
			numeroPessoas++;
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Qual é seu genero?\nF - feminino\nM - masculino\nO - Outros");
			genero = leia.next().toUpperCase().charAt(0);
			
			System.out.println("Digite 1 se você é uma pessoa calma\nDigite 2 se você é uma pessoa nervosa\nDigite 3 se você é uma pessoa agressiva");
			temperamento = leia.next().charAt(0);
			
				if (temperamento == '1') {
					
					qtdeCalmo++;
					
				} else if (genero == 'F' && temperamento == '2') {
					qtdeMulheresNervosas++;
				} else if (genero == 'M' && temperamento =='3') {
					qtdeHomensAgressivos++;
				} else if (genero == 'O' && temperamento =='1') {
					qtdeOutrosCalmo++;
				} else if (idade >= 40 && temperamento == '2') {
					qtdeNervososMais40++;
				} else if (temperamento == '1' && idade <= 18) {
					qtdeCalmoMenor18++;
				}
				
			
		}
		System.out.print("O número de pessoas calmas é de: " + qtdeCalmo);
		System.out.print("\nO número de mulheres nervosas é de: "+ qtdeMulheresNervosas);
		System.out.print("\nO número de homens agressivos é de: "+ qtdeHomensAgressivos);
		System.out.print("\nO número de outros calmos é de: " + qtdeOutrosCalmo);
		System.out.print("\nO número de pessoas nervosas com mais de 40 anos é de: " + qtdeNervososMais40);
		System.out.print("\nO número de pessoas calmas com menos de 18 anos é de: " + qtdeCalmoMenor18);
	}

}
