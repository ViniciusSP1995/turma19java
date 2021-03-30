package Lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("0 é um número neutro");
			
		} else if (numero < 0) {
			System.out.println("Este número é negativo");
			
		} else if ((numero % 2) == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O numero é ímpar");
		}
		if (numero>0){
			System.out.println(" e positivo!");
		} else {
			System.out.println(", não é possível calculá-lo");
		}

	}

}
