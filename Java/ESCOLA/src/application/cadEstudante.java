package application;

import java.util.Locale;
import java.util.Scanner;

import entities.basico;
import entities.graduacao;
import entities.medio;

public class cadEstudante {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char opcao;
		do {
		System.out.println("ESCOLA");
		System.out.println("AQUI OU VAI OU VAI MESMO!!");
		System.out.println();
		System.out.println("1 - BÁSICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
		System.out.print("DIGITE A OPÇÃO SELECIONADA: ");
		opcao = leia.next().charAt(0);
		
		if (opcao == '1' ) {
			
			System.out.println("Digite a matricula do aluno");
			int matricula = leia.nextInt();
			System.out.println("Digite o cpf do aluno:");
			String cpf = leia.next();
			System.out.println("Digite dia de aniversario do aluno: ");
			int diaAniversario = leia.nextInt();
			//basico aluno = new basico();
			
			basico aluno = new basico(matricula, cpf,diaAniversario);
			
			System.out.println("Digite a nota: ");
			double nota = leia.nextDouble();
			aluno.incluirPontos(nota);
			if (aluno.getPontos() <= 5) {
				System.out.println("Ainda não");
			} else {
				System.out.println("Parabéns");
			}
			System.out.println("Qual o dia de hoje?");
			int diaAtual = leia.nextInt();
			aluno.bonusAniversario(diaAtual);
			System.out.println("PONTOS ATUAIS: " + aluno.getPontos());
			System.out.println("Continua 1 - sim ou6 - não?");
			opcao = leia.next().charAt(0);
		}
		else if (opcao == '2') {
			System.out.println("Digite a matricula do aluno");
			int matricula = leia.nextInt();
			System.out.println("Digite o cpf do aluno:");
			String cpf = leia.next();
			
			medio aluno = new medio(matricula, cpf);
			System.out.println("Digite a nota: ");
			double nota =leia.nextDouble();
			aluno.incluirPontos(nota);
			
			if (aluno.getPontos() <=5) {
				System.out.println("Ainda não");
			} else {
				System.out.println("Muito bem!");
			}
			
			aluno.imprimirBoletim();
			System.out.println("Continua 1- sim ou 6- nao");
			opcao = leia.next().charAt(0);
			
			} else if (opcao == '3') {
				System.out.println("Digite a matricula do aluno: ");
				int matricula = leia.nextInt();
				System.out.println("Digite o cpf do aluno: ");
				String cpf = leia.next();
				
				graduacao aluno = new graduacao(matricula, cpf);
				System.out.println("Digite a nota: ");
				double nota = leia.nextDouble();
				
				
				
			}
		} while(opcao != '6');
		
		System.out.println("FIM DO PROGRAMA");
	}
}
