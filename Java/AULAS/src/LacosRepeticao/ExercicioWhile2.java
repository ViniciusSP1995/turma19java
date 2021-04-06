package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		/*
		 	Uma empresa desenvolveu uma pesquisa para saber as 
		 	caracter�sticas psicol�gicas dos indiv�duos de uma 
		 	regi�o. Para tanto, a cada uma das pessoas era perg
		 	untado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 	e as op��es (1, se a pessoa era calma; 2, se a pessoa era
		 	nervosa e 3, se a pessoa era agressiva). Pede-se para
		 	elaborar um sistema que permita ler os dados de 150 pessoas,
		 	calcule e mostre: (WHILE)
			o n�mero de pessoas calmas; 
			
			o n�mero de mulheres nervosas;
			 
			o n�mero de homens agressivos;
			 
			o n�mero de outros calmos;
			
			o n�mero de pessoas nervosas com mais de 40 anos;
			 
			o n�mero de pessoas calmas com menos de 18 anos.
		 */
		
		int idade, numeroPessoas = 0,qtdeCalmo = 0, qtdeHomensAgressivos = 0, qtdeMulheresNervosas = 0, qtdeOutrosCalmo = 0, qtdeNervososMais40 = 0, qtdeCalmoMenor18 = 0;
		char genero, temperamento;
		
		while (numeroPessoas < 2) {
			numeroPessoas++;
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Qual � seu genero?\nF - feminino\nM - masculino\nO - Outros");
			genero = leia.next().toUpperCase().charAt(0);
			
			System.out.println("Digite 1 se voc� � uma pessoa calma\nDigite 2 se voc� � uma pessoa nervosa\nDigite 3 se voc� � uma pessoa agressiva");
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
		System.out.print("O n�mero de pessoas calmas � de: " + qtdeCalmo);
		System.out.print("\nO n�mero de mulheres nervosas � de: "+ qtdeMulheresNervosas);
		System.out.print("\nO n�mero de homens agressivos � de: "+ qtdeHomensAgressivos);
		System.out.print("\nO n�mero de outros calmos � de: " + qtdeOutrosCalmo);
		System.out.print("\nO n�mero de pessoas nervosas com mais de 40 anos � de: " + qtdeNervososMais40);
		System.out.print("\nO n�mero de pessoas calmas com menos de 18 anos � de: " + qtdeCalmoMenor18);
	}

}
