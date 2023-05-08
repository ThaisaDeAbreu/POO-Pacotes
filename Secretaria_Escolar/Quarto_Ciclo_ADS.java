package Secretaria;

public class Quarto_Ciclo_ADS extends Secretaria_Escolar{
	
	public static void main (String args[]){
		
		Secretaria_Escolar A = new Secretaria_Escolar();
		Insere_Dados(A);
		
		Secretaria_Escolar B = new Secretaria_Escolar("Maria", 22, 7.7, "Analise e Desenvolvimento de Sisitemas");
	    Insere_Dados(B);
	    
	}
	
	public static void Insere_Dados(Secretaria_Escolar C) {
		System.out.println("Nome do aluno: \t" + C.getNome_aluno());
		System.out.println("Nome do aluno: \t" + C.getIdade_aluno());
		System.out.println("Nome do aluno: \t" + C.getMedia_aluno());
		System.out.println("Nome do aluno: \t" + C.getCurso_aluno());

	}
}
