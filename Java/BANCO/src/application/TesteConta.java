package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;
import entity.corrente;
import entity.empresa;
import entity.especial;
import entity.estudantil;
import entity.poupanca;

public class TesteConta {



	public static void main(String[] args) {
		char opcao;
		char continuar, opcaoMovimentacao;
		double valorMovimento = 0.00;
		char movimento, operacao;
		double limiteEmpresarial = 10000.00;
		int x;
		char aux = ' ';
		int contadorTalao = 0;
		double limite= 1000;
		double limiteEstudantil = 10000;
		
		Locale.setDefault(Locale.US);
		
		Conta conta = new Conta();
		
		Scanner leia = new Scanner(System.in);
		
		
		
		do { //
			System.out.println("BANCO 4U - G4");
			System.out.println("O SEU LUGAR � AQUI!!!! =D");
			System.out.print("1 - CONTA POUPAN�A \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESA \n5 - CONTA ESTUDANTIL \n6 - SAIR \n\n");
			System.out.print("Digite a op��o desejada: ");
			opcao = leia.next().charAt(0);
			
			if (opcao == '1') { // Vinny
				System.out.println("Digite o dia do seu anivers�rio: ");
				int diaAniversario = leia.nextInt();
				poupanca contaP = new poupanca(diaAniversario);
				System.out.println("CONTA POUPAN�A");
				System.out.println("[BANCO 4U - G4]\n");
				System.out.println("[O SEU LUGAR � AQUI]\n\n\n");
				System.out.print("Digite o n�mero da conta: " );
				conta.numero = leia.nextInt();
				System.out.print("Informe seu CPF: ");
				conta.cpf = leia.next();
				System.out.print("1 - Ativa ou 2 - Inativo: ");
				aux = leia.next().charAt(0);
				
				if (aux == '2') {
					break;
				}
				System.out.printf("Saldo Atual R$: %.2f\n",contaP.getSaldo());
				System.out.print("Deseja fazer alguma movimenta��o? S/N ");
				movimento = leia.next().toUpperCase().charAt(0);
				
				if (movimento == 'S') {
					for (x = 1; x <=10; x++) {
						
						System.out.printf("Movimenta��o %d\n",x);
						System.out.printf("Saldo Atual R$: %.2f",contaP.getSaldo());
						
						System.out.print("\nMOVIMENTO D - D�bito ou C - Cr�dito: ");
						operacao = leia.next().toUpperCase().charAt(0);
						if (operacao == 'D') {
							System.out.print("Valor do movimento R$: ");
							valorMovimento = leia.nextDouble();
							contaP.debito(valorMovimento);						
						}else if (operacao == 'C') {
								System.out.print("Valor do movimento R$: ");
								valorMovimento = leia.nextDouble();
								contaP.credito(valorMovimento);
								
							} else {
								System.out.print("N�o foi poss�vel identificar sua afirma��o. Tente novamente \n ");
							} 
							System.out.println("Obrigade por utilizar nossos servi�os!\n");
							
							
							System.out.print("Continuar fazendo movimenta��es S/N: ");
							continuar = leia.next().toUpperCase().charAt(0);
							
							if (continuar == 'S') {
								System.out.print("Ok, vamos tentar novamente!\n");
								
							} else if (continuar == 'N' || x == 10) {
								System.out.print("Digite o dia de hoje: ");
								int diaAtual = leia.nextInt();
								contaP.bonusAniversario(diaAtual);
								System.out.printf("Seu saldo agora � de R$: %.2f\n\n",contaP.getSaldo());
								System.out.println("Movimenta��o realizada com sucesso!");
								 System.out.println("Obrigade por utilizar nossos servi�os! Volte sempre!!");
								 break;
							}
							else {
								System.out.println("N�o foi poss�vel identificar sua afirma��o");
							} 
						}
					if (x == 11) {
							System.out.println("Voc� excedeu o limite de tentativas!");
						}
				} 
					else if (movimento == 'N') {
							System.out.println("Obrigade por utilizar nosso servi�os!\n");
							
					} else {
						System.out.println("N�o foi poss�vel identificar sua afirma��o");
					}
						
					}
				
				else if (opcao == '2') { // Maya
					corrente contaC = new corrente(contadorTalao);
					System.out.print("VOC� ESCOLHEU CONTA CORRENTE");
					System.out.println("[BANCO 4U - G4]\n");
					System.out.print("[O SEU LUGAR � AQUI]\n\n\n");
					System.out.print("Digite o n�mero da conta: " );
					conta.numero = leia.nextInt();
					System.out.print("\nInforme seu CPF: ");
					conta.cpf = leia.next();
					System.out.print("1 - Ativo ou 2 - Inativo: ");
					aux = leia.next().charAt(0);
					
					if (aux == '2') {
						break;
					} 
					System.out.printf("Saldo Atual R$: %.2f\n", contaC.getSaldo());
					
					System.out.print("Deseja fazer alguma movimenta��o? S/N: ");
					opcaoMovimentacao = leia.next().toUpperCase().charAt(0);
					
					if (opcaoMovimentacao == 'S') {
				      	for (x=1; x<=10; x++) {
				      		System.out.print("NOVA MOVIMENTACAO \n\n");
							System.out.printf("Saldo Atual R$: %.2f \n",contaC.getSaldo());
							System.out.print("MOVIMENTO - D-debito ou C-Cr�dito: ");
							movimento = leia.next().toUpperCase().charAt(0);
							if (movimento == 'D') {
								System.out.print("Valor movimento R$: ");
								valorMovimento = leia.nextDouble();
								contaC.debito(valorMovimento);
							} else if (movimento == 'C') {
								System.out.print("Valor movimento R$: ");
								valorMovimento = leia.nextDouble();
								contaC.credito(valorMovimento);
							} else {
								System.out.println("N�o foi poss�vel identificar sua afirma��o. Tente novamente \n  ");
							}
							System.out.println("Obrigade por utilizar nossos servi�os!\n");
							     
							System.out.print("Continuar fazendo movimenta��es S/N: ");
							continuar = leia.next().toUpperCase().charAt(0);
							
							if (continuar == 'S') {
								System.out.println("Ok, vamos tentar novamente! \n");
							} else if (continuar == 'N') {
								System.out.println("Obrigado por utilizar nossos servi�os! Volte sempre! \n");
								break;
							} else {
								System.out.println("N�o foi poss�vel identificar sua afirma��o \n");
							}

				      	}
					} else if(opcaoMovimentacao == 'N') {
						System.out.println("Obrigado por utilizar nossos servi�os!\n");
					} else {
						System.out.println("N�o foi poss�vel identificar sua afirma��o");
					} 
						contaC.pediTalao();
						
				}
				
				else if (opcao  == '3') { //livia
					especial contaE = new especial(limite);
					for (x=1; x<=10; x++) { 
						System.out.printf("Movimenta��o: %d\n",x);
						System.out.printf("Saldo Atual R$: %.2f\n ",contaE.getSaldo());
						System.out.printf("Seu limite � de R$: %.2f\n",contaE.getLimite());
						System.out.print("MOVIMENTO - D-d�bito ou C- Cr�dito: ");
						movimento = leia.next().toUpperCase().charAt(0);
						
						if (movimento == 'D') {
							
							System.out.print("Valor movimento R$: ");
							valorMovimento = leia.nextDouble();
							if (contaE.getSaldo() < valorMovimento) {
								contaE.aplicarLimite();
							}
							
							else if (contaE.getSaldo() >= valorMovimento) {
								contaE.debitoContaEspecial(valorMovimento);
							} 
						} 
						else if (movimento == 'C') {
							
							System.out.print("Valor movimento R$: \n");
							valorMovimento = leia.nextDouble();
							contaE.credito(valorMovimento);
						} 
						
						else {
							System.out.println("N�o foi poss�vel identificar sua afirma��o. Tente novamente: ");
						}
						
						System.out.println("Continuar S/N: ");
						continuar = leia.next().toUpperCase().charAt(0);
						
						if (continuar == 'N') {
							
							System.out.print("Movimenta��o realizada com sucesso!\n");
							System.out.printf("Seu saldo agora � de R$: %.2f \n",contaE.getSaldo());
							System.out.println("Obrigado por utilizar nossos servi�os! Volte sempre!");
							
							break;
						}
						
						else if (continuar == 'S') {
							
							System.out.println("Ok, aguarde um minuto!");
						} 
						
						else {
							
							System.out.println("N�o foi poss�vel identificar sua afirma��o. Tente novamente: ");
						}
					}
			
					System.out.println("\n CONTA [ESPECIAL]");
				} // livia
				
				else if (opcao == '4') {
					empresa contaEm = new empresa(limiteEmpresarial);
					
					System.out.println("CONTA EMPRESA");
					char auxMovimento;
					char auxContinuar;
					System.out.println("[BANCO 4U - G4]\n");
					System.out.println("[O SEU LUGAR � AQUI]\n\n\n");
					System.out.println("Digite o n�mero da conta: " );
					conta.numero = leia.nextInt();
					System.out.println("Informe seu CPF: ");
					conta.cpf = leia.next();
					System.out.print("1 - Ativo ou 2 - Inativo: ");
					System.out.println();
					
					if (aux == 2) {
						break;
					}
					 
					for(x=1; x<= 10;x ++) {
						System.out.printf("Movimenta��o %d: \n",x);
						System.out.printf("Saldo Atual R$:  %.2f",contaEm.getSaldo());
						System.out.print("\nMovimento: D - D�bito | C - Cr�dito ou E - Empr�stimo Empresarial: ");
						auxMovimento = leia.next().toUpperCase().charAt(0);
						
						if(auxMovimento == 'D') {
							System.out.print("Valor movimento R$: \n");
					 	 	valorMovimento = leia.nextDouble();
					 	 	contaEm.debito(valorMovimento);
						}
						else if (auxMovimento == 'C') {
							System.out.print("Valor movimento R$:  ");
					 		valorMovimento = leia.nextDouble();
					 		contaEm.credito(valorMovimento);
						} 
						else if (auxMovimento == 'E') {
							contaEm.SolicitarEmprestimoEm();
						} 
						else { 
							System.out.println("Digite uma op��o v�lida");
						} 
						
						System.out.print("Continuar S/N: ");
						continuar= leia.next().toUpperCase().charAt(0); 
						if(continuar == 'S') {
							
						} 
						else if (continuar == 'N') { 
							System.out.println("Obrigade por utilizar nossos servi�os!");
							break;
						}
						
						
					} 
					
					if (x > 10) { 
						System.out.println("N�mero de movimenta��es excedido!");
					}
				} 
				
				else if (opcao == '5') { //Ju
					estudantil contaES = new estudantil(limiteEstudantil);
					System.out.println("ESTUDANTIL");
					char auxMovimento;
					char auxContinuar;
					System.out.println("[BANCO 4U - G4]\n");
					System.out.println("[O SEU LUGAR � AQUI]\n\n\n");
					System.out.println("Digite o n�mero da conta: " );
					conta.numero = leia.nextInt();
					System.out.println("Informe seu CPF: ");
					conta.cpf = leia.next();
					System.out.print("1 - Ativo ou 2 - Inativo: ");
					aux = leia.next().toUpperCase().charAt(0);
					if(aux == '2') {
						break;
					}
					
					for (x = 1; x <=10; x++) {
						System.out.printf("Movimenta��o %d: ",x);
						System.out.printf("\nSaldo Atual: R$ %.2f ",contaES.getSaldo());
						System.out.println("\nMovimento: D - D�bito | C - Cr�dito | E - Empr�stimo Estudantil: ");
						auxMovimento = leia.next().toUpperCase().charAt(0);
						if(auxMovimento == 'D') {
							System.out.print("Valor movimento R$:  ");
					 	 	valorMovimento = leia.nextDouble();
					 	 	contaES.debito(valorMovimento);
						}
						else if (auxMovimento == 'C') {
					 	 	System.out.print("Valor movimento R$: ");
					 		valorMovimento = leia.nextDouble();
					 		contaES.credito(valorMovimento);
						}
						else if (auxMovimento == 'E') {
							contaES.solicitarEmprestimoES();
						} 
						else {
							System.out.println("Digite uma op��o v�lida");
						}
						System.out.print("Continuar S/N: ");
						auxContinuar = leia.next().toUpperCase().charAt(0);
						if (auxContinuar == 'S') {
							
						}
						else if (auxContinuar == 'N') {
							System.out.println("Obrigade por utilizar nossos servi�os!");
							break;
						}
						
					}
					 if (x > 10) {
						 System.out.println("N�mero de movimenta��es excedido!");
					 }
				}	//Ju
				
				else if (opcao == '6') {
					System.out.println("\n Obrigade por utilizar nossos servi�os! \n");
					break;
				}
				
		} while (opcao != 6); 
		
		System.out.println("FIM DO PROGRAMA!");


		
 	 } //Ju

}


