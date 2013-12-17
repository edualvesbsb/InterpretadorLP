package unb.cic.lp.valor;

import unb.cic.lp.expressao.TipoExpressao;

public class ValorBooleano extends ValorGenerico<Boolean> {

	public ValorBooleano(Boolean valor) {
		super(valor);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		return TipoExpressao.BOOLEANO;
	}

}
