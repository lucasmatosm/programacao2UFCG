package exemplo.heranca;

public abstract class Funcionario {

	private String nome;
	protected double salarioBase;

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public abstract double calculaSalario();

	@Override
	public String toString() {
		return "Nome: " + nome + " - Salario Base: " 
				+ salarioBase + " - Salario Total: " + calculaSalario();
	}

}