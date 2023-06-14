package Metodos;

public class Ficha_funcionarios {
	
	private String nome;
	private int idade;
	private String profissao;
	private double salario;
	
	Ficha_funcionarios e;
	Ficha_funcionarios(String nome, String profissao, int idade, double salario){
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.salario = salario;
	}
	
	Ficha_funcionarios(int idade, double salario, String nome, String profissao){
		this.idade = idade;
		this.salario = salario;
		this.nome = nome;
		this.profissao = profissao;
	}
	
	Ficha_funcionarios(Ficha_funcionarios e){
		this.e = e;
		mostra_funcionarios(e);
	}
	
	public void mostra_funcionarios(Ficha_funcionarios f) {
		System.out.println("Nome: " + f.nome + "\nIdade: " + f.idade + "\nProfissão: " + f.profissao + "\nSalario: " + f.salario);
	}
	
	public String mostra_funcionarios( ) {
		return ("Nome: " + nome + "\nIdade: " + idade + "\nProfissão: " + profissao + "\nSalario: " + salario);
	}
	

}
