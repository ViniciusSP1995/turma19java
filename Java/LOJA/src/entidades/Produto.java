package entidades;
	
public class Produto {
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque;
	
	public Produto(String descricao, String codigo, double valorUnitario) {
		super(); //classe mãe
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	//encapsulamento - getter and setters

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	
	
	
	//metodos
	public void incluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque = this.qtdeEstoque + valorSerIncluido;
	}
	public void tirarEstoque(int valorSerExcluido) {
		if (this.qtdeEstoque >= valorSerExcluido) {
			this.qtdeEstoque = this.qtdeEstoque - valorSerExcluido;
		}
	}
}
