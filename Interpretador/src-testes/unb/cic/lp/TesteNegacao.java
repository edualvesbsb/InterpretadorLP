package unb.cic.lp;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorInteiro;

public class TesteNegacao extends TestCase {
	public void testNeg(){
		try {
			ValorInteiro valor = new ValorInteiro(5);
		
			ValorInteiro valorNeg = new ValorInteiro(-6);
			Expressao resultado = new ExpressaoNegacao(valor);
			Expressao resultadoNeg = new ExpressaoNegacao(valorNeg);
			
			assertEquals(new Integer(-5), ((ValorInteiro)resultado.avaliar()).getValor());
			assertEquals(new Integer(6), ((ValorInteiro)resultadoNeg.avaliar()).getValor());
		}
		catch(ErroDeTipoException e) {
			fail();
		}
	}
}
