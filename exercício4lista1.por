programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real a, b, c
		
		escreva("Olá, digite o primeiro número: ")
		leia(a)
		limpa()
		
		escreva("Agora, digite o segundo número: ")
		leia(b)
		limpa()
		
		escreva("Por último, digite o terceiro número: ")
		leia(c)
		limpa()

		real R = Mat.potencia((a+b), 2.0)
		real S = Mat.potencia((b+c), 2.0)
		real D = R + S / 2

		escreva("O resultado da expressão é: ", D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */