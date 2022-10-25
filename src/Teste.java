import heranca.Aluno;
import heranca.Pessoa;
import heranca.Professor;

public class Teste {
	
	public static void main(String[] args) {
		System.out.println("Ola");
		
		Aluno a = new Aluno();
		Professor p = new Professor();
		
		a.nome = "Felipe";
		a.emailUnivesp = "felipe@univesp.br";
		a.emailAlternativo = "felipe@gmail.com";
		a.ra = 123456;
		
		p.nome = "Carlos";
		p.emailUnivesp = "carlos@univesp.br";
		p.emailAlternativo = "carlos@gmail.com";
		p.curso = "OOP";
		
		Teste.printPessoa(a);
		Teste.printPessoa(p);
		
		System.out.println(a);
		System.out.println(p);
		
		
	}
	
	 public static void printPessoa(Pessoa p) {
		System.out.println("Nome: " + p.nome);
		System.out.println("E-mail: " + p.emailUnivesp);
	}
	

}
