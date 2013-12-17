package unb.cic.lp;

import junit.framework.TestCase;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoLet extends TestCase {

	
	public void testLet() {
		Ambiente ambienteInicial = new Ambiente();
		ExpressaoLet let = new ExpressaoLet("x", new ValorInteiro(10), new ExpressaoSoma(new ExpressaoRefId("x"), new ValorInteiro(5)));
		
		try {
			assertEquals(new Integer(15), ((ValorInteiro)let.avaliar(ambienteInicial)).getValor());
		} catch (ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
}
