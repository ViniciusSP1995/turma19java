programa
{
	
	funcao inicio()
	{
		inteiro diasDeVida, dias, meses, anos

		
		
		escreva("informe seus dias de vida: ")
		leia(diasDeVida)
		anos = diasDeVida/365
		meses = (diasDeVida % 365) / 30 
		dias = (diasDeVida % 365) % 30

		escreva("Sua idade é ",anos, " anos ", meses, " meses e ", dias, " dias")
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */