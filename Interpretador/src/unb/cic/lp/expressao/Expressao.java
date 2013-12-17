package unb.cic.lp.expressao;

import unb.cic.lp.ErroDeTipoException;
import unb.cic.lp.valor.Valor;

public abstract class Expressao {

	/**
	 * Avalia uma expressao retornando um valor 
	 * abstrato. 
	 * 
	 * @return Valor que corresponde a avaliacao da expressao.
	 * 
	 * @throws ErroDeTipoException Uma excecao de tipos ocorre quando 
	 * os tipos forem inconsistentes. 
	 */
	public abstract Valor avaliar() throws ErroDeTipoException;
	public abstract Boolean checaTipo();
	public abstract TipoExpressao recuperaTipo();
	
}