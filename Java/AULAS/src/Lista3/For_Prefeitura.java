package Lista3;

import java.util.Scanner;

class For_Prefeitura {
	public static final double HABITANTES = 4.00;  //constante
	public static void main(String[] args) {
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  
		*/
		
		Scanner leia = new Scanner(System.in);
		
				double salario = 0.00;
				int numeroFilhos = 0;
				double mediaSalarios = 0.00;
				double totalSalarios = 0.00;
				double mediaNumeroFilhos= 0.00;
				double totalNumeroFilhos = 0.00;
				double maiorSalario = 0.00;
				double percentualPessoasAte100 = 0.00;
				int totalPessoasAte100 = 0;

			
			for (int x=1;x<=HABITANTES; x++){
					System.out.println("Habitante : \n"+x);
					System.out.println("Digite o salario do habitante: \n");
					salario = leia.nextDouble();
					System.out.println("Digite o numero de filhos do habitante: ");
					numeroFilhos = leia.nextInt();
					totalSalarios = totalSalarios + salario;
					totalNumeroFilhos = totalNumeroFilhos + numeroFilhos;


					if (maiorSalario < salario)
					{
						maiorSalario = salario;
					}
					if (salario <= 100) {
						totalPessoasAte100++;
					}
			}
				mediaSalarios = totalSalarios / HABITANTES;
				mediaNumeroFilhos = totalNumeroFilhos / HABITANTES;
				percentualPessoasAte100 = (totalPessoasAte100 / HABITANTES)*100.00;
				System.out.println("\nTotal de salarios R$ "+totalSalarios);
				System.out.printf("Media de salarios R$ %.2f",mediaSalarios);
				System.out.printf("\nPercentual de pessoas que ganham até R$ 100,00 é de %.2f",percentualPessoasAte100);
				System.out.println("%\nMaior salario R$ "+maiorSalario);
				System.out.println("Total de filhos :"+totalNumeroFilhos);
				System.out.printf("Media dos filhos: %.2f",mediaNumeroFilhos);

	}

}
