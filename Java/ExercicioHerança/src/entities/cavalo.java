package entities;

public class cavalo extends Animais {
	public cavalo (String nome, int idade) {
	super (nome, idade);
	
}

public String movimentacao() {
	return ">>>>>>>>>>CORRE!!!>>>>>>>>>>>>>>>";
}

@Override
public String fazerSom() {
	return "IRRIIIIIIIIIIINNNNNNN";
}

}
