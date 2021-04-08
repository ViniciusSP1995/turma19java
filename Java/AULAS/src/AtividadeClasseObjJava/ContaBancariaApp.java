package AtividadeClasseObjJava;

import java.util.Scanner;

public class ContaBancariaApp {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o numero da conta: ");
		conta.numero = leia.next();
		System.out.print("Digite o cpf da conta: ");
		conta.cpf = leia.next();
		System.out.println("Digite o valor: ");
		double valor = leia.nextDouble();
		System.out.println("Operação de 1-credito  ou 2-debito?");
		char opcao = leia.next().charAt(0);
		if (opcao =='1') {
			conta.credito(valor);
		} else if (opcao =='2') {
			conta.debito(valor);
		}
		
		System.out.printf("CPF: %s \n",conta.cpf);
		System.out.printf("Numero conta: %s \n",conta.numero);
		System.out.printf("Saldo : %.2f \n",conta.saldo);
		

	}

}
