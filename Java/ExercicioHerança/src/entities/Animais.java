package entities;

public class Animais {
	public String nome;
	public int idade;
	
	public Animais(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Animais() {
		
	}
	
	
	public String fazerSom () {
		return "Ele faz esse som: ";
	}

}
