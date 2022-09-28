package p2.aulas20132;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ProgramadorTeste {

	private Programador p;
	
	@Before public void inicializacao() throws Exception{
		p = new Programador("livia", "123", "123", 25);
	}
	
	@Test public void testaCriaProgramador() throws Exception{
		Programador p = new Programador("livia", "123", "123");//relancando a excecao
		Assert.assertEquals(20, p.getValorDaHora(), 0.001);//verifica valores default para o programador
		//ou
		try{
			p = new Programador("livia", "123", "123");//sem relancar a excecao
			Assert.assertEquals(20, p.getValorDaHora(), 0.001);
		}catch(Exception e){
			Assert.fail();
		}
	}
	
	@Test public void testaCriaProgramadorComExcecao(){
		try{
			Programador p = new Programador("livia", "123", "123", -25);
			Assert.fail();
		}catch(Exception e){
			Assert.assertEquals("Valor deve ser positivo", e.getMessage());
		}
	}
	
	@Test public void testaSets(){
		p.setValorDaHora(0);
		Assert.assertEquals(0, p.getValorDaHora(), 0.001);
		
		p.setValorDaHora(25);
		Assert.assertEquals(25, p.getValorDaHora(), 0.001);
		
		p.setHorasTrabalhadas(160);
		Assert.assertEquals(160, p.getHorasTrabalhadas());	
	}
	
	@Test public void testaCalculaPagamento(){
		Assert.assertEquals(0, p.calculaPagamento(), 0.001);//sem trabalhar nada
		p.setHorasTrabalhadas(100);
		Assert.assertEquals(2500, p.calculaPagamento(), 0.001);
	}
}
