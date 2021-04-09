package application;

import entities.cachorro;
import entities.cavalo;
import entities.preguica;

public class animalApp {

	public static void main(String[] args) {
		cachorro dog = new cachorro("Rex",5, "AU! AU! AU!");
		cavalo horse = new cavalo("Gandolf",8,"IIIIIRRRIIIIIIINNNN");
		preguica sloth = new preguica("Jerry",10,"ZZzzZzzzzzzzzZZzzzzzZZZ");
		
		System.out.println("CACHORRO!\nNOME: " + dog.getNome() + "\nANOS: " + dog.getIdade()+ "\nSOM: "+dog.getSom());
		dog.deveCorrer();
		System.out.println();
		System.out.println("CAVALO!\nNOME: " + horse.getNome() + "\nANOS: " + horse.getIdade()+ "\nSOM: "+horse.getSom());
		horse.deveCorrer();
		System.out.println();
		System.out.println("PREGUIÇA!\nNOME: " + sloth.getNome() + "\nANOS: " + sloth.getIdade()+ "\nSOM: "+sloth.getSom());
		sloth.subirArvore();
		
	}

}
