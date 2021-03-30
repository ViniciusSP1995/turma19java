package Lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double p, m, limite;

		System.out.println("Olá João, nos informe quantos kilos de tomate você está carregando: ");
		p = leia.nextDouble();

		limite = 50;
		m = 4.00;

		if (p > 50) {
			System.out.println("Você deverá pagar multa de "+(p-limite) * m + "R$");
		} else {
			System.out.println("Você está isento de multas!");

		}

	}

}
