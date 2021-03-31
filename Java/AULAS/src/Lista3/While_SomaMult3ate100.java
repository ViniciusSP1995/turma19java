package Lista3;

import java.util.Scanner;

public class While_SomaMult3ate100 {

	public static void main(String[] args) {
		/*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três
		(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
		deveremos observar na tela a seguinte sequência: 5 15 45 135.
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int x; 

		System.out.println("Digite um número: ");
		x = leia.nextInt();

		while (x < 100) {
			System.out.println(x);
			x = x * 3;
		} if (x > 100) {
			System.out.println(x);
		}

	}

}
