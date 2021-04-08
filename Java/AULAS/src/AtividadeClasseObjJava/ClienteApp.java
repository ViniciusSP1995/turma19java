package AtividadeClasseObjJava;

import java.util.Scanner;
 
public class ClienteApp {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente pessoa = new Cliente();
		
		for (int x = 0;x < 3; x++) {
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
		
		System.out.println("Verifique os dados informados: ");
		System.out.printf("Nome: %s\nTratamento: %s\nCPF: %s\nE-mail: %s\nContato: %s",pessoa.nome,pessoa.tratamento(),pessoa.cpf,pessoa.email,pessoa.telefone);
		
		System.out.println("\nDeseja confirmar os dados? ");
			pessoa.afirmacao = leia.next().toUpperCase().charAt(0);
			if (pessoa.afirmacao == 'S') {
				
		System.out.printf("\nParabens %s %s! Agora você está cadastrado em nosso sistema!",pessoa.tratamento(), pessoa.nome);
		System.out.print("\nVocê receberá ofertas pela e-mail informado e terá 20% de desconto nas comprar acima de R$ 100,00!");
		    break;
			
			} else if (pessoa.afirmacao =='N' ) {
				System.out.println("Ok, vamos tentar novamente");
			}
	}
	}

}
