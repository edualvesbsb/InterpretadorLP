package unb.cic.lp.valor;

import unb.cic.lp.expressao.Expressao;


public abstract class Valor extends Expressao {
	
	@Override
	public Valor avaliar() {
		return this;
	}
}
