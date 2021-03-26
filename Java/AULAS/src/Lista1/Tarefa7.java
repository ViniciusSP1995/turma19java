package Lista1;

import java.util.Scanner;

public class Tarefa7 {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	double a,b,c,d,E,f,x,y;

	System.out.println("digite a: ");
	a = leia.nextDouble();
	
	System.out.println("digite b: ");
	b = leia.nextDouble();
	System.out.println("digite c: ");
	c = leia.nextDouble();
	System.out.println("digite d: ");
	d = leia.nextDouble();
	System.out.println("digite E: ");
	E = leia.nextDouble();
	System.out.println("digite f: ");
	f = leia.nextDouble();
	System.out.println("digite x: ");
	x = leia.nextDouble();
	System.out.println("digite y: ");
	y = leia.nextDouble();
	

	x = (((c*E)-(b*f))/((a*E)-(b*d)));
	y = (((a*f)-(c*d))/((a*E)-(b*d)));

	System.out.printf("O valor de x é: %.2f",x);
	System.out.printf(" e o valor de y é: %.2f",y);
}
}
