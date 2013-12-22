package unb.cic.lp;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoMaiorQue extends TestCase {

	public void testMaiorQue() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorInteiro valor10 = new ValorInteiro(10);
		List<DeclaracaoFuncao> listaFuncoes = new ArrayList<DeclaracaoFuncao>();
		
		Expressao mq = new ExpressaoMaiorQue(valor5, valor10);
		
		try {
			ValorBooleano resultado = (ValorBooleano)mq.avaliar(new Ambiente(), listaFuncoes);
			assertEquals(new Boolean(false), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
		
		mq = new ExpressaoMaiorQue(valor10, valor5);
		
		try {
			ValorBooleano resultado = (ValorBooleano)mq.avaliar(new Ambiente(), listaFuncoes);
			assertEquals(new Boolean(true), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorBooleano valorF = new ValorBooleano(false);
		List<DeclaracaoFuncao> listaFuncoes = new ArrayList<DeclaracaoFuncao>();
		
		Expressao mq = new ExpressaoMaiorQue(valor5, valorF);
		
		try {
			mq.avaliar(new Ambiente(), listaFuncoes);
			System.out.println("chamou avaliar. esperavamos uma exceção");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
	}
}
