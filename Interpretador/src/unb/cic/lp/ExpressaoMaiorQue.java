package unb.cic.lp;

import java.util.List;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.ExpressaoBinaria;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;
import unb.cic.lp.valor.ValorBooleano;
import unb.cic.lp.valor.ValorInteiro;

public class ExpressaoMaiorQue extends ExpressaoBinaria {
	
	public ExpressaoMaiorQue(Expressao exp1, Expressao exp2){
		super(exp1, exp2);
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException {
		
		ValorInteiro v1 = (ValorInteiro)exp1.avaliar(env, listaFuncoes);
		ValorInteiro v2 = (ValorInteiro)exp2.avaliar(env, listaFuncoes);
		
		if(v1.getValor() > v2.getValor()){
			return new ValorBooleano(true);
		}else{
			return new ValorBooleano(false);
		}
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.BOOLEANO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		if (exp1.recuperaTipo().equals(TipoExpressao.INTEIRO) && exp2.recuperaTipo().equals(TipoExpressao.INTEIRO)) {
			return TipoExpressao.BOOLEANO;
		}
		return TipoExpressao.INVALIDO;
	}

}
