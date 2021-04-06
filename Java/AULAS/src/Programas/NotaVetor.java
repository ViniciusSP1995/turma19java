package Programas;

import java.util.Scanner;

public class NotaVetor {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		String pessoas[] = new String[4];
		double nota [] = new double[4];
		
		for (int x = 0; x < pessoas.length; x++) {
			System.out.println("Digite o nome da pessoa " + (x+1) + ":");
			pessoas[x] = leia.next();
			
			
			System.out.println("Digite a nota do aluno " + (x+1) + ":");
			nota[x] = leia.nextDouble();
				
		}
		for (int x = 0; x < pessoas.length; x++) {
			if (nota[x] <= 5) {
				System.out.printf("%s sua nota é %d - ainda não!\n", pessoas[x], nota[x]);
				
			} else if (nota[x] > 5) {
				System.out.printf("%s sua nota é %d - muito bem!",pessoas[x],nota[x]);
			}
		}
	}

}
