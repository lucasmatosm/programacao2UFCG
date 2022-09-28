package p2.aulas20132;

public class Fatura implements Pagavel{
	private String descricao;
	private double valor;
	
	public Fatura(String descricao, double valor){
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public double getValor(){
		return valor;
	}
	
	@Override
	public double calculaPagamento() {
		return valor;
	}
	
	@Override
	public String toString() {
		return getDescricao() + " valor: " + getValor();
	}

}
