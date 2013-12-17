package unb.cic.lp;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoUnaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorInteiro;

public class ExpressaoNegacao extends ExpressaoUnaria{
	
	public ExpressaoNegacao(Expressao exp1){
		super(exp1);
	}
	
	public Valor avaliar() throws ErroDeTipoException {
		if(!checaTipo()) {
			throw new ErroDeTipoException();
		}
		
		ValorInteiro v1 = (ValorInteiro)exp1.avaliar();
		
		return new ValorInteiro(- v1.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(exp1.recuperaTipo().equals(TipoExpressao.INTEIRO)) {
			return TipoExpressao.INTEIRO;
		}
		return TipoExpressao.INVALIDO;
	}

}
