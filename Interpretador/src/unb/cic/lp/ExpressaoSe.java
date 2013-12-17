package unb.cic.lp;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoTernaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorBooleano;

/**
 * Classe que representa uma expressao do tipo Se. 
 * Uma expressao do tipo Se tem tres subexpressoes, 
 * @author rodrigobonifacio
 */
public class ExpressaoSe extends ExpressaoTernaria {
	
	public ExpressaoSe(Expressao exp1, Expressao exp2, Expressao exp3){
		super(exp1, exp2, exp3);
	}
	
	@Override
	protected Valor avaliarExpressao() throws ErroDeTipoException {
		ValorBooleano v1 = (ValorBooleano) exp1.avaliar();
		if (v1.getValor()){
			return exp2.avaliar();
		}else{
			return exp3.avaliar();
		}
	}

	@Override
	public Boolean checaTipo() {
		return !recuperaTipo().equals(TipoExpressao.INVALIDO) && exp1.recuperaTipo().equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(exp2.recuperaTipo().equals(exp3.recuperaTipo())) {
			return exp2.recuperaTipo();
		}
		else {
			return TipoExpressao.INVALIDO;
		}
	}

}
