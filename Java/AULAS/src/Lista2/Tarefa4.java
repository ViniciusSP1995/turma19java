package Lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("0 � um n�mero neutro");
			
		} else if (numero < 0) {
			System.out.println("Este n�mero � negativo");
			
		} else if ((numero % 2) == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O numero � �mpar");
		}
		if (numero>0){
			System.out.println(" e positivo!");
		} else {
			System.out.println(", n�o � poss�vel calcul�-lo");
		}

	}

}
