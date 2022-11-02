package heranca;

public class Pessoa {

	protected String nome;
	
	private String emailUnivesp;
	
	protected String emailAlternativo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim().toUpperCase();
	}

	public String getEmailUnivesp() {
		return emailUnivesp;
	}

	public void setEmailUnivesp(String emailUnivesp) {
		emailUnivesp = emailUnivesp.trim();
		boolean temDominio = emailUnivesp.endsWith("univesp.br");
		
		if (temDominio) {
			this.emailUnivesp = emailUnivesp;
		} else {
			throw new IllegalArgumentException("E-mail não tem domínio Univesp");
		}
	}

	public String getEmailAlternativo() {
		return emailAlternativo;
	}

	public void setEmailAlternativo(String emailAlternativo) {
		this.emailAlternativo = emailAlternativo.trim();
	}

	
}
