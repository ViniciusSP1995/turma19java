package AtividadeClasseObjJava;

import java.util.Scanner;
 
public class ClienteApp {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente pessoa = new Cliente();
		
		System.out.println("Vamos realizar seu cadastro!");
		System.out.print("Digite seu nome: ");
		pessoa.nome = leia.next();
		System.out.print("Digite sua data de nascimento: ");
		pessoa.dataNascimento = leia.next();
		System.out.println("Qual genero você se identifica? \n1-Feminino\n2-Masculino\n3-Outre");
		pessoa.genero = leia.next().charAt(0);
		System.out.print("Digite seu CPF: ");
		pessoa.cpf = leia.next();
		System.out.print("Digite seu email: ");
		pessoa.email = leia.next();
		System.out.print("Digite um número para contato: ");
		pessoa.telefone = leia.next();
		
		System.out.printf("Parabens %s %s! Agora você está cadastrado em nosso sistema!",pessoa.tratamento(), pessoa.nome);
		System.out.print("\nVocê receberá ofertas pela e-mail informado e terá 20% de desconto nas comprar acima de R$ 100,00!");
	}

}
