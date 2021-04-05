package Exemplo;

import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a,b,troca;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		troca = a;
		a=b;
		b=troca;
		
		System.out.printf("A = %.2f\nB=%.2f",a,b);

	}

}
