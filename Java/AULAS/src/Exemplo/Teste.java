package Exemplo;

import java.util.Scanner;

public class Teste {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			double celsius;
			double fahrenheit;
			
			System.out.println("Digite a temperatura em C�: ");
			celsius = leia.nextDouble();
			
			fahrenheit = ((celsius * 1.8)+ 32);
			
			System.out.println("A temperatura em celsius �: "+ celsius);
			System.out.printf("A temperatura em fahrenheit �: %.2f", fahrenheit);
			
		}
	}

