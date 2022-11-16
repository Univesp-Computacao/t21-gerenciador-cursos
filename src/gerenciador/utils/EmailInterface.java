package gerenciador.utils;

public interface EmailInterface {

	public boolean temDominio(String dominio);
	public boolean equals(Object obj);
	public int hashCode();
	public int compareTo(EmailInterface o);
}
