package unb.cic.lp;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoBinaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;

public class ExpressaoLet extends ExpressaoBinaria{
	private String id;
	
	public ExpressaoLet(String id, Expressao exp1, Expressao exp2){
		super(exp1, exp2);
		this.id = id;
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env) throws ErroDeTipoException {
		env.adicionarPar(this.id, this.exp1);
		return exp2.avaliar(env);
	}

	//FIXME: Let deverá suportar operações booleanas e inteiras
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
