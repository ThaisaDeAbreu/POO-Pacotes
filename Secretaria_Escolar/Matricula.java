package Secretaria;

public class Matricula extends Quarto_Ciclo_ADS{
	public static void main(String args[]) {
		
		Quarto_Ciclo_ADS E = new Quarto_Ciclo_ADS();
		E.setMatricula_aluno("RA122000");
		System.out.println("Natricula: \t" + E.getMatricula_aluno());
	}


}
