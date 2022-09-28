package aula.criacaoclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeuPrimeiroTeste {
	
	@Test public void testaContaSimples1(){
		ContaSimples1 c = new ContaSimples1("livia", "123454577", 1);
		
		//inicialização
		assertEquals("livia", c.getNome());
		
	}

}
