programa
{ /*Receber valores de base e altura de um triângulo e verificar se são valores válidos 
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	*/
	
	funcao inicio()
	{
		inteiro base, altura
		real areaTriangulo

		escreva("Digite a base do triângulo: ")
		leia(base)
		escreva("Digite a altura do triângulo: ")
		leia(altura)

		se(altura > 0 e base > 0) {
			areaTriangulo = (base * altura)/2
			escreva("A área do triângulo é: ",areaTriangulo)
		} senao {
			escreva("Não foi possível calcular a área do triângulo")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */