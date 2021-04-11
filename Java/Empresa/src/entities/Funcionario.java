package entities;

public class Funcionario {
	private String matricula;
	private String nome;
	protected int HorasTrabalhadas;
	protected double valorHoras;
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	public Funcionario(String matricula, String nome, int horasTrabalhadas, double valorHoras) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		HorasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}
	public String getMatricula() {
		return matricula;
	}
	/*public void setMatricula(String matricula) {
		this.matricula = matricula;
	}*/
	public String getNome() {
		return nome;
	}
	/*public void setNome(String nome) {
		this.nome = nome;
	}*/
	public int getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		HorasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHoras() {
		return valorHoras;
	}
	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}

	public double finalSalario() {
		return this.valorHoras*this.HorasTrabalhadas; 
	}
	
}
