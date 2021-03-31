package Lista3;

public class DoWhile_Contagem {

	public static void main(String[] args) {
		/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que 
		 contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		*/	

		int x = 233;

		 do {
			if (x > 300 && x < 400) {
				System.out.print(x + " +3 = ");
				x = x + 3;
			System.out.println(x);
			
			} else {
				System.out.print(x + " + 5 = ");
				x = x + 5;
				
				System.out.println(x);
			}
			
		}
			while (x < 456);


	}

}
