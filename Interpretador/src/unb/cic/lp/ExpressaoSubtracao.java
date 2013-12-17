package unb.cic.lp;

public class ExpressaoSubtracao extends ExpBin {

	public ExpressaoSubtracao(Expressao lhs, Expressao rhs) {
		super(lhs, rhs);
	}

	@Override
	public Valor avaliar() throws ErroDeTipo {
		if(!checaTipo()) {
			throw new ErroDeTipo();
		}
		
		ValorInteiro v1 = (ValorInteiro)lhs.avaliar();
		ValorInteiro v2 = (ValorInteiro)rhs.avaliar();
		
		return new ValorInteiro(v1.getValor() - v2.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(lhs.recuperaTipo().equals(TipoExpressao.INTEIRO) && rhs.recuperaTipo().equals(TipoExpressao.INTEIRO)) {
			return TipoExpressao.INTEIRO;
		}
		return TipoExpressao.INVALIDO;
	}
	
	

}
