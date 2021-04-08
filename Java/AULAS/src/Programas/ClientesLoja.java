package Programas;

import java.util.Scanner;

public class ClientesLoja {

	public static void main(String[] args) {
		final int ANO_ATUAL = 2021;
		String nome;
		int anoNascimento;
		char genero;
		int maiorIdade = 0;
		int idade = 0;
		int menorIdade;
		int mesmaIdade;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 0; x < 2; x++) {
			System.out.print("Digite seu nome: ");
			nome = leia.next();
			System.out.println("Digite seu ano de nasciento: ");
			anoNascimento = leia.nextInt();
			System.out.println("Digite seu genero F-feminino/ M-Masculino / O-outros: ");
			genero = leia.next().toUpperCase().charAt(0);
			
			idade = ANO_ATUAL - anoNascimento;
			
			if(idade > maiorIdade) {
				maiorIdade = idade;
			}
			
		}

	}

}
