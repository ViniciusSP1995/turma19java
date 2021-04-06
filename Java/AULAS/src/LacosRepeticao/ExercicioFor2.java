package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos
		 * são pares e quantos são ímpares. (FOR)
		 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int numero = 0, quantidadeImpar = 0, quantidadePar= 0;
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (((numero % 2) == 0) && numero > 0) {
				
				quantidadePar++;
				
			} if (((numero % 2) == 1) && numero > 0){
				quantidadeImpar++;
			}
		}
		System.out.print("Foram digitados " + quantidadePar + " números pares e " + quantidadeImpar + " números impares");
	}

}
