package unb.cic.lp;

public class ExpressaoNegacao extends Expressao{
	private Expressao expressao;
	
	public ExpressaoNegacao(Expressao valor){
		expressao = valor;
	}
	
	public Valor avaliar() throws ErroDeTipo {
		if(!checaTipo()) {
			throw new ErroDeTipo();
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
