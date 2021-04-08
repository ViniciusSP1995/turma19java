package AtividadeClasseObjJava;

public class Cliente {
	public String nome;
	public String dataNascimento;
	public String cpf;
	public String email;
	public String telefone;
	public char genero, afirmacao;
	

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
}
