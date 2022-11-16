package gerenciador.comandos;

import java.util.Scanner;
import java.util.Set;

import gerenciador.entidades.Aluno;
import gerenciador.entidades.AlunoInterface;

public class ComandoCriaAluno implements ComandoInterface {
	
	private Set<AlunoInterface> bancoAluno;
	
	public ComandoCriaAluno(Set<AlunoInterface> bancoAluno) {
		if (bancoAluno == null) {
			throw new NullPointerException("Banco de Aluno não pode ser nulo!");
		}
		
		this.bancoAluno = bancoAluno;
	}

	@Override
	public boolean executa(Scanner sc) {
		System.out.println("Digite o numero de matricula do Aluno:");
		int ra = sc.nextInt();
		sc.nextLine(); // Para garantir que a linha toda seja lida e comece da proxima
		
		Aluno pessoa = new Aluno(ra);
		
		System.out.println("Digite o nome do Aluno:");
		String nome = sc.nextLine();
		pessoa.setNome(nome);
		
		System.out.println("Digite o email do Aluno:");
		String email = sc.nextLine();
		pessoa.setEmailUnivesp(email);
		
		bancoAluno.add(pessoa);
		System.out.println(bancoAluno);
		
		return true;
	}

}
