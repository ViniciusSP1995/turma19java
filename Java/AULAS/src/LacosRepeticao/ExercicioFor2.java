package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos
		 * s�o pares e quantos s�o �mpares. (FOR)
		 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int numero = 0, quantidadeImpar = 0, quantidadePar= 0;
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if (((numero % 2) == 0) && numero > 0) {
				
				quantidadePar++;
				
			} if (((numero % 2) == 1) && numero > 0){
				quantidadeImpar++;
			}
		}
		System.out.print("Foram digitados " + quantidadePar + " n�meros pares e " + quantidadeImpar + " n�meros impares");
	}

}
