package br.com.vainaweb.backendt1.HerançaAbstract;

import java.util.Scanner;

public abstract class Colaborador {

	private String senioridade;
	private String habilidadeTecnica;
	private String nome;
	private String cpf;
	private int idade;
	private boolean isAtivo = true;
	private int tempoEmCargo;

	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, int idade, String senioridade, String habilidadeTecnica, int tempoEmCargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.habilidadeTecnica = habilidadeTecnica;
		this.senioridade = senioridade;
		this.tempoEmCargo = tempoEmCargo;
	}
	
	public abstract void setSalario(String senioridade);
	public abstract double getSalario();
	
	
	
	
	public int getTempoEmCargo() {
		return tempoEmCargo;
	}

	public void setTempoEmCargo(int tempoEmCargo) {
		this.tempoEmCargo = tempoEmCargo;
	}
	
	public abstract double receberAumento();
	

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		senioridade = senioridade.toUpperCase();
		this.senioridade = senioridade;
	}

	public String getNome() {
		return nome;
	}

	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}

	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isAtivo() {

		return isAtivo;
	}

//	public void setAtivo(boolean isAtivo) {
//		this.isAtivo = isAtivo;
//	}

	// Métodos
	public String visualizar() {
		return "\n[ " + this.nome + ", " + this.idade + " ]" + "\n CPF: " + this.cpf + "\nEstá ativo ?: " + this.isAtivo;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deseja desvincular " + this.nome + " da empresa ?");
		Character resposta = sc.next().charAt(0);
		Character.toLowerCase(resposta);
		if (resposta.equals('s')) {
			System.out.println(this.nome + " está demitido(a)");
			this.isAtivo = false;
		}
		sc.close();
	}
	
	

}
