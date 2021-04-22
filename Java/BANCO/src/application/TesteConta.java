package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;
import entity.corrente;
import entity.poupanca;

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
			System.out.println("O SEU LUGAR É AQUI!!!! =D");
			System.out.print("1 - CONTA POUPANÇA \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESA \n5 - CONTA ESTUDANTIL \n6 - SAIR \n\n");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.next().charAt(0);
			
			if (opcao == '1') { // Vinny
				
				/*int diaAtual, diaAniversario;*/
				System.out.println("Digite o dia do seu aniversário: ");
				int diaAniversario = leia.nextInt();
				poupanca contaP = new poupanca(diaAniversario);
				System.out.println("CONTA POUPANÇA");
				System.out.println("[BANCO 4U - G4]\n");
				System.out.println("[O SEU LUGAR É AQUI]\n\n\n");
				System.out.print("Digite o número da conta: " );
				conta.numero = leia.nextInt();
				System.out.print("Informe seu CPF: ");
				conta.cpf = leia.next();
				System.out.print("1 - Ativa ou 2 - Inativo: ");
				aux = leia.next().charAt(0);
				
				if (aux == '2') {//
					break;
				}//
				System.out.printf("Saldo Atual R$: %.2f\n",contaP.getSaldo());
				System.out.print("Deseja fazer alguma movimentação? S/N ");
				movimento = leia.next().toUpperCase().charAt(0);
				
				if (movimento == 'S') {//
					for (x = 1; x <=10; x++) {//
						
						System.out.printf("Movimentação %d\n",x);
						System.out.printf("Saldo Atual R$: %.2f",contaP.getSaldo());
						
						System.out.print("\nMOVIMENTO D - Débito ou C - Crédito: ");
						operacao = leia.next().toUpperCase().charAt(0);
						if (operacao == 'D') { //
							System.out.print("Valor do movimento R$: ");
							valorMovimento = leia.nextDouble();
							contaP.debito(valorMovimento);						
						}else if (operacao == 'C') { //
								System.out.print("Valor do movimento R$: ");
								valorMovimento = leia.nextDouble();
								contaP.credito(valorMovimento);
								
							} else { //
								System.out.print("Não foi possível identificar sua afirmação. Tente novamente \n ");
							}  //
							System.out.println("Obrigade por utilizar nossos serviços!\n");
							
							
							System.out.print("Continuar fazendo movimentações S/N: ");
							continuar = leia.next().toUpperCase().charAt(0);
							
							if (continuar == 'S') { //
								System.out.print("Ok, vamos tentar novamente!\n");
								
							} else if (continuar == 'N' || x == 10) { //
								System.out.print("Digite o dia de hoje: ");
								int diaAtual = leia.nextInt();
								contaP.bonusAniversario(diaAtual);
								System.out.printf("Seu saldo agora é de R$: %.2f\n\n",contaP.getSaldo());
								System.out.println("Movimentação realizada com sucesso!");
								 System.out.println("Obrigade por utilizar nossos serviços! Volte sempre!!");
								 break;
							} //
							else { //
								System.out.println("Não foi possível identificar sua afirmação");
							}  //
						} //
					if (x == 11) { //
							System.out.println("Você excedeu o limite de tentativas!");
						} //
				} //
					else if (movimento == 'n') { //
							System.out.println("Obrigade por utilizar nosso serviços!\n");
							
					} else { //
						System.out.println("Não foi possível identificar sua afirmação");
					} //
						
					} //
				
				else if (opcao == '2') { //
					corrente contaC = new corrente(contadorTalao);
					System.out.print("VOCÊ ESCOLHEU CONTA CORRENTE");
					System.out.println("[BANCO 4U - G4]\n");
					System.out.print("[O SEU LUGAR É AQUI]\n\n\n");
					System.out.print("Digite o número da conta: " );
					conta.numero = leia.nextInt();
					System.out.print("\nInforme seu CPF: ");
					conta.cpf = leia.next();
					System.out.print("1 - Ativo ou 2 - Inativo: ");
					aux = leia.next().charAt(0);
					
					if (aux == '2') {
						break;
					} //2 
					System.out.printf("Saldo Atual R$: %.2f\n", contaC.getSaldo());
					
					System.out.print("Deseja fazer alguma movimentação? S/N: ");
					opcaoMovimentacao = leia.next().toUpperCase().charAt(0);
					
					if (opcaoMovimentacao == 'S') { //
				      	for (x=1; x<=10; x++) { //
				      		System.out.print("NOVA MOVIMENTACAO \n\n");
							System.out.printf("Saldo Atual R$: %.2f \n",contaC.getSaldo());
							System.out.print("MOVIMENTO - D-debito ou C-Crédito: ");
							movimento = leia.next().toUpperCase().charAt(0);
							if (movimento == 'D') { //
								System.out.print("Valor movimento R$: ");
								valorMovimento = leia.nextDouble();
								contaC.debito(valorMovimento);
							} else if (movimento == 'C') { //
								System.out.print("Valor movimento R$: ");
								valorMovimento = leia.nextDouble();
								contaC.credito(valorMovimento);
							} else { //
								System.out.println("Não foi possível identificar sua afirmação. Tente novamente \n  ");
							} //
							System.out.println("Movimentação realizada com sucesso!\n");
							System.out.printf("Seu saldo agora é de: R$ %2.f\n\n",contaC.getSaldo());
							System.out.println("Obrigade por utilizar nossos serviços!\n");
							     
							System.out.print("Continuar fazendo movimentações S/N: ");
							continuar = leia.next().toUpperCase().charAt(0);
							
							if (continuar == 'S') { //
								System.out.println("Ok, vamos tentar novamente! \n");
							} else if (continuar == 'N') {//
								System.out.println("Obrigado por utilizar nossos serviços! Volte sempre! \n");
								break;
							} else { //
								System.out.println("Não foi possível identificar sua afirmação \n");
							} //

				      	}//
					} else if(opcaoMovimentacao == 'N') { //
						System.out.println("Obrigado por utilizar nossos serviços!\n");
					} else { //
						System.out.println("Não foi possível identificar sua afirmação");
					} //
					
					// chama aqui funcao conta corrente (Maya)
					char opcaoChequeE;
					
					 do { //
						System.out.println("\n olá, você tem disponivel cheque especial. digite 1 para sim ou digite qualquer outro numero para  não ");
						opcaoChequeE = leia.next().toUpperCase().charAt(0);	
						contaC.pediTalao(contadorTalao);
				      	/*System.out.println("Olá PARABÉNS voce selecionou o cheque especial");
						contadorTalao=contadorTalao+1;*/
			     
					} while (opcaoChequeE==1 && contadorTalao <=3 ); //
						System.out.println("\n Não foi possivel solicitar o cheque especial, verifique se já ultilizou 3x ou se esta já  disponivel, \n Obrigado. volte sempre");
				} //
				
				else if (opcao  == '3') { //livia //
					double limiteEmprestimo = 1000;
					for (x=1; x<=10; x++) { //
						
						double pedidoCredito = 0;
						
						double opcaoEmprestimo;
						System.out.printf("Movimentação: %d",x);
						System.out.printf("Saldo Atual R$: %.2f\n ",saldo);
						System.out.printf("Seu limite é de R$: %.2f\n",limiteEmprestimo);
						System.out.print("MOVIMENTO - D-débito ou C- Crédito: ");
						movimento = leia.next().toUpperCase().charAt(0);
						double debito = 0;
						
						if (movimento == 'D') { //
							
							System.out.print("Valor movimento R$: ");
							valorMovimento = leia.nextDouble();
							if (saldo < valorMovimento) {
								System.out.printf("Impossível realizar esse débito, deseja realizar um empréstimo? (1 - S| 2 - N) [LIMITE R$ %f ]\n", limiteEmprestimo);
								opcaoEmprestimo = leia.next().toUpperCase().charAt(0);
								
								if(opcaoEmprestimo == 1) { //
									
									System.out.printf("Qual o valor do empréstimo? [LIMITE R$ %f]\n",limiteEmprestimo);
									opcaoEmprestimo = leia.nextDouble();
									
									if(opcaoEmprestimo > limiteEmprestimo) { //
										System.out.println("Seu limite não permite isso!");
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
							System.out.println("Não foi possível identificar sua afirmação. Tente novamente: ");
						} //
						
						System.out.println("Continuar S/N: ");
						continuar = leia.next().toUpperCase().charAt(0);
						
						if (continuar == 'N') { //
							
							System.out.print("Movimentação realizada com sucesso!\n");
							System.out.printf("Seu saldo agora é de R$: %.2f \n",saldo);
							System.out.println("Obrigado por utilizar nossos serviços! Volte sempre!");
							
							break;
						} //
						
						else if (continuar == 'S') { //
							
							System.out.println("Ok, aguarde um minuto!");
						} //
						
						else { //
							
							System.out.println("Não foi possível identificar sua afirmação. Tente novamente: ");
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
					System.out.println("[O SEU LUGAR É AQUI]\n\n\n");
					System.out.println("Digite o número da conta: " );
					conta.numero = leia.nextInt();
					System.out.println("Informe seu CPF: ");
					conta.cpf = leia.next();
					System.out.print("1 - Ativo ou 2 - Inativo: ");
					System.out.println();
					
					if (aux == 2) { //
						break;
					}	//
					 
					for(x=1; x<= 10;x ++) {//
						System.out.printf("Movimentação %d: \n",x);
						System.out.printf("Saldo Atual R$:  %.2f",saldo);
						System.out.print("Movimento: D - Débito | C - Crédito ou E - Empréstimo Empresarial: ");
						auxMovimento = leia.next().toUpperCase().charAt(0);
						
						if(auxMovimento == 'D') { //debitoContaEmpresial
							System.out.print("Valor movimento R$: \n");
					 	 	valorMovimento = leia.nextDouble();
					 	 	if (saldo < valorMovimento) { //
					 	 		System.out.print("Impossível realizar esse débito. \n");
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
					     	System.out.println("Gostaria de solicitar o empréstimo empresarial? \n");
					 		System.out.println("S - Sim ou N - Nao: ");
					 		auxEmprestimoSimNaoEmpresarial = leia.next().toUpperCase().charAt(0);
					 		if (auxEmprestimoSimNaoEmpresarial == 'S')
					 		{ //
					 			System.out.printf("Seu limite de empréstimo empresarial: %.2f \n",limiteEmpresarial);
					 			System.out.print("DIgite o valor solicitado: ");
					 			valorSolicitadoEmprestimoEmpresarial = leia.nextDouble();
					 			if (valorSolicitadoEmprestimoEmpresarial > 0 && valorSolicitadoEmprestimoEmpresarial <= limiteEmpresarial)
					 			{//
					 				saldo = (saldo + valorSolicitadoEmprestimoEmpresarial);
					 				limiteEmpresarial = (limiteEmpresarial - valorSolicitadoEmprestimoEmpresarial);
					 			} else { //
					 				System.out.println("Não foi possível solicitar o empréstimo \n");
					 			} //
					 				
					 		} else if (auxEmprestimoSimNaoEmpresarial == 'N') { //
					 				
								saldo = saldo + 0.00;
					 			
					 			
					 		} else { //
					 			System.out.println("Você não digitou uma opção válida!");
					 		} //
						} //
						else { //
							System.out.println("Digite uma opção válida");
						} //
						
						System.out.print("Continuar S/N: ");
						auxContinuar = leia.next().toUpperCase().charAt(0); 
						if(auxContinuar == 's') { //
							
						} //
						else if (auxContinuar == 'N') { //
							System.out.println("Obrigade por utilizar nossos serviços!");
							break;
						} //
						
						
					} //
					
					if (x > 10) { //
						System.out.println("Número de movimentações excedido!");
					} //
				} //
				
				else if (opcao == '5') { //Ju //
					System.out.println("ESTUDANTIL");
					char auxMovimento;
					char auxContinuar;
					System.out.println("[BANCO 4U - G4]\n");
					System.out.println("[O SEU LUGAR É AQUI]\n\n\n");
					System.out.println("Digite o número da conta: " );
					conta.numero = leia.nextInt();
					System.out.println("Informe seu CPF: ");
					conta.cpf = leia.next();
					System.out.print("1 - Ativo ou 2 - Inativo: ");
					aux = leia.next().toUpperCase().charAt(0);
					
					if(aux == '2') { //
						break;
					} //
					
					for (x = 1; x <=10; x++) { //
						System.out.printf("Movimentação %d: ",x);
						System.out.printf("\nSaldo Atual: R$ %.2f ",saldo);
						System.out.println("\nMovimento: D - Débito | C - Crédito | E - Empréstimo Estudantil: ");
						auxMovimento = leia.next().toUpperCase().charAt(0);
						if(auxMovimento == 'D') { //debitoContaEstudantil() //
							System.out.print("Valor movimento R$:  ");
					 	 	valorMovimento = leia.nextDouble();
					 	 	if(saldo < valorMovimento) { //
					 	 		System.out.print("Impossível realizar esse débito. \n");
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
					 		 System.out.println("Gostaria de solicitar o empréstimo estudantil? \n");
					 				 System.out.println("S - Sim ou N - Nao: ");
					 				 auxEmprestimoSimNao = leia.next().toUpperCase().charAt(0);
					 				 if (auxEmprestimoSimNao == 'S')
					 				 { //
					 					 System.out.printf("Seu limite de empréstimo estudantil: %.2f",limiteEstudantil);
					 					 System.out.print("Digite o valor solicitado: ");
					 					 valorSolicitadoEmprestimo = leia.nextDouble();
					 						 if (valorSolicitadoEmprestimo > 0 && valorSolicitadoEmprestimo <= limiteEstudantil)
					 						 { //
					 							 saldo = (saldo + valorSolicitadoEmprestimo);
					 							 limiteEstudantil = (limiteEstudantil - valorSolicitadoEmprestimo);
					 							 
					 						 } //
					 						 else
					 						 { //
					 							 System.out.println("Não foi possível solicitar o empréstimo \n");
					 						 } //
					 				 } //
					 				 else if (auxEmprestimoSimNao == 'N')
					 				 { //
					 					 saldo = saldo + 0.00;
					 				 } //
					 				 else
					 				 { //
					 					 System.out.println("Você não digitou uma opção válida \n");
					 				 }//

						} //
						else { //
							System.out.println("Digite uma opção válida");
						} //
						System.out.print("Continuar S/N: ");
						auxContinuar = leia.next().toUpperCase().charAt(0);
						if (auxContinuar == 'S') { //
							
						} //
						else if (auxContinuar == 'n') { //
							System.out.println("Obrigade por utilizar nossos serviços!");
							break;
						} //
						
					} //
					 if (x > 10) { //
						 System.out.println("Número de movimentações excedido!");
					 } //
				}	//Ju  //
				
				else if (opcao == '6') { //
					System.out.println("\n Obrigade por utilizar nossos serviços! \n");
				}
	
				
				
		} while (opcao != 6); //
		
		System.out.println("FIM DO PROGRAMA!");


		
 	 } //Ju //

} //


