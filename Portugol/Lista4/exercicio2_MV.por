programa
{
	
	funcao inicio()
	{
		/*2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor
		com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
		contabilize e apresente também quantas foram as ocorrências da maior pontuação.
		*/

		inteiro lanceDados[10]
		real media = 0.0
		inteiro  maiorNumero = 0
		inteiro contador=0

		para(inteiro x=0; x<10; x++) {
			escreva("Digite o numero do lance: ",x+1,": ")
			leia(lanceDados[x])
			media = media + lanceDados[x]
			se(maiorNumero < lanceDados[x]) {
				maiorNumero = lanceDados[x]
				contador=1
			} senao se(maiorNumero == lanceDados[x]) {
				contador++
			}
		}
		media=media/10

		para(inteiro x=0; x<10;x++)
		{
			escreva(lanceDados[x]," | ")
		}
		escreva("\nMedia: ",media,"\nMaior numero: ",maiorNumero,"\nVezes que o Maior numero saiu: ",contador)
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