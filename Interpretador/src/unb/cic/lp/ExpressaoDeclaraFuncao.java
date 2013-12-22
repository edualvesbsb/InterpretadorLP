package unb.cic.lp;

import java.util.List;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoBinaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;

public class ExpressaoDeclaraFuncao extends ExpressaoBinaria{
	private String id;
	private List<Argumento> argumentos;
	
	public ExpressaoDeclaraFuncao(String id, Expressao exp1, List<Argumento> argumentos, Expressao exp2){
		super(exp1, exp2);
		this.id = id;
		this.argumentos = argumentos;
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException {
		DeclaracaoFuncao df = new DeclaracaoFuncao();
		df.setArgumentosFormais(argumentos);
		df.setExpressao(this.exp1);
		df.setId(this.id);
		listaFuncoes.add(df);
		return exp2.avaliar(env, listaFuncoes);
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if(exp1.recuperaTipo().equals(TipoExpressao.INTEIRO) && exp2.recuperaTipo().equals(TipoExpressao.INTEIRO)) {
			return TipoExpressao.INTEIRO;
		}
		return TipoExpressao.INVALIDO;
	}

}
