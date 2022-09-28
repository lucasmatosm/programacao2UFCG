package p2.aulas20132;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Funcionario implements Pagavel, Comparable<Funcionario>{
	private String nome, cpf, matricula;
	private Calendar dataDeAdmissao;
	private static int cont;
	
	public Funcionario(String nome, String cpf, String matricula){
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		dataDeAdmissao = new GregorianCalendar();
		imprimeBoasVindas(); //ver efeito colateral de chamar metodos publicos/sobrescritos no construtor
		cont++;
	}
	
	public static int contador(){
		return cont;
	}
	
	public void imprimeBoasVindas(){
		System.out.println("Bem vindo!");
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getDataDeAdmissao() {
		return (dataDeAdmissao.get(Calendar.DAY_OF_WEEK)+1) +"/"+ 
				dataDeAdmissao.get(Calendar.MONTH) + "/" + 
				dataDeAdmissao.get(Calendar.YEAR);
	}
	
	@Override
	public String toString() {
		return "nome: " + nome + " matricula: " + matricula + " admissao: " + getDataDeAdmissao();
	}
	
	@Override
	public int compareTo(Funcionario obj) {
		return (int) ((calculaPagamento() - obj.calculaPagamento()) * 100);
	}
	
	public static void main(String[] args) {
		Pagavel f = new FuncionarioAdministrativo("1", "2", "3");
		System.out.println(f); //note que chamamos o toString, mas, Pagavel nao tem toString. Interface em java herdam da interface Object
	}
}
