package unb.cic.lp;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import unb.cic.lp.valor.ValorInteiro;


public class TesteAmbiente extends TestCase {

	public void testAmbiente() {
		Ambiente ambiente = new Ambiente();
		Ambiente ambienteVazio = new Ambiente();
		List<DeclaracaoFuncao> listaFuncoes = new ArrayList<DeclaracaoFuncao>();
		ambiente.adicionarPar("x", new ValorInteiro(5));
		ambiente.adicionarPar("y", new ValorInteiro(10));
		
		try {
			assertEquals(new Integer(5), ((ValorInteiro)ambiente.obterExpressao("x").avaliar(ambienteVazio, listaFuncoes)).getValor());
			assertEquals(new Integer(10), ((ValorInteiro)ambiente.obterExpressao("y").avaliar(ambienteVazio, listaFuncoes)).getValor());
		} catch (ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
		assertNull(ambiente.obterExpressao("z"));
	}
	
}
