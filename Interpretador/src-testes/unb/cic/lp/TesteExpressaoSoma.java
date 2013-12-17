package unb.cic.lp;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoSoma extends TestCase {

	public void testSoma() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorInteiro valor10 = new ValorInteiro(10);
		
		Expressao soma = new ExpressaoSoma(valor5, valor10);
		
		try {
			ValorInteiro resultado = (ValorInteiro)soma.avaliar(new Ambiente());
			assertEquals(new Integer(15), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorBooleano valorF = new ValorBooleano(false);
		
		Expressao soma = new ExpressaoSoma(valor5, valorF);
		
		try {
			soma.avaliar(new Ambiente());
			System.out.println("chamou avaliar. esperavamos uma exceção");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
	}
}
