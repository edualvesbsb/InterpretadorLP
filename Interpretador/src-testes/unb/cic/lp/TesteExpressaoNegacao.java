package unb.cic.lp;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoNegacao extends TestCase {
	public void testNeg(){
		try {
			ValorBooleano valorV = new ValorBooleano(true);
			ValorBooleano valorF = new ValorBooleano(false);
			
			Expressao expressaoNegacao1 = new ExpressaoNegacao(valorV);
			Expressao expressaoNegacao2 = new ExpressaoNegacao(valorF);
			
			assertEquals(new Boolean(false), ((ValorBooleano)expressaoNegacao1.avaliar(new Ambiente())).getValor());
			assertEquals(new Boolean(true), ((ValorBooleano)expressaoNegacao2.avaliar(new Ambiente())).getValor());
		}
		catch(ErroDeTipoException e) {
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro valor5 = new ValorInteiro(5);
		
		Expressao negacao = new ExpressaoNegacao(valor5);
		
		try {
			negacao.avaliar(new Ambiente());
			System.out.println("chamou avaliar. esperavamos uma exceção");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
	}
}
