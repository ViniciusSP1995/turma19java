programa
{
	
	funcao inicio()
	{
		cadeia nomeTimes[4] = {"SEP","SANTOS","SPFC","SCCP"}
		inteiro pontosPorTime[4]
		caracter resultado //g=3/p=0/e=1

		para (inteiro rodada = 1; rodada <= 4; rodada++){
			escreva("Rodada: ",rodada,"\n")
			para (inteiro y=0; y<4; y++)
			{
				escreva(nomeTimes[y],"\n")
				escreva("G-ganhou, P-perdeu ou E-empatou :")
				leia(resultado)
				se (resultado =='G' ou resultado =='g'){
					pontosPorTime[y] = pontosPorTime[y] + 3 //totalizador
				}	
				senao se (resultado =='E' ou resultado =='e'){
					pontosPorTime[y] = pontosPorTime[y] + 1
				}
				senao se (resultado =='P' ou resultado =='p'){
					pontosPorTime[y] += 0
				}
			}
			escreva("RESULTADOS\n")
			para (inteiro x=0; x<4; x++){
				escreva(nomeTimes[x],"\tpontos: ",pontosPorTime[x],"\n")	
			}
			

		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */