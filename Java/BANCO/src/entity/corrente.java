package entity;

import java.util.Scanner;

public class corrente extends Conta {
	
	private int contadorTalao = 0;
	
		Scanner leia = new Scanner(System.in);
		
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

	public void pediTalao () {
			char opcaoChequeE;
		 do { //
			System.out.println("\n Olá! O Banco 4U disponibilizou Cheque Especial! Digite 1 para aceitar ou digite qualquer outro numero para  não ");
			opcaoChequeE = leia.next().toUpperCase().charAt(0);	
	      	System.out.println("Olá PARABÉNS voce selecionou o cheque especial");
			contadorTalao=contadorTalao+1;
    
		} while (opcaoChequeE == '1' && contadorTalao <=3 ); //
		 System.out.println("\n Não foi possivel solicitar o cheque especial, verifique se já ultilizou 3x ou se esta já  disponivel, \n Obrigado! Volte sempre!");

	}

}
