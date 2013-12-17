package unb.cic.lp.valor;

import unb.cic.lp.expressao.TipoExpressao;

public class ValorInteiro extends ValorGenerico<Integer> {

	public ValorInteiro(Integer valor) {
		super(valor);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		return TipoExpressao.INTEIRO;
	}

}
