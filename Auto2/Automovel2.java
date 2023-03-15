package Auto2;

public class Automovel2 {
	
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	Automovel2 () {}
	
	Automovel2(int ano, String marca, String modelo, double preco) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	static {
		cor = "verde";
	}
	
	public void mostracarro() {
		System.out.println("\n" + "Marca" + "\t" + marca + "\n" + "modelo" + "\t" + modelo + "\n" + "ano" + "\t" + ano + "\n" + "cor" + "\t" + cor + "\n" + "preço:" + "\t" + preco);
	}
}
