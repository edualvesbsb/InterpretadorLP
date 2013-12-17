package unb.cic.lp;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoSe extends TestCase {

	public void testSoma() {
		ValorBooleano condicaoV = new ValorBooleano(true);
		ValorBooleano condicaoF = new ValorBooleano(false);
		ValorInteiro entao = new ValorInteiro(5);
		ValorInteiro senao = new ValorInteiro(10);
		
		Expressao se = new ExpressaoSe(condicaoV, entao, senao);
		
		try {
			ValorInteiro resultado = (ValorInteiro)se.avaliar(new Ambiente());
			assertEquals(new Integer(5), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
		
		se = new ExpressaoSe(condicaoF, entao, senao);
		
		try {
			ValorInteiro resultado = (ValorInteiro)se.avaliar(new Ambiente());
			assertEquals(new Integer(10), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro condicao = new ValorInteiro(3);
		ValorInteiro entao = new ValorInteiro(5);
		ValorInteiro senao = new ValorInteiro(10);
		
		Expressao se = new ExpressaoSe(condicao, entao, senao);
		
		try {
			se.avaliar(new Ambiente());
			System.out.println("chamou avaliar. esperavamos uma exceção");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
	}
}
