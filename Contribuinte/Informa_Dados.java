package Contribuinte;

public class Informa_Dados {
	
	public static void main(String args[]) {
		
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		a.setNome("Thaisa de Abreu Souza");
		a.setCPF("000.000.000-00");
		a.setCNPJ("111 111 /1111");
		a.setCartao("2222/2");
				
		
		System.out.println("O nome do contribuinte é: " + a.getNome());
		System.out.println("O CPF do contribuinte é: " + a.getCPF());
		System.out.println("O CNPJ do contribuinte é: " + a.getCNPJ());
		System.out.println("O n. do Cartao do contribuinte é: " + a.getCartao());
					
	}

}