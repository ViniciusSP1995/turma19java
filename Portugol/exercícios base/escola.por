programa
{
	inclua biblioteca Util

	cadeia matricula
	cadeia cpf
	logico ativo
	real pontos = 0.00
	caracter tipo
	
	funcao inicio()
	{
		caracter opcao
		faca {
		limpa() 
		escreva("ESCOLA ED LASCAR\n")
		escreva("ENSINADO BEM DESDE A PRÉ-HISTORIA")
		escreva("\n\n")
		//ENTRADA
		escreva("1 - BÁSICO\n")
		escreva("2 - MÉDIO\n")
		escreva("3 - GRADUAÇÃO\n")
		escreva("4 - PÓS\n")
		escreva("5 - MESTRADO\n")
		escreva("6 - SAIR\n")
		escreva("Digite o numero da sua opção: ")
		leia(opcao)
		se(opcao =='6') {
			escreva("Você escolheu sair do programa!")
			Util.aguarde(1000)
		} 
		senao se (opcao =='1') {
			ensinoBasico()
		}
		Util.aguarde(1000)
	}	enquanto (opcao != '6')
	limpa()
	escreva("FIM DE PROGRAMA, VOLTE SEMPRE")
	}

	funcao ensinoBasico()
	{
		real auxpontos = 0.00
		inteiro diaAniversario, dataHoje
		limpa()
		escreva("ESCOLA ED LASCAR\n")
		escreva("ENSINANDO BEM DESDE A PRÉ-HISTÓRIA")
		escreva("Você escolheu ensino básico\n")
		escreva("Digite a matricula: ")
		leia(matricula)
		escreva("Digite o CPF: ")
		leia(cpf)
		escreva("Informe o dia aaniversário: ")
		leia(diaAniversario)
		escreva("NOTAS:\n")
		para (inteiro x=1; x<=10; x++) {
			escreva("Pontos atuais: ",pontos)
			escreva("1-incluir ou 2-ajustar 3-sair: ")
			leia(tipo)

			se(tipo =='1')
			{
				pontos = pontos + auxpontos
			} senao se (tipo =='2'){
				pontos = pontos - auxpontos
			} senao se (tipo =='3') {
				escreva("saindo....")
				pare
			}
		}
		escreva("Qual a data de hoje: ")
		leia(dataHoje)
		se(dataHoje == diaAniversario) {
			pontos = ((pontos*0.01) + pontos)
		}
		escreva("Matricula: ",matricula)
		escreva("Pontos atuais: ",pontos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */