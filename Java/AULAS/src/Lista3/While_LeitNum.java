package Lista3;

import java.util.Scanner;

public class While_LeitNum {

	public static void main(String[] args) {

		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final
		o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
		valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar 
		quando o usuário fornecer um valor negativo.
		*/
		Scanner leia = new Scanner(System.in);

		double numero = 0.00;
		double soma = 0.00;
		double media =0.00;
		int contador=0;
		

	 	 while ( numero >= 0) {
	 		System.out.println("Digite um número: ");
	 		numero = leia.nextDouble();
	 		soma = soma + numero;
	 		contador++;
	 		media = soma/contador;
	 		
	 		
	 

	 		
	 	}
	 	 if ( numero <= 0) {
	 		 
	 	 	System.out.println("A soma dos números foi: " + soma);
	 	 	System.out.printf("A média é: %.2f",media);
	 	 	System.out.println("\nA quantidade de números digitados válidos foi de " +  contador);
	 	 	
	 	 }

	}

}
