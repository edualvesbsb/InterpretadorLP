package unb.cic.lp;

import java.util.List;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;

public class ExpressaoRefId extends Expressao {
	
	private String id;
	
	public ExpressaoRefId(String id) {
		this.id = id;
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException {
		Expressao expressao = env.obterExpressao(id);		
		return expressao.avaliar(env, listaFuncoes);
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		return TipoExpressao.INTEIRO;
	}

}
