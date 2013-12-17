package unb.cic.lp.valor;

import unb.cic.lp.Ambiente;
import unb.cic.lp.ErroDeTipoException;
import unb.cic.lp.expressao.Expressao;


public abstract class Valor extends Expressao {
	
	@Override
	protected Valor avaliarExpressao(Ambiente env) throws ErroDeTipoException {
		return this;
	}
}
