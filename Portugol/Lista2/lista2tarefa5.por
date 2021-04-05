programa
{

	funcao inicio()
	{

	real indicePoluicao = 0.00

	escreva("Por favor, informe o indice de poluição atual: ")
	leia(indicePoluicao)

	se (indicePoluicao >= 0.30 e indicePoluicao < 0.39) {
		escreva("Industrias do primeiro grupo, suas atividades estão suspensas devido ao indice de poluição ter atingido ou ultrapassado ao limite: 0.30")
		
	} senao se (indicePoluicao >= 0.40 e indicePoluicao <= 0.49) {
		escreva("Industrias do primeiro grupo, suas atividades estão suspensas devido ao indice de poluição ter atingido ou ultrapassado ao limite: 0.40")
	} senao se (indicePoluicao >= 0.50) {
		escreva("Industrias de todos os grupos, suas atividades estão suspensas devido indice de poluição ter atingido ou ultrapassado ao limite: 0.50")
		
	} senao {
		escreva("Suas atividades podem seguir normalmente")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */