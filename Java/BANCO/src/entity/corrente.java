package entity;

import java.util.Scanner;

public class corrente extends Conta {
	private int contadorTalao;

	public corrente(int contadorTalao) {
		super();
		this.contadorTalao = contadorTalao;
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

	public void pediTalao (int contadorTalao) {
		System.out.println("Olá PARABÉNS voce selecionou o cheque especial");
		contadorTalao++;
	}

}
