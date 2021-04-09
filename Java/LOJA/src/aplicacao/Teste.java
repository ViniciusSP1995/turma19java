package aplicacao;

import java.util.Locale;

import entidades.Produto;
import entidades.Revista;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Produto prod1 = new Produto("CAMISA","XL001",100.25);
		Revista prod2 = new Revista ("CRAUDIA","RR0023",25.50,"ABRIL");
		Revista prod2 = new Roupa ("CALÇA","XLQ001",90.50,"ZARA");
		
		prod2.incluirEstoque(10);
		
		System.out.println(prod1.getDescricao()+" R$"+prod1.getValorUnitario()+" estoque"+prod1.getQtdeEstoque());
		prod1.setValorUnitario(80.55);
		prod1.incluirEstoque(20);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque()+" custo total "+(10*prod1.getValorUnitario()));
		prod1.tirarEstoque(10);
		System.out.println(prod1.getDescricao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque());

	}

}
