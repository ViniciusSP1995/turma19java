package Lista4;


public class Tarefa4Matriz {

	public static void main(String[] args) {
		
		
		/* 4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
		ou seja, diagonal principal.*/

		 int matriz[][] = new int[3][3];    
		 int matrizTeste[][] = new int [3][3];    
		 int matrizSoma[][] = new int [3][3];
		 int totalDiagonal=0;
		 int numero=0;

		for (int linha=0; linha<3;linha++) {
			for (int coluna=0; coluna<3; coluna++)
			{
				numero = (int) ((Math.random()*9)+1);   
				matriz[linha][coluna]= numero;
				numero = (int) ((Math.random()*9)+1);
				matrizTeste[linha][coluna] = numero;
				matrizSoma[linha][coluna] = matriz[linha][coluna] + matrizTeste[linha][coluna];
				
				if (linha==coluna) {
					totalDiagonal = totalDiagonal + matriz[linha][coluna];
				}
			}
		}
		System.out.println("\nMatriz 1\n");
		for (int linha=0; linha<3;linha++) {
				for (int coluna=0; coluna<3; coluna++)
				{
					System.out.print(matriz[linha][coluna] + " ");
				}
				System.out.print("\n");
		}
		System.out.println("\nMatriz teste\n");
		for (int linha=0; linha<3;linha++) {
			for (int coluna=0; coluna<3; coluna++)
			{
				System.out.print(matrizTeste[linha][coluna] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("\nMatriz Soma\n");
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0; coluna<3; coluna++)
			{
				System.out.print(matrizSoma[linha][coluna] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\nValor da diagonal principal da matriz 1: " + totalDiagonal);
			

	}

}
