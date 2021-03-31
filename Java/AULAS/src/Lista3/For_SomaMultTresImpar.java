package Lista3;

public class For_SomaMultTresImpar {

	public static void main(String[] args) {
		/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
		múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		*/

		int i;
		int somaImpar = 0;

		for (i = 1; i <= 500; i++) {

		if ( i % 2 == 1 && i % 3 == 0) {
			somaImpar = somaImpar + i;
		}
		}
		System.out.print("A soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500 é: " + somaImpar);

	}

}
