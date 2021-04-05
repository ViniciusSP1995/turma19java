			escreva("Digite o dia do seu aniversário: ")
			leia(diaAniversario)
			para (inteiro x=1; x<=10; x++) {
				escreva("Saldo Atual: R$ ",saldo,"\n")
				escreva("MOVIMENTO - D-debito ou C-Crédito: ")
				leia(movimento)
				se (movimento == 'D') {
					escreva("Valor movimento: R$ ")
					leia(valorMovimento)
					saldoFinal = saldo - valorMovimento
					
					} senao se (movimento == 'C') {
					escreva("Valor movimento: R$ ")
					leia(valorMovimento)
					saldoFinal = saldo + valorMovimento

					} senao {
						escreva("Não foi possível identificar sua afirmação. Tente novamente: ")
				}
						escreva("Continuar S/N: ")
						leia(continuar)
						se(continuar == 'S') {
							escreva("Movimentação realizada com sucesso!\n")
							escreva("Seu saldo agora é de: R$ ",saldoFinal,"\n\n")
							escreva("Obrigado por utilizar nossos serviços! Volte sempre!")
							pare
						} senao se (continuar == 'N') {
							escreva("Ok, vamos tentar novamente!")
						} senao {
							escreva("Não foi possível identificar sua afirmação")
						}

			}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1062; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */