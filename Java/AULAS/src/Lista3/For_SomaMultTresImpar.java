package Lista3;

public class For_SomaMultTresImpar {

	public static void main(String[] args) {
		/*2- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
		m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
		*/

		int i;
		int somaImpar = 0;

		for (i = 1; i <= 500; i++) {

		if ( i % 2 == 1 && i % 3 == 0) {
			somaImpar = somaImpar + i;
		}
		}
		System.out.print("A soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500 �: " + somaImpar);

	}

}
