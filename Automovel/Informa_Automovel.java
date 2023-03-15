package Automovel;

import javax.swing.JOptionPane;
public class Informa_Automovel {
public static void main(String args[]) {
		
		Dados_Automovel a = new Dados_Automovel();
		
        String m, t, c, pcs;
        double pc;
		
		m = JOptionPane.showInputDialog("Digite a marca do carro:");
		a.setMarca(m);
		
		t = JOptionPane.showInputDialog("Digite o tipo do carro:");
		a.setTipo(t);
		
		c = JOptionPane.showInputDialog("Digite a cor do carro:");
		a.setCor(c);
	
		pcs = JOptionPane.showInputDialog("Digite o preco do carro:");
		
		pc = Double.parseDouble(pcs);
		
		a.setPreco(pc);
		
		System.out.println("marca do automovel: \t" + a.getMarca());  
		System.out.println("cor do automovel: \t" + a.getCor()); 
		System.out.println("tipo do automovel: \t" +  a.getTipo());
		System.out.println("preço do automovel R$: \t" + a.getPreco()); 
		
		
		
}
}
