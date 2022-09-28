package nucleo;
public class Pessoa {
	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa(String nome) {
		this(nome, "");
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;

	}

	public boolean equals(Object object) {
		if (!(object instanceof Pessoa))
			return false;

		Pessoa pessoaComparada = (Pessoa) object;
		if (this.cpf.equals(pessoaComparada.getCpf()))
			return true;

		return false;
	}
	


}
