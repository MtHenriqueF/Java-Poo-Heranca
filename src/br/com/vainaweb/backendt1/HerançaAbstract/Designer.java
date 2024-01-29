package br.com.vainaweb.backendt1.HerançaAbstract;


public class Designer extends Colaborador {

	
	private double salario;

	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designer(String nome, String cpf, int idade, String senioridade, String habilidadeTecnica, int tempoEmCargo) {
		super(nome, cpf, idade, senioridade, habilidadeTecnica, tempoEmCargo);
		
	}
	
	
	


	@Override
	public String visualizar() 
	{
		return super.visualizar() + "\n\nCaracteristicas:"  + "\nTempo em cargo: " + getTempoEmCargo() +
				" meses\nsenioridade: " + getSenioridade() + "\nsalário: " + this.salario;
	}


	//salario determinado devido ao cargo e senioridade.
	@Override
	public void setSalario(String senioridade) 
	{
		switch(senioridade)
		{
		case "SENIOR":
			salario = 11000.0;
			break;
			
		case "ESTAGIARIO":
			salario = 600.0;
			break;
			
		case "JUNIOR":
			salario = 1500;
			break;
			
		case "PLENO":
			salario = 4500;
			default:
				System.out.println("Insira uma senioridade válida");
		}
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
		
		switch(getSenioridade()) 
		{
		case("JUNIOR"):
			
			if(getTempoEmCargo() >= 26) 
			{
				aumento = 800;
			} else {
				aumento = 0; // nao terá aumento
			}
		break;
		
		case("PLENO"):
			if(getTempoEmCargo() >= 36) 
			{
				aumento = 1000;
			} else {
				aumento = 0;
			}
		break;
		
		case("SENIOR"):
			
			if(getTempoEmCargo() >= 50) 
			{
				aumento = 2000;
			} else {
				aumento = 0;
			}
		break;
		
		default:
			aumento = 0;
		
		}
		return aumento;
	}

}

