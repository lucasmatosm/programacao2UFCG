package p2.aulas20132;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
	public static void main(String[] args) throws Exception{//nao fazer isso!!!!
		List<Pagavel> lista = new ArrayList<Pagavel>();
		preencheLista(lista);
		geraFolha(lista);
		mostraQuantidade();
		compara();
	}
	
	private static void compara() throws Exception{
		FuncionarioAdministrativo f1 = new FuncionarioAdministrativo("livia", "123", "1");
		f1.setSalarioBase(1500);
		
		Programador f3 = new Programador("joao", "12345", "3");
		f3.setHorasTrabalhadas(160);
		
		System.out.println("f1.compareTo(f3): " + f1.compareTo(f3));
		
	}

	private static void preencheLista(List<Pagavel> lista) throws Exception{
		//funcionarios
		
		FuncionarioAdministrativo f1 = new FuncionarioAdministrativo("livia", "123", "1");
		f1.setSalarioBase(1500);
		FuncionarioAdministrativo f2 = new FuncionarioAdministrativo("maria", "1234", "2");
		f2.setSalarioBase(1000);
		f2.adicionaFalta();
		Programador f3 = new Programador("joao", "12345", "3");
		f3.setHorasTrabalhadas(160);
		//faturas
		lista.add(new Fatura("limpeza", 500));
		lista.add(new Fatura("escritorio", 500));
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
	}
	
	private static void geraFolha(List<Pagavel> lista){
		for(Pagavel f: lista){
			System.out.println(f + " salario: " + f.calculaPagamento());//chamada polimorfica; quem?
		}
	}
	
	private static void mostraQuantidade() throws Exception{
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		FuncionarioAdministrativo f1 = new FuncionarioAdministrativo("livia", "123", "1");
		f1.setSalarioBase(1500);
		FuncionarioAdministrativo f2 = new FuncionarioAdministrativo("maria", "1234", "2");
		f2.setSalarioBase(1000);
		f2.adicionaFalta();
		Programador f3 = new Programador("joao", "12345", "3");
		f3.setHorasTrabalhadas(160);
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		
		for(Funcionario func: lista){//nao ha polimorfismo com metodos estaticos!
			System.out.println(func.contador());
		}
	}

}
