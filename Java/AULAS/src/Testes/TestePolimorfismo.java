package Testes;

public class TestePolimorfismo {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Robben");
		fisica.setCpf(45452112);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Ribery");
		juridica.setCnpj(21231553);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;

		for(Pessoa1 pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	}

}
