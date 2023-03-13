package Contribuinte;


import javax.swing.JOptionPane;
public class Informa_Dados {
public static void main(String args[]) {
		
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		String n, cpf, cnpj, cart;
		
		n = JOptionPane.showInputDialog("Digite o seu nome:");
		a.setNome(n);
		
		cpf = JOptionPane.showInputDialog("Digite o seu CPF:");
		a.setCPF(cpf);
		
		cnpj = JOptionPane.showInputDialog("Digite o seu CNPJ:");
		a.setCNPJ(cnpj);
		
		cart = JOptionPane.showInputDialog("Digite o numero do seu cartao:");
		a.setCartao(cart);
		
		System.out.println("O nome do contribuinte é: " + a.getNome());
		System.out.println("O CPF do contribuinte é: " + a.getCPF());
		System.out.println("O CNPJ do contribuinte é: " + a.getCNPJ());
		System.out.println("O n. do Cartao do contribuinte é: " + a.getCartao());
		
		}
}