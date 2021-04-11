package entities;

public class cachorro extends Animais {
	public cachorro(String nome, int idade) {
		super(nome, idade);
	}
	

	public String movimentacao() {
		return ">>>>>>>>>>CORRE!!!>>>>>>>>>>>>>>>";
	}
	
	@Override
	public String fazerSom() {
		return "AU! AU! AU!";
	}
}
