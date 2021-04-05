programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número: ")
		leia(numero)

		se(numero == 0) {
			escreva("0 é um número neutro")
			
		} senao se (numero < 0) {
			escreva("Este número é negativo")
			
		} senao se  ((numero % 2) == 0) {
			escreva("O número é par")
		} senao {
			escreva("O numero é ímpar")
		}
		se(numero>0){
			escreva(" e positivo!")
		} senao {
			escreva(", não é possível calculá-lo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */