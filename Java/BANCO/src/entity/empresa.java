package entity;

import java.util.Scanner;

public class empresa extends Conta {
	private double limiteEmpresarial = 10000.00;
	
	Scanner leia = new Scanner(System.in);
	
	public empresa(double limiteEmpresarial) {
		super();
		this.limiteEmpresarial = limiteEmpresarial;
	}

	public double getLimiteEmpresarial() {
		return limiteEmpresarial;
	}

	public void setLimiteEmpresarial(double limiteEmpresarial) {
		this.limiteEmpresarial = limiteEmpresarial;
	}

 public void SolicitarEmprestimoEm() {
	 double valorSolicitadoEmprestimoEmpresarial = 0.00;
  	char auxEmprestimoSimNaoEmpresarial;
  	System.out.println("Gostaria de solicitar o empréstimo empresarial? \n");
		System.out.println("S - Sim ou N - Nao: ");
		auxEmprestimoSimNaoEmpresarial = leia.next().toUpperCase().charAt(0);
		if (auxEmprestimoSimNaoEmpresarial == 'S')
		{ //
			System.out.printf("Seu limite de empréstimo empresarial: %.2f \n",this.limiteEmpresarial);
			System.out.print("DIgite o valor solicitado: ");
			valorSolicitadoEmprestimoEmpresarial = leia.nextDouble();
			if (valorSolicitadoEmprestimoEmpresarial > 0 && valorSolicitadoEmprestimoEmpresarial <= this.limiteEmpresarial)
			{//
				super.SaldoFinal(valorSolicitadoEmprestimoEmpresarial);
				this.limiteEmpresarial = (this.limiteEmpresarial - valorSolicitadoEmprestimoEmpresarial);
			} else { //
				System.out.println("Não foi possível solicitar o empréstimo \n");
			} //
				
		} else if (auxEmprestimoSimNaoEmpresarial == 'N') { //
				
			super.SaldoFinal(super.getSaldo() + 0.00);
 } else { //
		System.out.println("Você não digitou uma opção válida!");
	} //
 }
	
}
