package entities;

public class preguica extends Animais {
	public preguica (String nome, int idade) {
		super (nome,idade);
	}
	
	
	public String movimentacao() {
		return "*********SOBE NA �RVORE!!!*********";
	}
	
	@Override
	public String fazerSom() {
		return "ZZzzZzzzzzzzzZZzzzzzZZZ";
	}
}
