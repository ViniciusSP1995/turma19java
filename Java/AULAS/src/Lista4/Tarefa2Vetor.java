package Lista4;

import java.util.Scanner;

public class Tarefa2Vetor {

	public static void main(String[] args) {
		/*2 - Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor
		com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,
		contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
