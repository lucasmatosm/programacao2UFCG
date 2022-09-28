package exemplo.heranca;

public class Gerente extends Funcionario{

	
	private int tempoDeServico;

	public Gerente(String nome, double salarioBase) {
		this.setNome(nome);
		this.setSalarioBase(salarioBase);
	}

	public int getTempoDeServico() {
		return tempoDeServico;
	}

	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}

	public double calculaSalario() {
		return salarioBase + (salarioBase * (tempoDeServico * 0.05));
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Tempo de servico: " + 
			tempoDeServico;
	}

}
