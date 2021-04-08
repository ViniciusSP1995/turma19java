package Classe;

public class Pessoa {
	//classe nome
	//inicio
	//atributos [e/tem/estar]
	public String nome;
	public int anoNascimento;
	public char genero; //1 - feminino Sra. 2 - masculino Sr. // 3 - Sre
	
	
	//metodos [faz]
	public int calcularIdade() {
		return 2021 - anoNascimento;
	}
	//sobrecarga
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
		
	}
	
	public String tratamento() {
		String saida = "";
		if (genero =='1') {
			saida = "Sra.";
		} else if (genero =='2') {
			saida = "Sr.";
		} else if (genero == '3' ) {
			saida = "Sre.";
		}
		return saida;
	}
	//fim
}
