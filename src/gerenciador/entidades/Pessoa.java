package gerenciador.entidades;

import java.util.Objects;

import gerenciador.utils.Email;
import gerenciador.utils.EmailInterface;

public abstract class Pessoa implements PessoaInterface, Comparable<PessoaInterface> {

	private String nome;
	
	private EmailInterface emailUnivesp;
	
	private EmailInterface emailAlternativo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			return;
		}
		this.nome = nome.trim().toUpperCase();
	}

	public EmailInterface getEmailUnivesp() {
		return emailUnivesp;
	}

	public void setEmailUnivesp(String email) {
		setEmailUnivesp(new Email(email));
	}
	
	public void setEmailUnivesp(EmailInterface email) {
		if (email == null) {
			throw new NullPointerException("E-mail Não Pode ser Nulo");
		}
		
		if (email.temDominio("univesp.br")) {
			emailUnivesp = email;
		} else {
			throw new IllegalArgumentException("E-mail não tem domínio Univesp");
		}
	}

	public EmailInterface getEmailAlternativo() {
		return emailAlternativo;
	}

	public void setEmailAlternativo(String email) {
		setEmailAlternativo(new Email(email));
	}
	
	public void setEmailAlternativo(EmailInterface email) {
		if (email == null) {
			throw new NullPointerException("E-mail não pode ser nulo");
		}
		
		emailAlternativo = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailUnivesp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pessoa))
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(emailUnivesp, other.emailUnivesp);
	}
	
	@Override
	public int compareTo(PessoaInterface o) {
		return emailUnivesp.compareTo(o.getEmailUnivesp());
	}

	
}
