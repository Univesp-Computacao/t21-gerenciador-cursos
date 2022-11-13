package gerenciador.entidades;

import gerenciador.utils.Email;
import gerenciador.utils.EmailInterface;

public class Aluno extends Pessoa implements AlunoInterface {

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
		
		return String.format("RA: %d\nNome: %s\nE-mail: %s\n", getRa(), getNome(), getEmailUnivesp());
	}
	
	@Override
	public void setEmailUnivesp(String email) {
		this.setEmailUnivesp(new Email(email));
	}
	
	@Override
	public void setEmailUnivesp(EmailInterface email) {
		if (email == null) {
			throw new NullPointerException("E-mail não Pode ser Nulo");
		}
		
		if(email.temDominio("aluno.univesp.br")) {
			super.setEmailUnivesp(email);
		} else {
			throw new IllegalArgumentException("E-mail não tem domínio Aluno da Univesp");
		}
	}

}
