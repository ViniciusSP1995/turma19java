package Lista3;

import java.util.Scanner;

public class While_LeitNum {

	public static void main(String[] args) {

		/*1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final
		o total do somat�rio, a m�dia e o total de valores lidos. O programa deve fazer as leituras dos 
		valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o programa deve parar 
		quando o usu�rio fornecer um valor negativo.
		*/
		Scanner leia = new Scanner(System.in);

		double numero = 0.00;
		double soma = 0.00;
		double media =0.00;
		int contador=0;
		

	 	 while ( numero >= 0) {
	 		System.out.println("Digite um n�mero: ");
	 		numero = leia.nextDouble();
	 		soma = soma + numero;
	 		contador++;
	 		media = soma/contador;
	 		
	 		
	 

	 		
	 	}
	 	 if ( numero <= 0) {
	 		 
	 	 	System.out.println("A soma dos n�meros foi: " + soma);
	 	 	System.out.printf("A m�dia �: %.2f",media);
	 	 	System.out.println("\nA quantidade de n�meros digitados v�lidos foi de " +  contador);
	 	 	
	 	 }

	}

}
