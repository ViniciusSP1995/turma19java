package Lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double p, m, limite;

		System.out.println("Ol� Jo�o, nos informe quantos kilos de tomate voc� est� carregando: ");
		p = leia.nextDouble();

		limite = 50;
		m = 4.00;

		if (p > 50) {
			System.out.println("Voc� dever� pagar multa de "+(p-limite) * m + "R$");
		} else {
			System.out.println("Voc� est� isento de multas!");

		}

	}

}
