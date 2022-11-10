package heranca;

import interfaces.ProfessorInterface;

public class Professor extends Pessoa implements ProfessorInterface {	
	
	@Override
	public String toString() {
		return String.format("Prof. %s\nE-mail: %s", getNome(), getEmailUnivesp());
	}
}
