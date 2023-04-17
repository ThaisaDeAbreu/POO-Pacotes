package Herança;

public class Conceito_Herança {
	
	public static void main(String args[]) {
		
		Classe_filha_2 a = new Classe_filha_2();
		Classe_filha_3 b = new Classe_filha_3();
		
		a.set_atributo_1("Valor do atributo 1");
		a.set_atributo_2("Valor do atributo 2");
		System.out.println(a.get_atributo_1());
		System.out.println(a.get_atributo_2());
		
		b.set_atributo_1("Valor do atributo 1_B");
		b.set_atributo_2("Valor do atributo 2_B");
		System.out.println(b.get_atributo_1());
		System.out.println(b.get_atributo_2());
	}
}
