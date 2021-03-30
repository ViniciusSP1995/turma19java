package Lista2;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int base, altura;
		double areaTriangulo;

		System.out.println("Digite a base do triângulo: ");
		base = leia.nextInt();
		System.out.println("Digite a altura do triângulo: ");
		altura = leia.nextInt();
		
		if (altura > 0 && base > 0) {
			areaTriangulo = (base * altura)/2;
			
			System.out.println("A área do triângulo é: " + areaTriangulo);
		} else {
			System.out.println("Não foi possível calcular a área do triângulo");
		}

	}

}
