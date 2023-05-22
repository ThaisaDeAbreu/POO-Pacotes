package Abstração;

public class Aplicação {
	public static void main(String args[]) {
		Classe_abstrata a = new Classe_Filha();
		a.setMensagem("Demonstracao Classe Abstrata");
		a.mostra_mensagem();
	}
}
