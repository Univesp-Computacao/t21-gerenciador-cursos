package gerenciador;
import java.util.Scanner;

import gerenciador.entidades.Aluno;
import gerenciador.entidades.PessoaInterface;
import gerenciador.entidades.Professor;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Digite A para criar um Aluno, ou P para Professor:");

		Scanner sc = new Scanner(System.in);
		String cmd = sc.nextLine();
		
		
		PessoaInterface pessoa = null;
		if (cmd.equals("A")) {
			
			System.out.println("Digite o numero de matricula do Aluno:");
			int ra = sc.nextInt();
			sc.nextLine(); // Para garantir que a linha toda seja lida e comece da proxima
			
			pessoa = new Aluno(ra);
			
			System.out.println("Digite o nome do Aluno:");
			String nome = sc.nextLine();
			pessoa.setNome(nome);
			
			System.out.println("Digite o email do Aluno:");
			String email = sc.nextLine();
			pessoa.setEmailUnivesp(email);
		} else if (cmd.equals("P")) {
			
			pessoa = new Professor();
			
			System.out.println("Digite o nome do Professor:");
			String nome = sc.nextLine();
			pessoa.setNome(nome);
			
			System.out.println("Digite o email do Professor:");
			String email = sc.nextLine();
			pessoa.setEmailUnivesp(email);
		} else {
			System.out.println("Comando Inválido");
		}
		
		System.out.println(pessoa);
	}
	

}
