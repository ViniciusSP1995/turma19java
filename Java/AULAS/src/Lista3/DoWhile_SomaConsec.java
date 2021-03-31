package Lista3;

import java.util.Scanner;

public class DoWhile_SomaConsec {

	public static void main(String[] args) {
		
		/*2- Faça um programa que pegue um número do teclado e calcule
		a soma de todos os números  de 1 até ele. Ex.: o usuário 
		entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		int soma = 0; 
		int i = 0;
				
		System.out.println("Digite um número: ");
		x = leia.nextInt();

		do {
			soma = soma + i;
			i++;
			System.out.print(soma + ", ");
		}
		while (i <= x);
			System.out.print("\nTotal: " + soma);
	}

}
