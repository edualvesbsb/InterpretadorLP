package unb.cic.lp;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;

public class ExpressaoRefId extends Expressao {
	
	private String id;
	
	public ExpressaoRefId(String id) {
		this.id = id;
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env) throws ErroDeTipoException {
		Expressao expressao = env.obterExpressao(id);		
		return expressao.avaliar(env);
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		//FIXME: Corrigir
//		if(env.obterExpressao(id).recuperaTipo().equals(TipoExpressao.INTEIRO)) {
//			return TipoExpressao.INTEIRO;
//		}
		return TipoExpressao.INTEIRO;
//		return TipoExpressao.INVALIDO;
	}

}
