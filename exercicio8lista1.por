programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real impostoEstado
		real impostoFabrica
		real valorInicial

		escreva("Digite o valor inicial: ")
		leia(valorInicial)

		impostoEstado = Mat.arredondar((valorInicial * 0.45),2)
		impostoFabrica =Mat.arredondar((valorInicial * 0.28),2)
		real total = Mat.arredondar((valorInicial + impostoEstado + impostoFabrica),2)

		escreva("O valor de imposto do custo de impostos do Estado é de R$ ", impostoEstado,"\n")
		escreva("O valor de imposto do custo de impostos de Fabrica é de R$ ", impostoFabrica,"\n")
		escreva("O valor total é de R$ ", total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */