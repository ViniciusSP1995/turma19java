package Lista3;

import java.util.Scanner;

public class While_SomaMult3ate100 {

	public static void main(String[] args) {
		/*2- Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s
		(imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  
		deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int x; 

		System.out.println("Digite um n�mero: ");
		x = leia.nextInt();

		while (x < 100) {
			System.out.println(x);
			x = x * 3;
		} if (x > 100) {
			System.out.println(x);
		}

	}

}
