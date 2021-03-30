package Lista2;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
double horasTrabalhadas,excesso,salario,limiteHoras,extra,salarioLimite;
		
		System.out.println("Olá, nos informe o número de horas trabalhadas: ");
		horasTrabalhadas = leia.nextDouble();


		if (horasTrabalhadas > 50) {      //horas trablahadas
			
			limiteHoras = 50;
			excesso = horasTrabalhadas - limiteHoras;
			extra = excesso * 20;
			salarioLimite = limiteHoras * 10;

			System.out.println("Você deve receber o total de R$ " + (salarioLimite + extra) + " com o extra de: R$ " + extra);
			
		} else {
			salario = horasTrabalhadas * 10;
			System.out.println("Você deve receber o total de R$ " + salario);
		}

	}

}
