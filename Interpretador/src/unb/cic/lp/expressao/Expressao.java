package unb.cic.lp.expressao;

import java.util.List;

import unb.cic.lp.Ambiente;
import unb.cic.lp.DeclaracaoFuncao;
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
	
	public Valor avaliar(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException{
		if(!checaTipo()) {
			throw new ErroDeTipoException();
		}
		return avaliarExpressao(env, listaFuncoes);
	}
	
	protected abstract Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException;
	public abstract Boolean checaTipo();
	public abstract TipoExpressao recuperaTipo();
	
}
