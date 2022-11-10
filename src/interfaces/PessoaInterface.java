package interfaces;

import utils.EmailInterface;

public interface PessoaInterface {
	public String getNome();

	public void setNome(String nome);

	public EmailInterface getEmailUnivesp();

	public void setEmailUnivesp(String emailUnivesp);
	
	public void setEmailUnivesp(EmailInterface emailUnivesp);

	public EmailInterface getEmailAlternativo();

	public void setEmailAlternativo(String emailAlternativo);
	
	public void setEmailAlternativo(EmailInterface emailAlternativo);

}
