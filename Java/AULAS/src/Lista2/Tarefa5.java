package Lista2;

import java.util.Scanner;

public class Tarefa5 {  //programa est� apresentando erro no momento.

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double indicePoluicao = 0.00;

				System.out.println("Por favor, informe o indice de polui��o atual: ");
				indicePoluicao = leia.nextDouble();

				if (indicePoluicao >= 0.30 && indicePoluicao <= 0.39) {
					System.out.println("Industrias do primeiro grupo, suas atividades est�o suspensas devido ao indice de polui��o ter atingido ou ultrapassado ao limite: 0.30");
					
				} else if (indicePoluicao >= 0.40 && indicePoluicao <= 0.49) {
					System.out.println("Industrias do primeiro grupo, suas atividades est�o suspensas devido ao indice de polui��o ter atingido ou ultrapassado ao limite: 0.40");
				} else if (indicePoluicao >= 0.50) {
					System.out.println("Industrias de todos os grupos, suas atividades est�o suspensas devido indice de polui��o ter atingido ou ultrapassado ao limite: 0.50");
					
				} else {
					System.out.println("Suas atividades podem seguir normalmente");
				}
	}

}
