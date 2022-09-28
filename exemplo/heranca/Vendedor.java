package exemplo.heranca;

public class Vendedor extends Funcionario {

	private double totalDeVendas;
	
	public Vendedor(String nome, double salarioBase) {
		this.setNome(nome);
		this.setSalarioBase(salarioBase);
		totalDeVendas = 0;
	}

	public double calculaSalario() {
		return salarioBase + (this.totalDeVendas * 0.1);
	}

	public double getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(double totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Total de vendas: " + 
			totalDeVendas;
	}

}
