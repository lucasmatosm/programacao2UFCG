import static org.junit.Assert.*;
import junit.framework.Assert;

import nucleo.ContaSimples;
import nucleo.Pessoa;

import org.junit.Before;
import org.junit.Test;

public class ContaSimplesTest {

	private ContaSimples conta;

	@Before
	public void antes() throws Exception {
		conta = new ContaSimples("Tarcisio", "123456-7", 123);
	}

	@Test
	public void testValoresConstruidos() {
		assertEquals("Tarcisio", conta.getTitular().getNome());
		assertEquals("123456-7", conta.getTitular().getCpf());
		assertEquals(123, conta.getId());

	}

	@Test
	public void testDepositaValor() throws Exception {

		conta.depositar(1000);
		double saldoAtual = conta.getSaldo();

		assertEquals("valor não foi esperado", 1000, saldoAtual, 0);
	}

	@Test
	public void testSacarValor() throws Exception {
		conta.depositar(1000);
		conta.sacar(500);
		assertEquals(500, conta.getSaldo(), 0);
	}

	@Test
	public void testSacarValdoInsuficiente() {
		boolean sucesso = conta.sacar(500);
		assertEquals(false, sucesso);
	}

	@Test
	public void testDepositoNegativo() {
		try {
			conta.depositar(-500);
			Assert.fail("Uma exceção era esperada");
		} catch (Exception e) {
			assertEquals("O valor do deposito tem que ser maior que zero",
					e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testConstrutor() throws Exception {
		ContaSimples conta2 = new ContaSimples("", "1234556", 1232);
	}

	@Test(expected = Exception.class)
	public void testConstrutorCpfVazio() throws Exception {
		conta = new ContaSimples("joao", null, 12345);
	}

	@Test(expected = Exception.class)
	public void testConstrutorCpfStringVazio() throws Exception {
		conta = new ContaSimples("joao", "", 12345);
	}

	@Test
	public void testConstrutor2() {
		try {
			conta = new ContaSimples("joao", null, 12345);
			Assert.fail("Era esperada uma exceção");
		} catch (Exception e) {
			String valorEsperado = "cpf nao pode ser nulo ou vazio";
			assertEquals(valorEsperado, e.getMessage());
		}
	}
	
	
	@Test
	public void testConstrutorComPessoa() {
		String nome = "joão";
		String cpf = "123456";
		Pessoa joao = new Pessoa(nome, cpf);
		conta = new ContaSimples(joao, 1);
		
		assertEquals(nome, conta.getTitular().getNome());
		assertEquals(cpf, conta.getTitular().getCpf());
		
	}

	// @Test
	// public void testSacarValor() {
	// conta.depositar(1000);
	// conta.sacar(500);
	// double saldoAtual = conta.getSaldo();
	// assertEquals(500, saldoAtual,2);
	// }

}
