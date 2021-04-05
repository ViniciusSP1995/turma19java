package LacoDecisao;

import java.util.Scanner;

public class Exercicio1 {
	
 public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	 
	 int n1,n2,n3; 
	 
		 System.out.println("Digite o primeiro numero: ");
		 n1 = leia.nextInt();
		 System.out.println("Digite o segundo numero: ");
		 n2 = leia.nextInt();
		 System.out.println("Digite o terceiro numero: ");
		 n3 = leia.nextInt();
		 
		 if (n1 >= n2 && n1 >= n3) {
			 System.out.println("O maior número é "+ n1);
			 
		 } else if (n2 >= n1 && n2 >= n3) {
			 System.out.println("O maior número é "+ n2); 
		 } else if (n3 >= n1 && n3 >= n2) {
			 System.out.println("O maior número é "+ n3);
		 } else {
			 System.out.println("Digite um valor válido");
		 }

	 
 }
}
