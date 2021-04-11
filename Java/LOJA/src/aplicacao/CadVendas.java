package aplicacao;

import java.util.Scanner;

import entidades.Loja;
import entidades.Roupa;

public class CadVendas {

	public static void main(String[] args) {
		int opcao = 0;
		boolean sair = true;
		int carrinho1 = 0;
		int carrinho2 = 0;
		int carrinho3 = 0;
		int carrinho4 = 0;
		int carrinho5 = 0;
		int quantidade;
		double total;
		boolean confirma1 = true; 
		boolean confirma2 = true;
		boolean confirma3 = true;
		boolean confirma4 = true;
		boolean confirma5 = true;
		double imposto = 0;
		Scanner leia = new Scanner(System.in);

		Loja loja = new Loja("4U", "20.090.010/0001-02");
		Roupa prod1 = new Roupa("São Paulo", "S003", 200, 2, "Adidas");
		Roupa prod2 = new Roupa("Corinthians", "C000", 150, 2, " Nike ");
		Roupa prod3 = new Roupa("Santos", "S001", 200, 2, "Umbro");
		Roupa prod4 = new Roupa("Palmeiras", "P002", 200, 2, "Adidas");
		Roupa prod5 = new Roupa("Flamengo", "F003", 200, 2, "Adidas");

		System.out.println("LOJA 4U - O SEU LUGAR É AQUI");
		System.out.println("SEJA BEM VINDE!! =D");

		do {
			System.out.println("\nCamisetas: \n");
			System.out.println("1 - São Paulo");
			System.out.println("2 - Corinthians");
			System.out.println("3 - Santos");
			System.out.println("4 - Palmeiras");
			System.out.println("5 - Flamengo");
			System.out.println("6 - Carrinho");
			System.out.println("7 - Sair");
			System.out.println();
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();
			System.out.println();

			if (opcao == 1) {
				if (confirma1 == true) {
					System.out.printf("Time: %s | R$ %.2f | Marca: %s | Quantidade de itens no estoque: (%d)",
							prod1.getDescricao(), prod1.getValorUnitario(), prod1.getMarca(), prod1.getQtdeEstoque());
					System.out.print("\n\nQuantos itens você gostaria de comprar? ");
					quantidade = leia.nextInt();
					if (quantidade <= prod1.getQtdeEstoque() && quantidade > 0) {
						prod1.tirarEstoque(quantidade);
						carrinho1 = carrinho1 + quantidade;
						confirma1 = false;
					} else if (quantidade > prod1.getQtdeEstoque()) {
						System.out.println("Quantidade de estoque não disponível");
					} else {
						System.out.println("Quantidade inválida");
					}
				} else {
					System.out.println("Você não pode comprar este item");
				}
			} else if (opcao == 2) {
				if (confirma2 == true) {
					System.out.printf("1 - Você escolheu %s | R$ %.2f | %s | Quantidade de itens no estoque: (%d)",
							prod2.getDescricao(), prod2.getValorUnitario(), prod2.getMarca(), prod2.getQtdeEstoque());
					System.out.println("\n\nQuantos itens você gostaria de comprar? ");
					quantidade = leia.nextInt();
					if (quantidade <= prod2.getQtdeEstoque() && quantidade > 0) {
						prod2.tirarEstoque(quantidade);
						carrinho2 = carrinho2 + quantidade;
						confirma2 = false;
					} else if (quantidade > prod2.getQtdeEstoque()) {
						System.out.println("Quantidade de estoque não disponível");
					} else {
						System.out.println("Quantidade inválida");
					}
				} else {
					System.out.println("Você não pode comprar este item");
				}
			} else if (opcao == 3) {
				if (confirma3 == true) {
					System.out.printf("1 - Você escolheu %s | R$ %.2f | %s | Quantidade de itens no estoque: (%d)",
							prod3.getDescricao(), prod3.getValorUnitario(), prod3.getMarca(), prod3.getQtdeEstoque());
					System.out.println("\n\nQuantos itens você gostaria de comprar? ");
					quantidade = leia.nextInt();
					if (quantidade <= prod3.getQtdeEstoque() && quantidade > 0) {
						prod3.tirarEstoque(quantidade);
						carrinho3 = carrinho3 + quantidade;
						confirma3 = false;
					} else if (quantidade > prod3.getQtdeEstoque()) {
						System.out.println("Quantidade de estoque não disponível");
					} else {
						System.out.println("Quantidade inválida");
					}
				} else {
					System.out.println("Você não pode comprar este item");
				}
			} else if (opcao == 4) {
				if (confirma4 == true) {
					System.out.printf("1 - Você escolheu %s | R$ %.2f | %s | Quantidade de itens no estoque: (%d)",
							prod4.getDescricao(), prod4.getValorUnitario(), prod4.getMarca(), prod4.getQtdeEstoque());
					System.out.println("\n\nQuantos itens você gostaria de comprar? ");
					quantidade = leia.nextInt();
					if (quantidade <= prod4.getQtdeEstoque() && quantidade > 0) {
						prod4.tirarEstoque(quantidade);
						carrinho4 = carrinho4 + quantidade;
						confirma4 = false;
					} else if (quantidade > prod4.getQtdeEstoque()) {
						System.out.println("Quantidade de estoque não disponível");
					} else {
						System.out.println("Quantidade inválida");
					}
				} else {
					System.out.println("Você não pode comprar este item");
				}
			} else if (opcao == 5) {
				if (confirma5 == true) {
					System.out.printf("1 - Você escolheu %s | R$ %.2f | %s | Quantidade de itens no estoque: (%d)",
							prod5.getDescricao(), prod5.getValorUnitario(), prod5.getMarca(), prod5.getQtdeEstoque());
					System.out.println("\n\nQuantos itens você gostaria de comprar? ");
					quantidade = leia.nextInt();
					if (quantidade <= prod5.getQtdeEstoque() && quantidade > 0) {
						prod5.tirarEstoque(quantidade);
						carrinho5 = carrinho5 + quantidade;
						confirma5 = false;
					} else if (quantidade > prod5.getQtdeEstoque()) {
						System.out.println("Quantidade de estoque não disponível");
					} else {
						System.out.println("Quantidade inválida");
					}
				} else {
					System.out.println("Você não pode comprar este item");
				}
			} else if (opcao == 6) {
				if  (confirma1 == false || confirma2 == false || confirma3 == false || confirma4 == false || confirma5 == false) {
					System.out.printf("LOJA %s%nCNPJ %s%nNº NOTA FISCAL 5565%n", loja.getNome(), loja.getCnpj());
					if (confirma1 == false) {
						System.out.printf("Item: %s | Valor Unitário %.2f | Qtde %d | Valor: %.2f%n",
								prod1.getDescricao(), prod1.getValorUnitario(), carrinho1,
								(carrinho1 * prod1.getValorUnitario()));
					}
					if (confirma2 == false) {
						System.out.printf("Item: %s | Valor Unitário %.2f | Qtde %d | Valor: %.2f%n",
								prod2.getDescricao(), prod2.getValorUnitario(), carrinho2,
								(carrinho2 * prod2.getValorUnitario()));
					}
					if (confirma3 == false) {
						System.out.printf("Item: %s | Valor Unitário %.2f | Qtde %d | Valor: %.2f%n",
								prod3.getDescricao(), prod3.getValorUnitario(), carrinho3,
								(carrinho3 * prod3.getValorUnitario()));
					}
					if (confirma4 == false) {
						System.out.printf("Item: %s | Valor Unitário %.2f | Qtde %d | Valor: %.2f%n",
								prod4.getDescricao(), prod4.getValorUnitario(), carrinho4,
								(carrinho4 * prod4.getValorUnitario()));
					}
					if (confirma5 == false) {
						System.out.printf("Item: %s | Valor Unitário %.2f | Qtde %d | Valor: %.2f%n",
								prod5.getDescricao(), prod5.getValorUnitario(), carrinho5,
								(carrinho5 * prod5.getValorUnitario()));
					}
					total = (prod1.getValorUnitario() * carrinho1) + (prod2.getValorUnitario() * carrinho2)
							+ (prod3.getValorUnitario() * carrinho3) + (prod4.getValorUnitario() * carrinho4)
							+ (prod5.getValorUnitario() * carrinho5);
					System.out.println("Total: " + total);
					imposto = (total * 0.09);
					do {
						System.out.println("Forma de pagamento: 1 - Dinheiro 2 - Cartão de Débito 3 - Cartão de Crédito : ");
						opcao = leia.nextInt();
					} while (opcao != 1 && opcao != 2 && opcao != 3);
	
					if (opcao == 1) {
						double desconto = total * 0.1;
						total = total - desconto;
						System.out.printf("Imposto: %.2f%nDesconto: %.2f%nTotal Compra: %.2f%n", imposto, desconto, total);
					} else if (opcao == 2) {
						System.out.printf("Imposto: %.2f%nTotal Compra: %.2f%n", imposto, total);
					} else if (opcao == 3) {
						do {
							System.out.println("1 - Parcela 1x [10% Juros] 2 - Parcela 2x [20% Juros]");
							opcao = leia.nextInt();
						} while (opcao != 1 && opcao != 2);
						if (opcao == 1) {
							double juros10 = total * 0.1;
							total = total + juros10;
							System.out.printf("Imposto: %.2f%nJuros: %.2f%nValor Parcela: %.2f%nTotal Compra: %.2f%n",
									imposto, juros10, total, total);
						} else if (opcao == 2) {
							double juros20 = total * 0.2;
							total = total + juros20;
							System.out.printf("Imposto: %.2f%nJuros: %.2f%nValor Parcela: %.2f%nTotal Compra: %.2f%n",
									imposto, juros20, (total / 2), total);
						}
	
					}
	
					confirma1 = true;
					confirma2 = true;
					confirma3 = true;
					confirma4 = true;
					confirma5 = true;
					carrinho1 = 0;
					carrinho2 = 0;
					carrinho3 = 0;
					carrinho4 = 0;
					carrinho5 = 0;
				}
				else {
					System.out.println("Não há itens no carrinho");
				}
			} else if (opcao == 7) {
				sair = false;
			} else {
				System.out.println("Opção Inválida. Tente novamente.");
			}

		} while (sair == true);

	} // Chave do main
} // Chave da classe