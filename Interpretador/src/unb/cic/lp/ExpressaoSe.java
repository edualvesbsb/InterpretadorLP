package unb.cic.lp;

/**
 * Classe que representa uma expressao do tipo Se. 
 * Uma expressao do tipo Se tem tres subexpressoes, 
 * @author rodrigobonifacio
 */
public class ExpressaoSe extends Expressao {
	
	private Expressao condicao;
	private Expressao entao;
	private Expressao senao;
	
	@Override
	public Valor avaliar() throws ErroDeTipoException {
		if (!checaTipo()){
			throw new ErroDeTipoException();
		}
		ValorBooleano v1 = (ValorBooleano) condicao.avaliar();
		if (v1.getValor()){
			return entao.avaliar();
		}else{
			return senao.avaliar();
		}
	}

	@Override
	public Boolean checaTipo() {
		return !recuperaTipo().equals(TipoExpressao.INVALIDO) && condicao.recuperaTipo().equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(entao.recuperaTipo().equals(senao.recuperaTipo())) {
			return entao.recuperaTipo();
		}
		else {
			return TipoExpressao.INVALIDO;
		}
	}

}
