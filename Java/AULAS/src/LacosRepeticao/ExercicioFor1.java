package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Informar todos os números de 1000 a 1999 que quando
		 *  divididos por 11 obtemos resto = 5. (FOR)
		 */
		
		for (int x = 1000; x <= 1999;x++) {
			if ((x % 11) == 5) {
				System.out.println(x);
			}
		}
		
	}
	
}
