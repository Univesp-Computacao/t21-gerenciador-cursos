package gerenciador;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		App app = new App();
		
		app.init();
		
		boolean executando;
		
		do {
			executando = app.run(sc);
		} while(executando);
		
		System.out.println("Saindo do Programa");
	}
	

}
