package entity;

import java.util.Scanner;

public class estudantil extends Conta {

		private double limiteEstudantil = 5000;

		Scanner leia = new Scanner(System.in);
		
		public estudantil(double limiteEstudantil) {
			super();
			this.limiteEstudantil = limiteEstudantil;
		}

		public double getLimiteEstudantil() {
			return limiteEstudantil;
		}

		public void setLimiteEstudantil(double limiteEstudantil) {
			this.limiteEstudantil = limiteEstudantil;
		}
		
		public void solicitarEmprestimoES () {
			double valorSolicitadoEmprestimo = 0.00;
	 		 char auxEmprestimoSimNao;
	 		 System.out.println("Gostaria de solicitar o empréstimo estudantil? \n");
	 				 System.out.println("S - Sim ou N - Nao: ");
	 				 auxEmprestimoSimNao = leia.next().toUpperCase().charAt(0);
	 				 if (auxEmprestimoSimNao == 'S')
	 				 { //
	 					 System.out.printf("Seu limite de empréstimo estudantil: %.2f",limiteEstudantil);
	 					 System.out.print("Digite o valor solicitado: ");
	 					 valorSolicitadoEmprestimo = leia.nextDouble();
	 						 if (valorSolicitadoEmprestimo > 0 && valorSolicitadoEmprestimo <= limiteEstudantil)
	 						 { //
	 							super.SaldoFinal(valorSolicitadoEmprestimo);
	 							this.limiteEstudantil = (this.limiteEstudantil - valorSolicitadoEmprestimo);
	 							 
	 						 } //
	 						 else
	 						 { //
	 							 System.out.println("Não foi possível solicitar o empréstimo \n");
	 						 } //
	 				 } //
	 				 else if (auxEmprestimoSimNao == 'N')
	 				 { //
	 					super.SaldoFinal(super.getSaldo() + 0.00);
	 				 } //
	 				 else
	 				 { //
	 					 System.out.println("Você não digitou uma opção válida \n");
	 				 }//
		}
}
