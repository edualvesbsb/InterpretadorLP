package unb.cic.lp;

public class ExpressaoAnd extends ExpBin {

	public ExpressaoAnd(Expressao lhs, Expressao rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public Valor avaliar() throws ErroDeTipo {
		if(!checaTipo()) {
			throw new ErroDeTipo();
		}
		ValorBooleano v1 = (ValorBooleano)lhs.avaliar();
		ValorBooleano v2 = (ValorBooleano)rhs.avaliar();

		return new ValorBooleano(v1.getValor() && v2.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(lhs.recuperaTipo().equals(TipoExpressao.BOOLEANO) && rhs.recuperaTipo().equals(TipoExpressao.BOOLEANO)) {
			return TipoExpressao.BOOLEANO;
		}
		return TipoExpressao.INVALIDO;
	}

	
}
