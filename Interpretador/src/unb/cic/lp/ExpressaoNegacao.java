package unb.cic.lp;

public class ExpressaoNegacao extends Expressao{
	private Expressao expressao;
	
	public ExpressaoNegacao(Expressao expressao){
		this.expressao = expressao;
	}
	
	public Valor avaliar() throws ErroDeTipoException {
		if(!checaTipo()) {
			throw new ErroDeTipoException();
		}
		
		ValorInteiro v1 = (ValorInteiro)expressao.avaliar();
		
		return new ValorInteiro(- v1.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(expressao.recuperaTipo().equals(TipoExpressao.INTEIRO)) {
			return TipoExpressao.INTEIRO;
		}
		return TipoExpressao.INVALIDO;
	}

}
