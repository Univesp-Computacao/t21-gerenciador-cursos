import heranca.Aluno;
import heranca.Pessoa;
import heranca.Professor;

public class Teste {
	
	public static void main(String[] args) {
		System.out.println("Ola");
		
		Aluno a = new Aluno(123456);
		Professor p = new Professor();
		
		
		a.setNome("Felipe");
		a.setEmailUnivesp("felipe@univesp.br");
		a.setEmailAlternativo("felipe@gmail.com");
		
		
//		p.nome = "Carlos";
//		p.emailUnivesp = "carlos@univesp.br";
//		p.emailAlternativo = "carlos@gmail.com";
//		p.curso = "OOP";
		
		Teste.printPessoa(a);
//		Teste.printPessoa(p);
		
		System.out.println(a);
		// System.out.println(p);
		
		
	}
	
	 public static void printPessoa(Pessoa p) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("E-mail: " + p.getEmailUnivesp());
	}
	

}
