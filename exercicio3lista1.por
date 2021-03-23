programa
{
	
	funcao inicio()
	{
		inteiro tempoSegundos, horas, minutos, segundos
		escreva("digite o total de segundos do evento: ")
		leia(tempoSegundos)
		horas = tempoSegundos/3600
		minutos = (tempoSegundos % 3600)/60
		segundos = (tempoSegundos % 3600) % 60

		escreva("o tempo do evento é ",horas," hrs ", minutos," min ",segundos," seg")
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */