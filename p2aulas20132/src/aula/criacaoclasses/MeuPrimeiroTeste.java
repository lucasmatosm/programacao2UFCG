package aula.criacaoclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeuPrimeiroTeste {
	
	@Test public void testaContaSimples1(){
		ContaSimples1 c = new ContaSimples1("livia", "123454577", 1);
		
		//inicializa��o
		assertEquals("livia", c.getNome());
		
	}

}
