package Lista4;

import java.util.Scanner;

public class Tarefa2Vetor {

	public static void main(String[] args) {
		/*2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor
		com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
		contabilize e apresente também quantas foram as ocorrências da maior pontuação.
		*/
		Scanner leia = new Scanner(System.in);

		int lanceDados[] = new int[10];
		double media = 0.00;
		int maiorNumero = 0;
		int contador=0;

		for (int x=0; x<10; x++) {
			System.out.println("Digite o numero do lance " + (x+1) +": ");
			lanceDados[x] = leia.nextInt();
			media = media + lanceDados[x];
			if (maiorNumero < lanceDados[x]) {
				maiorNumero = lanceDados[x];
				contador=1;
			} else if(maiorNumero == lanceDados[x]) {
				contador++;
			}
		}
		media=media/10;

		for (int x=0; x<10;x++)
		{
			System.out.print(lanceDados[x] + " | ");
		}
		System.out.println("\nMedia: "+media +"\nMaior numero: "+maiorNumero+"\nVezes que o Maior numero saiu: "+contador);

	}

}
