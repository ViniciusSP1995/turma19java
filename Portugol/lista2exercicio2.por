programa
{
	
	funcao inicio()
	{

		real horasTrabalhadas,excesso,salario,limiteHoras,extra,salarioLimite
		
		escreva("Olá, nos informe o número de horas trabalhadas: ")
		leia(horasTrabalhadas)


		se (horasTrabalhadas > 50) {      //horas trablahadas
			
			limiteHoras = 50
			excesso = horasTrabalhadas - limiteHoras
			extra = excesso * 20
			salarioLimite = limiteHoras * 10

			escreva("Você deve receber o total de R$ ",salarioLimite + extra, " com o extra de: R$ ",extra)
			
		} senao {
			salario = horasTrabalhadas * 10
			escreva("Você deve receber o total de R$ ",salario)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */