package LacoDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Fa�a um programa que entre com tr�s n�meros
		//e coloque em ordem crescente.
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3) { //n1,n2,n3
			
			System.out.println("A ordem decrescente � " + n1 + ", " + n2 + " e " + n3);
			
		}else if (n1 <= n2 && n1 <= n3 && n3 <= n2 ) { //n1,n3,n2
			
			System.out.println("A ordem decrescente � " + n1 + ", " + n3 + " e " + n2);
			
		}else if (n2 <= n1 && n2 <= n3 && n1 <= n3 ) { //n2,n1,n3
			
			System.out.println("A ordem decrescente � " + n2 + ", " + n1 + " e " + n3);
			
		}else if (n2 >= n1 && n2 >= n3 && n3 >= n1 ) { //n2,n3,n1
			
			System.out.println("A ordem decrescente � " + n2 + ", " + n3 + " e " + n1);
		}else if (n3 <= n1 && n3 <= n2 && n2 <= n1 ) { //n3,n2,n1
			
			System.out.println("A ordem decrescente � " + n3 + ", " + n2 + " e " + n1);
		}else if (n3 <= n1 && n3 <= n2 && n1 <= n2 ) { //n3,n1,n2
			
			System.out.println("A ordem decrescente � " + n3 + ", " + n1 + " e " + n2);
		}
	}

}
