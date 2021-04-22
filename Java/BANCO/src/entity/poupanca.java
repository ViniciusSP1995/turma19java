package entity;

public class poupanca extends Conta {
	private int diaAniversario;

	public poupanca(int diaAniversario) {
		super();
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	public void bonusAniversario (int diaAtual) {
		
		if (diaAniversario == diaAtual) {
			
			System.out.println("Parabéns! Você ganhou 5% com base no seu saldo!");
			super.SaldoFinal(super.getSaldo() * 0.05);

		}
		else if (diaAniversario != diaAtual) {
		System.out.printf("Seu saldo agora é de R$: %.2f\n\n",getSaldo());
		
	}
		
	}
}
