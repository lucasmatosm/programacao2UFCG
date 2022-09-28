package exemplo.heranca;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Joao", 2500);
		gerente.setTempoDeServico(5);

		Vendedor vendedor = new Vendedor("Joao", 900);
		vendedor.setTotalDeVendas(10000);

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		funcionarios.add(vendedor);
		funcionarios.add(gerente);

		for (Funcionario funcionarioAtual : funcionarios) {
			System.out.println(funcionarioAtual.toString());
			System.out.println("======================");
		}
		
		
	}

}
