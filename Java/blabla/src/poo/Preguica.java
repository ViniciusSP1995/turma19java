package poo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som, String movimento) {
		super(nome, idade, som, movimento);

	}
	
	//M�todos
	@Override
	public void movimentacao() {
		System.out.println("Este animal sobe em �rvores");
	}
		
	@Override
	public void fazerSom() {
		System.out.println("*Som de pregui�a.*");
	}

}