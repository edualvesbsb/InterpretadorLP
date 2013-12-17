package unb.cic.lp;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoE extends TestCase {

	public void testE() {
		ValorBooleano valorV = new ValorBooleano(true);
		ValorBooleano valorF = new ValorBooleano(false);
		
		Expressao expressaoE = new ExpressaoE(valorV, valorF);
		
		try {
			ValorBooleano resultado = (ValorBooleano) expressaoE.avaliar(new Ambiente());
			assertEquals(new Boolean(false), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorBooleano valorF = new ValorBooleano(false);
		
		Expressao expressaoE = new ExpressaoE(valor5, valorF);
		
		try {
			expressaoE.avaliar(new Ambiente());
			System.out.println("chamou avaliar. esperavamos uma exceção");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
	}
}
