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
			System.out.println("\n Ol�! O Banco 4U disponibilizou Cheque Especial! Digite 1 para aceitar ou digite qualquer outro numero para  n�o ");
			opcaoChequeE = leia.next().toUpperCase().charAt(0);	
	      	System.out.println("Ol� PARAB�NS voce selecionou o cheque especial");
			contadorTalao=contadorTalao+1;
    
		} while (opcaoChequeE == '1' && contadorTalao <=3 ); //
		 System.out.println("\n N�o foi possivel solicitar o cheque especial, verifique se j� ultilizou 3x ou se esta j�  disponivel, \n Obrigado! Volte sempre!");

	}

}
