package Lista1;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double impostoEstado;
		double impostoFabrica;
		double valorInicial;

		System.out.println("Digite o valor inicial: ");
		valorInicial = leia.nextDouble();

		impostoEstado = valorInicial * 0.45;
		impostoFabrica = valorInicial * 0.28;
		double total = valorInicial + impostoEstado + impostoFabrica;

		System.out.printf("O valor de imposto do custo de impostos do Estado é de: R$ %.2f\n", impostoEstado);
		System.out.printf("O valor de imposto do custo de impostos de Fabrica é de: R$ %.2f\n", impostoFabrica);
		System.out.printf("O valor total é de: R$ %.2f  ", total);
		
	}

}
