package entities;

public class cachorro extends Animais {
	public cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	public void deveCorrer( ) {
		System.out.println(">>>>>>>>>>CORRE!!!>>>>>>>>>>>>>>>");
	}
}
