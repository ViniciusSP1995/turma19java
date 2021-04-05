programa
{
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final
		o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
		valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar 
		quando o usuário fornecer um valor negativo.
		*/

		real numero = 0.00
		real soma = 0.00
		real media =0.00
		inteiro contador=0
		

	 	enquanto ( numero >= 0) {
	 		escreva("Digite um número: ")
	 		leia(numero)
	 		soma = soma + numero
	 		contador++
	 		media = soma/contador
	 		
	 		
	 

	 		
	 	}
	 	 se ( numero <= 0) {
	 	 	limpa()
	 	 	escreva("A soma dos números foi: ",soma, ", a média é: ",media , " e a quantidade de números digitados válidos foi de ",  contador,"\n")
	 	 	
	 	 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */