import static org.junit.Assert.*;

import nucleo.Pessoa;

import org.junit.Before;
import org.junit.Test;


public class PessoaTest {
	
	@Test
	public void testeConstrutor(){
		String nome = "Jeremias";
		String cpf = "6666666";
		Pessoa pessoa = new Pessoa(nome,cpf);
		assertEquals(nome, pessoa.getNome());
		assertEquals(cpf, pessoa.getCpf());
		
		Pessoa pessoa2 = new Pessoa(nome);
		pessoa2.setCpf(cpf);
		assertEquals(nome, pessoa2.getNome());
		assertEquals(cpf, pessoa2.getCpf());
		
		assertTrue(pessoa.equals(pessoa2));
		
		
	}
	
	
	


}
