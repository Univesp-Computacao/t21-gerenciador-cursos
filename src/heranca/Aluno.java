package heranca;

public class Aluno extends Pessoa {

	private int ra;
	
	public Aluno(int ra){
		super();
		this.ra = ra;
	}
	
	public int getRa() {
		return ra;
	}
	
	@Override
	public String toString() {
		return nome + " RA: " + ra;
	}
	
	@Override
	public void setEmailUnivesp(String email) {
		email = email.trim();
		boolean temDominio = email.endsWith("aluno.univesp.br");
		
		if (temDominio) {
			super.setEmailUnivesp(email);
		} else {
			throw new IllegalArgumentException("E-mail não tem domínio Univesp");
		}
	}

}
