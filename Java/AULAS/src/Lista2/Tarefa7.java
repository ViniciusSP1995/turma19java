package Lista2;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int base, altura;
		double areaTriangulo;

		System.out.println("Digite a base do tri�ngulo: ");
		base = leia.nextInt();
		System.out.println("Digite a altura do tri�ngulo: ");
		altura = leia.nextInt();
		
		if (altura > 0 && base > 0) {
			areaTriangulo = (base * altura)/2;
			
			System.out.println("A �rea do tri�ngulo �: " + areaTriangulo);
		} else {
			System.out.println("N�o foi poss�vel calcular a �rea do tri�ngulo");
		}

	}

}
