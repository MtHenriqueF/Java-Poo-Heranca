package br.com.vainaweb.backendt1.HerançaAbstract;

public class App {

	public static void main(String[] args) {
		//(String nome, String cpf, int idade, String senioridade, String habilidadeTecnica)
		DevBackEnd devMateus = new DevBackEnd("Mateus", "12415", 20, "SENIOR", "Spring", 55);
		DevFrontEnd devAna = new DevFrontEnd("Ana", "34142", 19, "SENIOR", "React", 28);
		
		
		double salarioMateus = devMateus.getSalario();
		double salarioAna = devAna.getSalario();
		
		System.out.println("Salario ana: " + salarioAna);
		System.out.println("Salario mateus: " + salarioMateus);
		
		System.out.println(devMateus.visualizar());
		System.out.println(devAna.visualizar());
		
	}

}

