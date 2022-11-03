package heranca;

import interfaces.ProfessorInterface;

public class Professor extends Pessoa implements ProfessorInterface {

	public String curso;
	
	@Override
	public String toString() {
		return "Prof. " + nome + " Curso: " + curso;
	}
}
