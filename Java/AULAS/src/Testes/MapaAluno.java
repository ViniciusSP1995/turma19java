package Testes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[]) {
		Map<String, Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("João Nogueira", "JAVA",6.8);
		Aluno b = new Aluno("Roberto Carlos", "Linux",7.8);
		Aluno c = new Aluno("Fabio Junior", "SO",8.8);
		Aluno d = new Aluno("Luiz Melodia", "Internet",9.8);
		
		mapa.put("João Nogueira",a);
		mapa.put("Roberto Carlos",b);
		mapa.put("Fabio Junior",c);
		mapa.put("Luiz Melodia",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Fabio Junior"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for (Aluno e:alunos) {
			System.out.println(e);
		}
	}
}
