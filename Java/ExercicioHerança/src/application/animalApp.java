package application;

import java.util.Scanner;

import entities.Animais;
import entities.cachorro;
import entities.cavalo;
import entities.preguica;

public class animalApp {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Animais animal = new Animais();
		cachorro dog = new cachorro("Rex",5);
		cavalo horse = new cavalo("Gandolf", 8);
		preguica sloth = new preguica("Jerry", 10);
		
		System.out.print("Cachorro!\n" + "Se chama: " + dog.nome + "\nPossui " + dog.idade + " anos\n");
		System.out.print("Ele faz " + dog.fazerSom()+ " e "  + dog.movimentacao());
		System.out.println();
		System.out.print("\nCavalo!\n" + "Se chama: " + horse.nome + "\nPossui " + horse.idade + " anos\n");
		System.out.println("Ele faz " + dog.fazerSom()  + " e " + dog.movimentacao());
		System.out.println();
		System.out.print("\nPreguiça!\n" + "Se chama: " + sloth.nome + "\nPossui " + sloth.idade + " anos\n");
		System.out.println("Ele faz " + sloth.fazerSom() + " e " + sloth.movimentacao());
	}

}
