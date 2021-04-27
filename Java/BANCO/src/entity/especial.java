package entity;

import java.util.Scanner;

public class especial extends Conta {
	Scanner leia = new Scanner(System.in);
	
	private double limite = 1000;
	
	public especial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void aplicarLimite() {
			char opcaoEmprestimo = ' ';
			double valorEmprestimo = 0.00;
			System.out.printf("Impossível realizar esse débito, deseja realizar um empréstimo? (1 - S| 2 - N) [LIMITE R$ %.2f]\n", limite);
			opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
			
			if(opcaoEmprestimo == '1') { //
				
				System.out.printf("Qual o valor do empréstimo? [LIMITE R$ %.2f]\n",limite);
				valorEmprestimo = leia.nextDouble();
				
				if(valorEmprestimo > limite) { //
					System.out.println("Seu limite não permite isso!");
				} //
				else if(valorEmprestimo <= limite) { //
					super.SaldoFinal(valorEmprestimo);
					limite = limite - valorEmprestimo;//
				} //
			} 	
}
}