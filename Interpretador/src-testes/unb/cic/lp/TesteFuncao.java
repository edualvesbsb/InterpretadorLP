package unb.cic.lp;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorInteiro;

public class TesteFuncao extends TestCase {

	public void testFuncao() {
		List<Argumento> argumentos = new ArrayList<Argumento>();
		argumentos.add(new Argumento("x", TipoExpressao.INTEIRO));
		List<Valor> valores = new ArrayList<Valor>();
		valores.add(new ValorInteiro(5));
		
		ExpressaoDeclaraFuncao inc = new ExpressaoDeclaraFuncao(
											"inc", 
											new ExpressaoSoma(new ExpressaoRefId("x"), new ValorInteiro(1)),
											argumentos,
											new ExpressaoAplicaFuncao("inc", valores));
		
		try {
			ValorInteiro resultado = (ValorInteiro) inc.avaliar(new Ambiente(), new ArrayList<DeclaracaoFuncao>());
			assertEquals(new Integer(6), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
}
