package Lista3;

import java.util.Scanner;

public class DoWhile_SomaConsec {

	public static void main(String[] args) {
		
		/*2- Fa�a um programa que pegue um n�mero do teclado e calcule
		a soma de todos os n�meros  de 1 at� ele. Ex.: o usu�rio 
		entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		int soma = 0; 
		int i = 0;
				
		System.out.println("Digite um n�mero: ");
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
