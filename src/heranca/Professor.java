package heranca;

public class Professor extends Pessoa {

	public String curso;
	
	@Override
	public String toString() {
		return "Prof. " + nome + " Curso: " + curso;
	}
}
