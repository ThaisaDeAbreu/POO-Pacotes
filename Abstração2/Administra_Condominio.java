package abstraçao2;

public class Administra_Condominio {
	
	public static void main(String args[]) {
		Condominio b = new Condominio();
		Conceito c = new Condominio();
		
	    final double a = 234.08;
	    
	    System.out.println("Nome do condominio: " + b.getNome_condominio());
	    System.out.println("Valor do condominio = R$ " + b.calcula_condominio(a));
	    
	    c.endereço_condominio();
	}

}
