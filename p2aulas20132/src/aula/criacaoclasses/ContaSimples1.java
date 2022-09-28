package aula.criacaoclasses;
/**
 * A primeira classe da turma da profa Livia <br>
 * @author Turma 3 de P2
 * 
 */
public class ContaSimples1 {
	private String nome, cpf;
	private int numeroDaConta;
	private double saldo;
	
	/**
	 * 
	 * @param nome O nome do cliente da conta
	 * @param cpf
	 * @param numeroDaConta
	 */
	public ContaSimples1(String nome, String cpf, int numeroDaConta){
		 this.nome = "sofia";
		 this.cpf = cpf;
		 this.numeroDaConta = numeroDaConta;
		 saldo = 0.0;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getSaldo(){
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
		}	
	}
	
	public boolean sacar(double valor){
		if(valor < 0 || valor > saldo){
			return false;
		}	
		saldo -= valor;
		return true;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " cpf: " + cpf + " numero: " + numeroDaConta + " saldo: " + saldo;
	}
	

}
