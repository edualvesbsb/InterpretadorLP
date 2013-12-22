package unb.cic.lp;

import java.util.List;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoBinaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorBooleano;

public class ExpressaoE extends ExpressaoBinaria {

	public ExpressaoE(Expressao exp1, Expressao exp2) {
		super(exp1, exp2);
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException {		
		ValorBooleano v1 = (ValorBooleano)exp1.avaliar(env, listaFuncoes);
		ValorBooleano v2 = (ValorBooleano)exp2.avaliar(env, listaFuncoes);

		return new ValorBooleano(v1.getValor() && v2.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(exp1.recuperaTipo().equals(TipoExpressao.BOOLEANO) && exp2.recuperaTipo().equals(TipoExpressao.BOOLEANO)) {
			return TipoExpressao.BOOLEANO;
		}
		return TipoExpressao.INVALIDO;
	}

	
}
