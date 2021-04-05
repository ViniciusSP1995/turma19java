programa
{
	
	funcao inicio()
	
	{
		cadeia nome
		cadeia afirmacao
		
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Você é chefa de família? Digite sim ou não para responder")
		leia(afirmacao)
		
		se(afirmacao == "sim" ou afirmacao == "Sim" ou afirmacao == "SIM" ) {
			escreva("Você tem direito a R$ 1200,00")
			
		} senao se (afirmacao == "não" ou afirmacao == "Não" ou afirmacao =="NAO" ou afirmacao =="nao") {
			escreva("Você tem direito a R$ 600,00 ")
			
		} senao {
			escreva("Não foi possível reconhecer sua resposta")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */