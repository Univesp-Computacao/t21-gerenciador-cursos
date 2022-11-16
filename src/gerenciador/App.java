package gerenciador;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import gerenciador.comandos.ComandoCriaAluno;
import gerenciador.comandos.ComandoCriaProfessor;
import gerenciador.comandos.ComandoInterface;
import gerenciador.entidades.AlunoInterface;
import gerenciador.entidades.ProfessorInterface;

public class App {

	private Set<AlunoInterface> bancoAluno;
	
	private Set<ProfessorInterface> bancoProfessor;
	
	private Map<String, ComandoInterface> comandos;
	
	public App() {
		super();
	}
	
	public void init() {
		bancoAluno = new TreeSet<>();
		
		bancoProfessor = new TreeSet<>();
		
		comandos = new HashMap<>();
		
		ComandoInterface comandoCriaAluno = new ComandoCriaAluno(bancoAluno);
		
		ComandoInterface comandoCriaProfessor = new ComandoCriaProfessor(bancoProfessor);
		
		comandos.put("A", comandoCriaAluno);
		
		comandos.put("P", comandoCriaProfessor);
	}
	
	public boolean run(Scanner sc) {
		System.out.println("Digite A para criar um Aluno, ou P para Professor:");
		System.out.println("Digite X para sair:");
		
		String comando = sc.nextLine();
		
		if (comando.equals("X")) {
			return false;
		}
		
		if (comandos.containsKey(comando)) {
			 return comandos.get(comando).executa(sc);
		} else {
			System.out.println("Comando Inválido!");
			return true;
		}
	}
}
