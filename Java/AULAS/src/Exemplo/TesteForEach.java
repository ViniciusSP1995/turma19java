package Exemplo;

public class TesteForEach {

	public static void main(String[] args) {
		
		String nomes[] = {"MARCOS", "MATEUS", "JUDAS","PAULO"};
		
		System.out.println("for normal");
		for (int x=0; x<nomes.length;x++) {
			System.out.println(nomes[x]);
		}
		System.out.println("for each");
		for (String apostolo: nomes) {
			System.out.println(apostolo);
		}

	}

}
