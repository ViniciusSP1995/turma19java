programa
{
	inclua biblioteca Util
	
		inteiro numero, contadorTalao=0
		cadeia cpf
		real limite, emprestimoEmpresa, limiteEstudantil
		logico status
		caracter opcao, continuar
		cadeia tipo
		real saldo = 0.00, valorMovimento = 0.00, saldoFinal = 0.00
	
	funcao inicio(){	
			
		faca {
		limpa()
		escreva("[BANCO GRUPO 4]\n")
		escreva("[O SEU LUGAR É AQUI]\n\n\n")
		escreva("1-CONTA POUPANÇA\n2-CONTA CORRENTE\n3-CONTA ESPECIAL\n4-CONTA EMPRESA\n5-CONTA ESTUDANTIL\n6-SAIR\n\n")
		
		escreva("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
		leia(opcao)
		
		se(opcao == '1') {  //conta poupança (vinny)
			caracter movimento
			inteiro  diaAniversario
			tipo = "POUPANÇA"
			cabecalho(tipo)
			escreva("Saldo Atual: R$ ",saldo,"\n")

			escreva("Deseja fazer alguma movimentação, S/N: ")
			leia(movimento)

			se (movimento == 'S') {
				movimentacaoPoupanca ()
				
			} senao se (movimento == 'N') {
				escreva("Obrigado por utilizar nossos serviços!\n")
				
			}senao {
				escreva("Não possível identificar sua afirmação")
			}
			Util.aguarde(2000)
		
		} senao se (opcao == '2') { //conta corrente (maya)
			caracter opcaoMovimentacao
			tipo = "CORRENTE"
			cabecalho(tipo)
			escreva("Saldo Atual: R$ ",saldo,"\n")

			escreva("Deseja fazer alguma movimentação, S/N: ")
			leia(opcaoMovimentacao)
			
			se (opcaoMovimentacao == 'S'){
				movimentacaoCorrente ()
				
			} senao se(opcaoMovimentacao == 'N') {
				escreva("Obrigado por utilizar nossos serviços!\n")
				
			}senao{
				escreva("Não foi possível identificar sua afirmação")
			}
			
			// chama aqui FUNÇAO CONTA CORRENTE (MAYA)
			chequeEspecial() 
			
			Util.aguarde(2000)
			
		} senao se (opcao == '3') {
			escreva("\nCONTA [ESPECIAL]")
			Util.aguarde(2000)
		} senao se (opcao == '4') {
			escreva("\nCONTA [EMPRESA]")
			Util.aguarde(2000)
		} senao se (opcao == '5') {
			escreva("\nCONTA [ESTUDANTIL]")
			Util.aguarde(2000)
		} senao se (opcao == '6') {
			escreva("\nObrido por utilizar nossos serviços!\n\n")
			pare
		} senao {
			escreva("NÃO FOI POSSÍVEL IDENTIFICAR A OPÇÃO!\n")
			Util.aguarde(2000)
		}


		
		}	enquanto (opcao != '6')
			escreva("FIM DE PROGRAMA!")
			// chama aqui FUNÇAO CONTA CORRENTE (MAYA)
			chequeEspecial () 
	}

		funcao cabecalho(cadeia tipo) {
			caracter aux
			limpa()
			escreva("[BANCO DO BRASIL]\n")
			escreva("[O SEU LUGAR É AQUI]\n\n\n")
			escreva("CONTA ",tipo,"\n")
			escreva("Informe o número da sua conta: ")
			leia(numero)
			escreva("Informe seu CPF: ")
			leia(cpf)
			escreva("1 - Ativo ou 2 - Inativo: ")
			leia(aux)
			se (aux == '1') {
				status = verdadeiro
		} senao {
				status = falso
		}
		}

        funcao chequeEspecial () {
		inteiro opcaoChequeE
		faca{
			escreva("\n olá, você tem disponivel cheque especial. digite 1 para sim ou digite qualquer outro numero para  não ")
			leia( opcaoChequeE )	
	      	escreva ("Olá PARABÉNS voce selecionou o cheque especial")
			contadorTalao=contadorTalao+1
       
		} enquanto (opcaoChequeE==1 e contadorTalao <=3 ) 
			escreva("\n Não foi possivel solicitar o cheque especial, verifique se já ultilizou 3x ou se esta já  disponivel, \n Obrigado. volte sempre")
		
        }
        funcao movimentacaoPoupanca () { //viny - conta poupança
        	caracter movimento
        	inteiro diaAtual, diaAniversario
        	para (inteiro x=1; x<=10; x++) {
        		escreva("NOVA MOVIMENTACAO \n\n")
        		escreva("Saldo Atual: R$ ",saldo,"\n")
        		escreva("Digite o dia de hoje ")
        		leia(diaAtual)
        		escreva("MOVIMENTO - D-debito ou C-Crédito: ")
        		leia(movimento)
        		
        		se (movimento == 'D') {
        			escreva("Valor movimento: R$ ")
        			leia(valorMovimento)

        			se( saldo < 0) {
        				escreva("Operação não poderá ser válida, pois o saldo ficará negativo!\n")
					//Não consegui impedir o programa de fazer operações com o saldo negativo
        			} senao se (saldo >=0) {
        			saldoFinal = saldo-valorMovimento
        			saldo = saldoFinal
        			     escreva("Seu saldo agora é de: R$ ",saldoFinal,"\n\n")
        				escreva("Movimentação realizada com sucesso!\n")	
        			}
        		} senao se (movimento == 'C') {
        			escreva("Valor movimento: R$ ")
        			leia(valorMovimento)
        			saldoFinal = saldo + valorMovimento
        			saldo=saldoFinal
        			escreva("Digite qual dia você faz aniversário: ")
        			leia(diaAniversario)
        			se (diaAtual == diaAniversario) {
        				escreva("Parabéns! Você ganhou 5% com base no seu saldo!")
        				saldoFinal = (saldo * 0.05) + saldo
        				escreva("Seu saldo agora e de: R$ ",saldoFinal,"\n\n")
        				saldo = saldoFinal
        				escreva("Movimentação realizada com sucesso!\n")
        			} senao se ( diaAtual != diaAniversario) {
        				escreva("Seu saldo agora é de: R$ ",saldoFinal,"\n\n")
        				escreva("Movimentação realizada com sucesso!\n")

        			}
        		} senao {
        			escreva("Não foi possível identificar sua afirmação. Tente novamente \n ")
        		}
        		
        		escreva("Obrigado por utilizar nossos serviços!\n")
			
        		escreva("Continuar fazendo movimentações S/N: ")
        		leia(continuar)
        		se(continuar =='S') {
        			escreva("Ok, vamos tentar novamente! \n")
        		} senao se (continuar =='N') {
        			escreva("Obrigado por utilizar nossos serviços! Volte sempre! \n")
        			pare
        		} senao {
        			escreva("Não foi possível identificar sua afirmação \n")
        		}
        	}
        }

        funcao movimentacaoCorrente (){
        	caracter movimento
        	para (inteiro x=1; x<=10; x++) {
        		escreva("NOVA MOVIMENTACAO \n\n")
			escreva("Saldo Atual: R$ ",saldo,"\n")
			escreva("MOVIMENTO - D-debito ou C-Crédito: ")
			leia(movimento)
			se (movimento == 'D') {
				escreva("Valor movimento: R$ ")
				leia(valorMovimento)
				saldoFinal = saldo-valorMovimento
				saldo=saldoFinal

			} senao se (movimento == 'C') {
				escreva("Valor movimento: R$ ")
				leia(valorMovimento)
				saldoFinal = saldo + valorMovimento
				saldo=saldoFinal

			} senao {
				escreva("Não foi possível identificar sua afirmação. Tente novamente \n  ")
			}
			escreva("Movimentação realizada com sucesso!\n")
			escreva("Seu saldo agora é de: R$ ",saldoFinal,"\n\n")
			escreva("Obrigado por utilizar nossos serviços!\n")
			     
			escreva("Continuar fazendo movimentações S/N: ")
			leia(continuar)
			se(continuar == 'S') {
				escreva("Ok, vamos tentar novamente! \n")
			} senao se (continuar == 'N') {
				escreva("Obrigado por utilizar nossos serviços! Volte sempre! \n")
				pare
			} senao {
				escreva("Não foi possível identificar sua afirmação \n")
			}
			
		  }
        }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */