package app;

import java.util.Scanner;

import nucleo.ContaSimples;

public class Exemplo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		// criar conta
		String nome = "joão";
		String cpf = "123456";
		int numero = 1;
		ContaSimples conta = new ContaSimples(nome, cpf, numero);

		
		boolean sucesso = false;
		while (!sucesso) {
			 
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor para depositar");
			double valor = sc.nextDouble();

			try {
				conta.depositar(valor);
				System.out.println("Deposito feito com sucesso");
				sucesso = true;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				sucesso = false;
			}

		}

	}

}
