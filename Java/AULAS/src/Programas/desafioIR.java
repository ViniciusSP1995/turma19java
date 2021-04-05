package Programas;

import java.util.Scanner;

public class desafioIR {

	public static void main(String[] args) {
		String nome;
		double salarioBruto, salarioLiquido, imposto;
		char tratamento;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Como vc desejar ser tratado: 1- Sr 2 -Sra 3-Sre :");
		tratamento = leia.next().charAt(0);
		System.out.println("Digite o seu salario Bruto: ");
		salarioBruto = leia.nextDouble();

		if (tratamento =='1')
		{
			
			if (salarioBruto <=1200 ) {
	
				System.out.println("Sr " + nome + " vc é isento!!");
			}
			else if  (salarioBruto > 1500 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				
				System.out.println("Sr " + nome + " vc vai pagar 12% de IR R$ " + imposto + " seu salrio liquido " + salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sr " + nome + " vc vai pagar 25% de IR R$ " + imposto + " seu salrio liquido " + salarioLiquido);
			}
		}
		else if  (tratamento =='2')
		{
			
			if (salarioBruto <=1200) {
	
				System.out.println("Sra " + nome + " vc é isenta!!");
			}
			else if (salarioBruto > 1200 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sra " + nome + " vc vai pagar 12% de IR R$ " + imposto + " seu salario liquido " + salarioLiquido);
			} else if  (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sra " + nome + " vc vai pagar 25% de IR R$ " + imposto + " seu salario liquido " +salarioLiquido);
			}
		}
		else if (tratamento =='3');
		{
			
			if (salarioBruto <=1200) {
	
				System.out.println("Sre " + nome + " vc é isente!!");
			}
			else if (salarioBruto > 1200 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sre " + nome + " vc vai pagar 12% de IR R$ " + imposto + " seu salario liquido " + salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sre " + nome + " vc vai pagar 25% de IR R$ " + imposto + " seu salario liquido " + salarioLiquido);
			}
		else {
			System.out.println("Não foi possível reconhecer a forma de tratamento");
		}
	}

}
}
