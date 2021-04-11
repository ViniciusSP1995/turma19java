package Testes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("João Nogueira", "JAVA",6.8);
		Aluno b = new Aluno("Roberto Carlos", "Linux",7.8);
		Aluno c = new Aluno("Fabio Junior", "SO",8.8);
		Aluno d = new Aluno("Luiz Melodia", "Internet",9.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);

			System.out.println(conjunto);
		
	}

}
