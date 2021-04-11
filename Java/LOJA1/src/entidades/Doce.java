package entidades;

public class Doce extends Produto{
	private String fabricante;

	public Doce(String descricao, String codigo, double valorUnitario, String fabricante) {
		super(descricao, codigo, valorUnitario);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
