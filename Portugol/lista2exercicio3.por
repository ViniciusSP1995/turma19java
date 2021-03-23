programa
{
	
	funcao inicio()
	{
		real a,b,c,d,qa,qb,qc,qd

		escreva("Digite 4 números: ")
		leia(a)
		leia(b)
		leia(c)
		leia(d)

		qa = a*a
		qb = b*b
		qc = c*c
		qd = d*d

		se(qc >= 1000) {
			escreva("O valor do terceiro número é: ",qc)
			
		} senao {
			escreva("Os valores e seus respectivos quadrados são: ",a, ": ", qa,", ",b,": ", qb,", ",c, ": ",qc, " e ",d, ": ",qd)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */