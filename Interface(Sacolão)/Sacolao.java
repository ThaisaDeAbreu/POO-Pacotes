package Pacote_interface;

public class Sacolao {
	
	public static void main (String args[]) {
		Implementa_interface a = new Implementa_interface();
		a.fruta_citrica = "laranja";
		a.fruta_vermelha = "maça";
		
		System.out.println ("Fruta citrica: " + a.identifica_fruta(a.fruta_citrica));
		System.out.println ("Fruta vermelha: " + a.identifica_fruta(a.fruta_vermelha));
		System.out.println ("Quantidade de frutas: " + a.quantidade_frutas(12));
		System.out.println ("Preco kilo da fruta: R$ " + a.preco_kilo(5.66));
	}
}
