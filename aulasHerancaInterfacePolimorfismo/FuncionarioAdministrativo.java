package p2.aulas20132;

public class FuncionarioAdministrativo extends Funcionario{
	private int faltas;
	private double salarioBase;
	private static double percentualGratificacao = 0.0;
	
	public FuncionarioAdministrativo(String nome, String cpf, String matricula){
		super(nome, cpf, matricula);
		salarioBase = 0.0;
	}
	
	@Override
	public void imprimeBoasVindas(){
		System.out.println("Administrar eh preciso!");
	}
	
	public static void imprimeDescricao(){
		System.out.println("Funcionario Administrativo!");
	}
	
	public void adicionaFalta(){
		faltas++;
	}
	
	private double calculaGratificacao(){
		return percentualGratificacao*salarioBase;
	}
	
	private double calculaDesconto(){
		return faltas*8*(salarioBase/30);
	}
	public void setSalarioBase(double novo){
		salarioBase = novo;
	}
	
	public static void setGratificacao(double novo){
		percentualGratificacao = novo;
	}
	
	@Override
	public double calculaPagamento() {
		return salarioBase + calculaGratificacao() - calculaDesconto();
	}
	
}
