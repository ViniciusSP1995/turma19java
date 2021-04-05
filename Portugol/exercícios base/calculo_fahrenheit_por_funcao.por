programa
{

	inclua biblioteca Matematica --> mat
	real temp
	
	
	funcao inicio()
	{
		real fahrenheit
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(fahrenheit)
		temperatura(fahrenheit)
	}

	funcao real temperatura(real temp) {
		temp = (temp-32)/1.8
		escreva("Olá, a temperatura em Celsius é: ",mat.arredondar(temp, 2))

		retorne temp
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */