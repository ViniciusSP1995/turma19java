package Programas;

import java.util.Scanner;

public class AuxilioEmergencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char situacaoEmergencial ;
		String nome;
		int filhos;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine().toUpperCase();		
		System.out.println("Voc� recebeu emergencial antes S-SIM ou N-N�O");
		situacaoEmergencial = leia.next().toUpperCase().charAt(0);
		if (situacaoEmergencial =='S') {
			System.out.println("Voc� recebeu algum auxilio extra como Bolsa familia alguma vez?");
			situacaoEmergencial = leia.next().toUpperCase().charAt(0);
			if(situacaoEmergencial == 'S') {
				System.out.printf("%s Voc� n�o tem direito ao beneficio!!!",nome);
			} else if (situacaoEmergencial == 'N'){
				System.out.println("Voc� � chefa de fam�lia: ");
				if (situacaoEmergencial == 'S') {
					System.out.println("Voc� vai receber R$ 600,00 de aux�lio!!!");
					System.out.println("Quantos filhos voc� tem? [0, 1, 2, 3]");
					filhos = leia.nextInt();
					System.out.println("Valor final a receber" + (600+(filhos*50)));
				} else if (situacaoEmergencial == 'N') {
					System.out.println("Quantos filhos voc� tem?  [0, 1, 2, 3]");
					filhos = leia.nextInt();
					System.out.println("Valor final a receber " + (300+(filhos*50)));
				}
			}
		} else if(situacaoEmergencial == 'N'){
			System.out.printf("%s Voc� n�o tem direito ao beneficio!!!",nome);
		} else {
			System.out.println("Op��o inv�lida");
		}
		System.out.println("fim de programa!!!");
	}

}
