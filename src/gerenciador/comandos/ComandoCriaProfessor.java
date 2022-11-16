package gerenciador.comandos;

import java.util.Scanner;
import java.util.Set;

import gerenciador.entidades.Professor;
import gerenciador.entidades.ProfessorInterface;

public class ComandoCriaProfessor implements ComandoInterface {
	
	private Set<ProfessorInterface> bancoProfessor;
	
	public ComandoCriaProfessor(Set<ProfessorInterface> bancoProfessor) {
		if (bancoProfessor == null) {
			throw new NullPointerException("Banco de Professor não pode ser nulo!");
		}
		
		this.bancoProfessor = bancoProfessor;
	}

	@Override
	public boolean executa(Scanner sc) {

		Professor pessoa = new Professor();
		
		System.out.println("Digite o nome do Professor:");
		String nome = sc.nextLine();
		pessoa.setNome(nome);
		
		System.out.println("Digite o email do Professor:");
		String email = sc.nextLine();
		pessoa.setEmailUnivesp(email);
		
		bancoProfessor.add(pessoa);
		
		System.out.println(bancoProfessor);
		
		return true;
	}

}
