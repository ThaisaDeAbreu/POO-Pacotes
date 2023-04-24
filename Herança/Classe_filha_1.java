package Herança;

public class Classe_filha_1 extends Superclasse{
	
	private String atributo_2;
	
	Classe_filha_1(){
		super();
		System.out.println("Acesso ao metodo construtor da Classe Filha 1");
		
	}
   
	public void set_atributo_2(String atributo_2) {
		this.atributo_2 = atributo_2;
	}
	
	public String get_atributo_2() {
		return atributo_2;
	}
}