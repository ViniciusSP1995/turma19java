package entity;

public class Conta {
	//atributos
	public int numero;
	public String cpf;
	private double saldo = 0;
	public boolean ativa;
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	
	public Conta () {
		
	}
	
	//encapsulamento
	public String getCpf () {
		return cpf;
	}
	
	public int getNumeroConta() {
		return this.numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	//metodo
	public void debito(double valor) {
		if (saldo <=0 || saldo < valor) { //
			System.out.print("Opera��o n�o poder� ser v�lida, pois o saldo ficar� negativo!\n");
		} else if (saldo >=0) {
		saldo = saldo - valor;
			System.out.printf("Movimenta��o realizada com sucesso! Seu saldo agora � de R$: %.2f\n\n",getSaldo());
		}
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
		System.out.printf("Movimenta��o realizada com sucesso! Seu saldo agora � de R$: %.2f\n\n",getSaldo());
	}

	public void SaldoFinal(double valor) {
		saldo = saldo + valor;
	}
}
