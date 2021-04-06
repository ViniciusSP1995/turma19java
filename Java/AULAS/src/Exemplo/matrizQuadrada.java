package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class matrizQuadrada {

	public static void main(String[] args) {
		// linha,coluna
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int matrizQ[][] = new int[2][2];
		
		for (int linha= 0; linha<2;linha++) {
			for (int coluna=0; coluna<2;coluna++) {
				System.out.printf("Digite o valor na linha %d coluna %d: ",linha,coluna);
				matrizQ[linha][coluna] = leia.nextInt();
			}
		}
		for (int linha= 0; linha<2;linha++) {
			for (int coluna=0; coluna<2;coluna++) {
				System.out.print(matrizQ[linha][coluna]+ " ");
			
			}
			System.out.println();
	}

}
}