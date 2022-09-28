package nucleo;

import java.lang.Exception;


/**
 * 
 * @author gustavoas
 * @version 1.0
 */
public class ContaSimples {

	private double saldo;
	private Pessoa titular;
	private int id;

	/**
	 * 
	 * @param nome
	 *            O nome do titular da conta
	 * @param cpf
	 *            O cpf do titular da conta
	 * @param numero
	 *            O numero da conta
	 * @throws Exception 
	 */
	public ContaSimples(String nome, String cpf, int numero) throws Exception {
		if(nome == null || nome.trim().equals(""))
			throw new Exception("nome nao pode ser vazio");
		
		if (cpf == null || cpf.trim().equals("")) 
			throw new Exception("cpf nao pode ser nulo ou vazio");
		
		titular = new Pessoa(nome,cpf);
		
		this.id = numero;
	}

	public ContaSimples(Pessoa pessoa, int numero) {
		
		titular = pessoa;
		
		
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;

	}

	public Pessoa getTitular() {
		return titular;
	}

	public int getId() {
		return id;
	}

	public void depositar(double valor) throws Exception {
		if (valor <= 0)
			throw new Exception(
					"O valor do deposito tem que ser maior que zero");
		saldo += valor;
		return;
	}

	public double getSaldo() {
		return saldo;
	}
}
