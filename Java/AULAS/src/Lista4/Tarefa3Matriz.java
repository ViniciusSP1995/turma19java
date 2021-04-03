package Lista4;

public class Tarefa3Matriz {

	public static void main(String[] args) {
	/*
	Escreve um programa que lê duas matrizes N1 (4,6)
	e N2(4,6) e cria:
	
	a) Uma matriz M1 cujos elementos serão as somas dos
	elementos de mesma posição das matrizes N1 e N2;
	
	b) Uma matriz M2 cujos elementos serão as diferenças
	dos elementos de mesma posição das matrizes N1 e N2.
	 */
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		int numero;
		
		
		for(int linha = 0; linha < 4;linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				numero = (int) ((Math.random()*9)+1);								
				n1[linha][coluna] = numero;
				numero = (int) ((Math.random()*9)+1);		
				n2[linha][coluna] = numero;
			}
		}
		
		System.out.println("Matriz 1\n");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				System.out.print(n1[linha][coluna] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matriz 2");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				System.out.print(n2[linha][coluna] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matriz Soma");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				System.out.print(m1[linha][coluna] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matriz Diferença");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 6; coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
				if (m2[linha][coluna] < 0) {
					m2[linha][coluna] *= -1;
				}
				System.out.print(m2[linha][coluna] + " | ");
			}
			System.out.println(" ");
		}
		

	}

}
