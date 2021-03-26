package Lista1;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int diasDeVida, dias, meses, anos;

		
		
		System.out.println("informe seus dias de vida: ");
		diasDeVida = leia.nextInt();
		anos = (diasDeVida/365);
		meses = ((diasDeVida % 365) / 30); 
		dias = ((diasDeVida % 365) % 30);

		System.out.println("Sua idade é "+anos+ " anos "+ meses+ " meses e "+dias+ " dias");
		
	}

}
