programa
{
	
	funcao inicio()
	{

	real p, m, limite

	escreva("Olá João, nos informe quantos kilos de tomate você está carregando: ")
	leia(p)

	limite = 50
	m = 4.00

	se (p > 50) {
		escreva("Você deverá pagar multa de ",(p-limite) * m, "R$")
	} senao {
		escreva("Você está isento de multas!")

	}
		
	}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */