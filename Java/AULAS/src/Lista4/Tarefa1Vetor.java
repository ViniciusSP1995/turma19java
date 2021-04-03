package Lista4;

import java.util.Scanner;

public class Tarefa1Vetor {

	public static void main(String[] args) {
	/*
	 Fa�a um programa que crie um vetor por leitura com 5 valores 
	 de pontua��o de uma atividade e o escreva em seguida. Encontre
	  ap�s a maior pontua��o e a apresente. 
	 */
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[5];
		int pontuacao = 0;
		int maiorPontuacao = 0;
		
		for (int x = 0; x < 5; x++) {
			System.out.println("Digite a pontua��o da atividade " + (x+1) + ":");
			valores[x] = leia.nextInt();
			
			if (valores[x] > maiorPontuacao) {
				maiorPontuacao = valores[x];
				
			}
			
		}
		System.out.println("O maior valor �: " + maiorPontuacao);
		
	}

}
