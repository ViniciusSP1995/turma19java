package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;

public class TesteConta {



	public static void main(String[] args) {
		char opcao;
		String tipo;
		double saldo = 0.00;
		int contadorTalao=0;
		double limite = 1000.0;
		double emprestimoEmpresa;
		double limiteEstudantil = 5000.00;
		boolean status;
		char continuar, opcaoMovimentacao;
		double valorMovimento = 0.00, saldoFinal = 0.00;
		double usarLimite;
		char movimento, operacao;
		double limiteEmpresarial = 10000.00;
		int x;
		char aux = ' ';
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
				int diaAtual, diaAniversario;
				System.out.println("Digite o dia do seu anivers�rio: ");
				diaAniversario = leia.nextInt();
				System.out.println("CONTA POUPAN�A");
				System.out.println("[BANCO 4U - G4]\n");
				System.out.println("[O SEU LUGAR � AQUI]\n\n\n");
				System.out.print("Digite o n�mero da conta: " );
				conta.numero = leia.nextInt();
				System.out.print("Informe seu CPF: ");
				conta.cpf = leia.next();
				System.out.print("1 - Ativa ou 2 - Inativo: ");
				aux = leia.next().charAt(0);
				
				if (aux == '2') {//
					break;
				}//
				System.out.printf("Saldo Atual R$: %.2f\n",saldo);
				System.out.print("Deseja fazer alguma movimenta��o? S/N ");
				movimento = leia.next().toUpperCase().charAt(0);
				
				if (movimento == 'S') {//
					for (x = 1; x <=10; x++) {//
						System.out.printf("Movimenta��o %d\n",x);
						System.out.printf("Saldo Atual R$: %.2f",saldo);
						
						System.out.print("\nMOVIMENTO D - D�bito ou C - Cr�dito: ");
						operacao = leia.next().toUpperCase().charAt(0);
						if (operacao == 'D') { //
							System.out.print("Valor do movimento R$: ");
							valorMovimento = leia.nextDouble();
							
							if (saldo <=0 || saldo < valorMovimento) { //
								System.out.print("Opera��o n�o poder� ser v�lida, pois o saldo ficar� negativo!\n");
								
							} else if (saldo >= 0) {  //
								saldoFinal = saldo - valorMovimento;
								saldo = saldoFinal;
								System.out.printf("Movimenta��o realizada com sucesso! Seu saldo agora � de R$: %.2f\n\n",saldoFinal);
								
							}  //
							
						}else if (operacao == 'C') { //
								System.out.print("Valor do movimento R$: ");
								valorMovimento = leia.nextDouble();
								saldoFinal = saldo + valorMovimento;
								saldo = saldoFinal;
								System.out.printf("Movimenta��o realizada com sucesso! Seu saldo agora � de R$: %.2f\n\n",saldoFinal);
							} else { //
								System.out.print("N�o foi poss�vel identificar sua afirma��o. Tente novamente \n ");
							}  //
							System.out.println("Obrigade por utilizar nossos servi�os!\n");
							
							System.out.print("Continuar fazendo movimenta��es S/N: ");
							continuar = leia.next().toUpperCase().charAt(0);
							
							if (continuar == 'S') { //
								System.out.print("Ok, vamos tentar novamente!\n");
								
							} else if (continuar == 'N' || x == 10) { //
								System.out.print("Digite o dia de hoje: ");
								diaAtual = leia.nextInt();
								 if (diaAtual == diaAniversario) {  //
									 System.out.println("Parab�ns! Voc� ganhou 5% com base no seu saldo!");
									 saldoFinal = (saldo * 0.05) + saldo;
									 System.out.printf("Seu saldo agora � de R$: %.2f\n\n",saldoFinal);
									 saldo = saldoFinal;
									 System.out.println("Movimenta��o realizada com sucesso!");
									 
							} else if (diaAtual != diaAniversario) {  //
								System.out.printf("Seu saldo agora � de R$: %.2f\n\n", saldoFinal);
								 System.out.println("Movimenta��o realizada com sucesso!");
								
							}  //
								 System.out.println("Obrigade por utilizar nossos servi�os! Volte sempre!!");
								 break;
								
							} //
							else { //
								System.out.println("N�o foi poss�vel identificar sua afirma��o");
							}  //
						} //
					if (x == 11) { //
							System.out.println("Voc� excedeu o limite de tentativas!");
						} //
				} //
					else if (movimento == 'n') { //
							System.out.println("Obrigade por utilizar nosso servi�os!\n");
							
					} else { //
						System.out.println("N�o foi poss�vel identificar sua afirma��o");
					} //
						
					} //
				
				else if (opcao == '2') { //
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
					} //2 
					System.out.printf("Saldo Atual R$: %.2f\n", saldo);
					
					System.out.print("Deseja fazer alguma movimenta��o? S/N: ");
					opcaoMovimentacao = leia.next().toUpperCase().charAt(0);
					
					if (opcaoMovimentacao == 'S') { //
				      	for (x=1; x<=10; x++) { //
				      		System.out.print("NOVA MOVIMENTACAO \n\n");
							System.out.printf("Saldo Atual R$: %.2f \n",saldo);
							System.out.print("MOVIMENTO - D-debito ou C-Cr�dito: ");
							movimento = leia.next().toUpperCase().charAt(0);
							if (movimento == 'D') { //
								System.out.print("Valor movimento R$: ");
								valorMovimento = leia.nextDouble();
								saldoFinal = saldo-valorMovimento;
								saldo=saldoFinal;

							} else if (movimento == 'C') { //
								System.out.print("Valor movimento R$: ");
								valorMovimento = leia.nextDouble();
								saldoFinal = saldo + valorMovimento;
								saldo=saldoFinal;

							} else { //
								System.out.println("N�o foi poss�vel identificar sua afirma��o. Tente novamente \n  ");
							} //
							System.out.println("Movimenta��o realizada com sucesso!\n");
							System.out.printf("Seu saldo agora � de: R$ %2.f\n\n",saldoFinal);
							System.out.println("Obrigado por utilizar nossos servi�os!\n");
							     
							System.out.print("Continuar fazendo movimenta��es S/N: ");
							continuar = leia.next().toUpperCase().charAt(0);
							
							if (continuar == 'S') { //
								System.out.println("Ok, vamos tentar novamente! \n");
							} else if (continuar == 'N') {//
								System.out.println("Obrigado por utilizar nossos servi�os! Volte sempre! \n");
								break;
							} else { //
								System.out.println("N�o foi poss�vel identificar sua afirma��o \n");
							} //

				      	}//
					} else if(opcaoMovimentacao == 'N') { //
						System.out.println("Obrigado por utilizar nossos servi�os!\n");
					} else { //
						System.out.println("N�o foi poss�vel identificar sua afirma��o");
					} //
					
					// chama aqui funcao conta corrente (Maya)
					char opcaoChequeE;
					 do { //
						System.out.println("\n ol�, voc� tem disponivel cheque especial. digite 1 para sim ou digite qualquer outro numero para  n�o ");
						opcaoChequeE = leia.next().toUpperCase().charAt(0);	
				      	System.out.println("Ol� PARAB�NS voce selecionou o cheque especial");
						contadorTalao=contadorTalao+1;
			     
					} while (opcaoChequeE==1 && contadorTalao <=3 ); //
						System.out.println("\n N�o foi possivel solicitar o cheque especial, verifique se j� ultilizou 3x ou se esta j�  disponivel, \n Obrigado. volte sempre");
				} //
				
				else if (opcao  == '3') { //livia //
					double limiteEmprestimo = 1000;
					for (x=1; x<=10; x++) { //
						
						double pedidoCredito = 0;
						
						double opcaoEmprestimo;
						System.out.printf("Movimenta��o: %d",x);
						System.out.printf("Saldo Atual R$: %.2f\n ",saldo);
						System.out.printf("Seu limite � de R$: %.2f\n",limiteEmprestimo);
						System.out.print("MOVIMENTO - D-d�bito ou C- Cr�dito: ");
						movimento = leia.next().toUpperCase().charAt(0);
						double debito = 0;
						
						if (movimento == 'D') { //
							
							System.out.print("Valor movimento R$: ");
							valorMovimento = leia.nextDouble();
							if (saldo < valorMovimento) {
								System.out.printf("Imposs�vel realizar esse d�bito, deseja realizar um empr�stimo? (1 - S| 2 - N) [LIMITE R$ %f ]\n", limiteEmprestimo);
								opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
								
								if(opcaoEmprestimo == 1) { //
									
									System.out.printf("Qual o valor do empr�stimo? [LIMITE R$ %f]\n",limiteEmprestimo);
									opcaoEmprestimo = leia.nextDouble();
									
									if(opcaoEmprestimo > limiteEmprestimo) { //
										System.out.println("Seu limite n�o permite isso!");
									} //
									else if(opcaoEmprestimo <= limiteEmprestimo) { //
										limiteEmprestimo = limiteEmprestimo - opcaoEmprestimo;
										saldo = saldo + opcaoEmprestimo;
									} //
								} //
							} //
							
							else if (saldo >= valorMovimento) { //
								saldoFinal = saldo - valorMovimento;
								saldo = saldoFinal;
							} //
						} //
						else if (movimento == 'C') { //
							
							System.out.print("Valor movimento R$: \n");
							valorMovimento = leia.next().toUpperCase().charAt(0);
							saldoFinal = saldo + valorMovimento;
							saldo=saldoFinal;
						} //
						
						else { //
							System.out.println("N�o foi poss�vel identificar sua afirma��o. Tente novamente: ");
						} //
						
						System.out.println("Continuar S/N: ");
						continuar = leia.next().toUpperCase().charAt(0);
						
						if (continuar == 'N') { //
							
							System.out.print("Movimenta��o realizada com sucesso!\n");
							System.out.printf("Seu saldo agora � de R$: %.2f \n",saldo);
							System.out.println("Obrigado por utilizar nossos servi�os! Volte sempre!");
							
							break;
						} //
						
						else if (continuar == 'S') { //
							
							System.out.println("Ok, aguarde um minuto!");
						} //
						
						else { //
							
							System.out.println("N�o foi poss�vel identificar sua afirma��o. Tente novamente: ");
						} //
					}
					 //
					System.out.println("\n CONTA [ESPECIAL]");
				} // livia //
				
				else if (opcao == '4') { //
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
					
					if (aux == 2) { //
						break;
					}	//
					 
					for(x=1; x<= 10;x ++) {//
						System.out.printf("Movimenta��o %d: \n",x);
						System.out.printf("Saldo Atual R$:  %.2f",saldo);
						System.out.print("Movimento: D - D�bito | C - Cr�dito ou E - Empr�stimo Empresarial: ");
						auxMovimento = leia.next().toUpperCase().charAt(0);
						
						if(auxMovimento == 'D') { //debitoContaEmpresial
							System.out.print("Valor movimento R$: \n");
					 	 	valorMovimento = leia.nextDouble();
					 	 	if (saldo < valorMovimento) { //
					 	 		System.out.print("Imposs�vel realizar esse d�bito. \n");
					 	 	} //
					 	 	else if (saldo >= valorMovimento) { //
					 			saldoFinal = saldo - valorMovimento;
					 		 	saldo=saldoFinal;
					 	 	} //
						} //
						else if (auxMovimento == 'c') { // creditoContaEmpresarial()
							System.out.print("Valor movimento R$:  ");
					 		valorMovimento = leia.nextDouble();
					 	 	saldoFinal = saldo + valorMovimento;
					 		saldo=saldoFinal;
						} //
						else if (auxMovimento == 'E') { //
							double valorSolicitadoEmprestimoEmpresarial;
					     	char auxEmprestimoSimNaoEmpresarial;
					     	System.out.println("Gostaria de solicitar o empr�stimo empresarial? \n");
					 		System.out.println("S - Sim ou N - Nao: ");
					 		auxEmprestimoSimNaoEmpresarial = leia.next().toUpperCase().charAt(0);
					 		if (auxEmprestimoSimNaoEmpresarial == 'S')
					 		{ //
					 			System.out.printf("Seu limite de empr�stimo empresarial: %.2f \n",limiteEmpresarial);
					 			System.out.print("DIgite o valor solicitado: ");
					 			valorSolicitadoEmprestimoEmpresarial = leia.nextDouble();
					 			if (valorSolicitadoEmprestimoEmpresarial > 0 && valorSolicitadoEmprestimoEmpresarial <= limiteEmpresarial)
					 			{//
					 				saldo = (saldo + valorSolicitadoEmprestimoEmpresarial);
					 				limiteEmpresarial = (limiteEmpresarial - valorSolicitadoEmprestimoEmpresarial);
					 			} else { //
					 				System.out.println("N�o foi poss�vel solicitar o empr�stimo \n");
					 			} //
					 				
					 		} else if (auxEmprestimoSimNaoEmpresarial == 'N') { //
					 				
								saldo = saldo + 0.00;
					 			
					 			
					 		} else { //
					 			System.out.println("Voc� n�o digitou uma op��o v�lida!");
					 		} //
						} //
						else { //
							System.out.println("Digite uma op��o v�lida");
						} //
						
						System.out.print("Continuar S/N: ");
						auxContinuar = leia.next().toUpperCase().charAt(0); 
						if(auxContinuar == 's') { //
							
						} //
						else if (auxContinuar == 'N') { //
							System.out.println("Obrigade por utilizar nossos servi�os!");
							break;
						} //
						
						
					} //
					
					if (x > 10) { //
						System.out.println("N�mero de movimenta��es excedido!");
					} //
				} //
				
				else if (opcao == '5') { //Ju //
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
					
					if(aux == '2') { //
						break;
					} //
					
					for (x = 1; x <=10; x++) { //
						System.out.printf("Movimenta��o %d: ",x);
						System.out.printf("\nSaldo Atual: R$ %.2f ",saldo);
						System.out.println("\nMovimento: D - D�bito | C - Cr�dito | E - Empr�stimo Estudantil: ");
						auxMovimento = leia.next().toUpperCase().charAt(0);
						if(auxMovimento == 'D') { //debitoContaEstudantil() //
							System.out.print("Valor movimento R$:  ");
					 	 	valorMovimento = leia.nextDouble();
					 	 	if(saldo < valorMovimento) { //
					 	 		System.out.print("Imposs�vel realizar esse d�bito. \n");
					 	 		} //
					 	 	else if(saldo >= valorMovimento) { //
					 	 		saldoFinal = saldo - valorMovimento;
					 			saldo=saldoFinal;
					 	 		} //
						}//
						else if (auxMovimento == 'C') { //
					 	 	System.out.print("Valor movimento R$: ");
					 		valorMovimento = leia.nextDouble();
					 	 	saldoFinal = saldo + valorMovimento;
					 		saldo=saldoFinal;
						} //
						else if (auxMovimento == 'E') { //
							 double valorSolicitadoEmprestimo;
					 		 char auxEmprestimoSimNao;
					 		 System.out.println("Gostaria de solicitar o empr�stimo estudantil? \n");
					 				 System.out.println("S - Sim ou N - Nao: ");
					 				 auxEmprestimoSimNao = leia.next().toUpperCase().charAt(0);
					 				 if (auxEmprestimoSimNao == 'S')
					 				 { //
					 					 System.out.printf("Seu limite de empr�stimo estudantil: %.2f",limiteEstudantil);
					 					 System.out.print("Digite o valor solicitado: ");
					 					 valorSolicitadoEmprestimo = leia.nextDouble();
					 						 if (valorSolicitadoEmprestimo > 0 && valorSolicitadoEmprestimo <= limiteEstudantil)
					 						 { //
					 							 saldo = (saldo + valorSolicitadoEmprestimo);
					 							 limiteEstudantil = (limiteEstudantil - valorSolicitadoEmprestimo);
					 							 
					 						 } //
					 						 else
					 						 { //
					 							 System.out.println("N�o foi poss�vel solicitar o empr�stimo \n");
					 						 } //
					 				 } //
					 				 else if (auxEmprestimoSimNao == 'N')
					 				 { //
					 					 saldo = saldo + 0.00;
					 				 } //
					 				 else
					 				 { //
					 					 System.out.println("Voc� n�o digitou uma op��o v�lida \n");
					 				 }//

						} //
						else { //
							System.out.println("Digite uma op��o v�lida");
						} //
						System.out.print("Continuar S/N: ");
						auxContinuar = leia.next().toUpperCase().charAt(0);
						if (auxContinuar == 'S') { //
							
						} //
						else if (auxContinuar == 'n') { //
							System.out.println("Obrigade por utilizar nossos servi�os!");
							break;
						} //
						
					} //
					 if (x > 10) { //
						 System.out.println("N�mero de movimenta��es excedido!");
					 } //
				}	//Ju  //
				
				else if (opcao == '6') { //
					System.out.println("\n Obrigade por utilizar nossos servi�os! \n");
				}
	
				
				
		} while (opcao != 6); //
		
		System.out.println("FIM DO PROGRAMA!");


		
 	 } //Ju //

} //


