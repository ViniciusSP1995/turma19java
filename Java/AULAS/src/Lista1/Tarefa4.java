package Lista1;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Olá, digite o primeiro número: ");
		a = leia.nextDouble();
		
		
		System.out.println("Agora, digite o segundo número: ");
		b = leia.nextDouble();
		
		System.out.println("Por último, digite o terceiro número: ");
		c = leia.nextDouble();
		

		double R = Math.pow(a+b,2);
		double S = Math.pow(b+c,2);
		double D = R + S / 2;

		System.out.print("O resultado da expressão é: "+ D);

	}

}
