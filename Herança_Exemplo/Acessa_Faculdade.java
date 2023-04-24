package Fatec;

public class Acessa_Faculdade {
	
	public static void main(String args[]) {
		Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();
		Disciplinas_CEETEPs disciplinas = new Disciplinas_CEETEPs();
		
		ceetps.setFatec("Fatec Baixada Santista");
		System.out.println("Fatec: " + ceetps.getFatec());
		
		ceetps.setFaculdade("ADS");
		System.out.println("Faculdade: " + ceetps.getFaculdade());
		
		disciplinas.setNome_disciplina("POO");
		System.out.println("Disciplina: " + disciplinas.getNome_disciplina());

	}

}
