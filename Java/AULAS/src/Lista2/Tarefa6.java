package Lista2;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		if (idade >= 5 && idade <= 7) {

		System.out.println("Sua categoria �: Infantil A");
		
	} else if (idade >=8 && idade <= 11) {
		System.out.println("Sua categoria �: Infantil B");
	} else if (idade >= 12 && idade <= 13) {
		System.out.println("Sua categoria �: Juvenil A");
	} else if (idade >= 14 && idade <=17) {
		System.out.println("Sua categoria �: Juvenil B");
	} else if (idade >=18) {
		System.out.println("Sua categoria �: Adultos");
	} else {
		System.out.println("Idade n�o permitida para competir");
	}

	}

}
