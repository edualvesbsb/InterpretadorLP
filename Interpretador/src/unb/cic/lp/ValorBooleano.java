package unb.cic.lp;

public class ValorBooleano extends ValorGenerico<Boolean> {

	public ValorBooleano(Boolean valor) {
		super(valor);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		return TipoExpressao.BOOLEANO;
	}

}
