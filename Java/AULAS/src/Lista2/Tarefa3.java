package Lista2;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, qa, qb, qc, qd;
		System.out.println("Digite 4 números: ");
		
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		d = leia.nextDouble();
		
		qa = a*a;
		qb = b*b;
		qc = c*c;
		qd = d*d;

		if (qc >= 1000) {
			System.out.println("O valor do terceiro número é: " + qc);
			
		} else {
			System.out.println("Os valores e seus respectivos quadrados são: " + a + ": "+ qa + ", " + b + ": "+ qb + ", " + c + ": " + qc + " e " + d + ": " + qd);
			
		}

	}

}
