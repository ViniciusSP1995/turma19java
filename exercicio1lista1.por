programa
{
	
	funcao inicio()
	{
	inteiro dias, mes, idadeAno, diasTotais
	escreva("Insira sua idade total em dias, meses e anos!\n")

	escreva("Por favor, insira quantos anos você tem: ")
	leia(idadeAno)
	escreva("Por favor, insira quantos meses você tem: ")
	leia(mes)
	escreva("Por favor, insira quantos dias você tem: ")
	leia(dias)

	diasTotais = idadeAno*365 + mes*30 + dias*1 
	escreva("Sua idade em dias é: ", diasTotais, "!")
	
	
	
	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */