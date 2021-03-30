package Lista2;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N;

		System.out.println("Digite um número: ");
		N = leia.nextInt();
		
		if (N > 100) {
			System.out.println("O número digitado foi " + N);
		} else {
			System.out.println("0");
		}
		
	}

}
