package Lista1;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		double p1,p2,p3,media;
		
		p1 = 2;
		p2 = 3;
		p3 = 5;

		System.out.println("Qual sua nota 1? ");
		n1 = leia.nextInt();

		System.out.println("Qual sua nota 2? ");
		n2 = leia.nextInt();

		System.out.println("Qual sua nota 3? ");
		n3 = leia.nextInt();

		media = (((p1*n1)+(p2*n2)+(p3*n3))/(p1+p2+p3));
		System.out.printf("Sua média ponderada é: "+media);

	}

}
