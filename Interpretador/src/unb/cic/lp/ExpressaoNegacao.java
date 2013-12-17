package unb.cic.lp;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoUnaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorBooleano;

public class ExpressaoNegacao extends ExpressaoUnaria{
	
	public ExpressaoNegacao(Expressao exp1){
		super(exp1);
	}
	
	@Override
	protected Valor avaliarExpressao() throws ErroDeTipoException {
		
		ValorBooleano v1 = (ValorBooleano)exp1.avaliar();
		
		return new ValorBooleano(!v1.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(exp1.recuperaTipo().equals(TipoExpressao.BOOLEANO)) {
			return TipoExpressao.BOOLEANO;
		}
		return TipoExpressao.INVALIDO;
	}

}
