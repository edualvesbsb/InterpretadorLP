package unb.cic.lp.valor;

import java.util.List;

import unb.cic.lp.Ambiente;
import unb.cic.lp.DeclaracaoFuncao;
import unb.cic.lp.ErroDeTipoException;
import unb.cic.lp.expressao.Expressao;


public abstract class Valor extends Expressao {
	
	@Override
	protected Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException {
		return this;
	}
}
