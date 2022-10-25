package heranca;

public class Aluno extends Pessoa {

	public int ra;
	
	@Override
	public String toString() {
		return nome + " RA: " + ra;
	}

}
