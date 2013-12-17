package unb.cic.lp;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoBinaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorInteiro;

public class ExpressaoSoma extends ExpressaoBinaria {
	
	public ExpressaoSoma(Expressao exp1, Expressao exp2){
		super(exp1, exp2);
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env) throws ErroDeTipoException {
		
		ValorInteiro v1 = (ValorInteiro)exp1.avaliar(env);
		ValorInteiro v2 = (ValorInteiro)exp2.avaliar(env);
		
		return new ValorInteiro(v1.getValor() + v2.getValor());
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if (exp1.recuperaTipo().equals(TipoExpressao.INTEIRO) && exp2.recuperaTipo().equals(TipoExpressao.INTEIRO)) {
			return TipoExpressao.INTEIRO;
		}
		return TipoExpressao.INVALIDO;
	}

}
