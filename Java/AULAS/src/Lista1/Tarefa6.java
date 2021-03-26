package Lista1;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d;

		System.out.println("Digite valor de x1: ");
		x1 = leia.nextInt();
		System.out.println("Digite valor de y1: ");
		y1 = leia.nextInt();
		System.out.println("Digite valor de x2: ");
		x2 = leia.nextInt();
		System.out.println("Digite valor de y2: ");
		y2 = leia.nextInt();

		d = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)));

		System.out.printf("O resultado é: %.2f",d);

	}

}
