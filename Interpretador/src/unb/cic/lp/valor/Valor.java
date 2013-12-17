package unb.cic.lp.valor;

import unb.cic.lp.ErroDeTipoException;
import unb.cic.lp.expressao.Expressao;


public abstract class Valor extends Expressao {
	
	@Override
	protected Valor avaliarExpressao() throws ErroDeTipoException {
		return this;
	}
}
