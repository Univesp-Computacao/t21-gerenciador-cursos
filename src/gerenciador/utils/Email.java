package gerenciador.utils;

import java.util.Objects;
import java.util.regex.Pattern;

public class Email implements EmailInterface, Comparable<EmailInterface> {

	private String email;
	
	public Email(String email) {
		if (email == null) {
			throw new NullPointerException("E-mail não pode ser nulo");
		}
		
		// Expressao Regular
		// Nao precisa saber agora, mas eh um recurso
		// usado em varias linguagens para validar e encontrar
		// padroes em strings
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		email = email.trim();
		
		if (Pattern.compile(regex).matcher(email).matches()) {
			this.email = email;
		} else {
			throw new IllegalArgumentException("E-mail Inválido");
		}
	}
	
	@Override
	public String toString() {
		return email;
	}
	
	public boolean temDominio(String dominio) {
		return email.endsWith(dominio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Email))
			return false;
		Email other = (Email) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public int compareTo(EmailInterface o) {
		// TODO Auto-generated method stub
		return email.compareTo(o.toString());
	}
}
