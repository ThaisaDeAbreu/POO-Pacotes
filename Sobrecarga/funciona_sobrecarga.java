package Metodos;

import javax.swing.JOptionPane;
public class funciona_sobrecarga {
	
	public static void main(String args []) {
		Ficha_funcionarios func = new Ficha_funcionarios(22, 2889.00, "Gisele", "Pedagoga");
		JOptionPane.showMessageDialog(null, func.mostra_funcionarios());
		
		concatena_aplicação();
	}
	
	public static void concatena_aplicação() {
		Acesso_secundario a = new Acesso_secundario();
	}

}
