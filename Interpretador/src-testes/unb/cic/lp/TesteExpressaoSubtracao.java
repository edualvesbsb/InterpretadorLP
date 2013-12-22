package unb.cic.lp;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class TesteExpressaoSubtracao extends TestCase{
	
	public void testSubtracao() {
		try {
			ValorInteiro valor10 = new ValorInteiro(10);
			ValorInteiro valor5 = new ValorInteiro(5);
			List<DeclaracaoFuncao> listaFuncoes = new ArrayList<DeclaracaoFuncao>();

			Expressao subtracao = new ExpressaoSubtracao(valor10, valor5);
		
			ValorInteiro resultado = (ValorInteiro)subtracao.avaliar(new Ambiente(), listaFuncoes);
		
			assertEquals(new Integer(5), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorBooleano valorF = new ValorBooleano(false);
		List<DeclaracaoFuncao> listaFuncoes = new ArrayList<DeclaracaoFuncao>();
		
		Expressao subtracao = new ExpressaoSubtracao(valor5, valorF);
		
		try {
			subtracao.avaliar(new Ambiente(), listaFuncoes);
			System.out.println("chamou avaliar. esperavamos uma exceção");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
	}
	

}
