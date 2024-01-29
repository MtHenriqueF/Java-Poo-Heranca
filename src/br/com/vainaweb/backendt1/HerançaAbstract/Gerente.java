package br.com.vainaweb.backendt1.HerançaAbstract;

public class Gerente extends Colaborador {

	private double salario;
	
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, int idade, String senioridade, String habilidadeTecnica, int tempoEmCargo) {
		super(nome, cpf, idade, senioridade, habilidadeTecnica, tempoEmCargo);
		
	}


	@Override
	public String visualizar() 
	{
		return super.visualizar() + "\n\nCaracteristicas:"  + 
				"\nTempo em cargo: " + getTempoEmCargo() + " meses\nsalário: " + this.salario;
	}


	//salario determinado devido ao cargo e senioridade.
	@Override
	public void setSalario(String senioridade) 
	{
		salario = 20000;
	}


	@Override
	public double getSalario() {
		setSalario(getSenioridade());
		salario += receberAumento();
		return salario;
	}
	
	//define um aumento automatico de acordo com o tempo de cargo, se não chegar nesse tempo não terá aumento.
	
	@Override
	public double receberAumento()
	{
		double aumento = 0;
		
		if(getTempoEmCargo() > 58)
			aumento = 5000;
		
		return aumento;
	}

}
