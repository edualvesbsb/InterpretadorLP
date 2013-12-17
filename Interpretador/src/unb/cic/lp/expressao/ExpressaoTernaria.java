package unb.cic.lp.expressao;


public abstract class ExpressaoTernaria extends ExpressaoBinaria {
	protected Expressao exp3;
	
	public ExpressaoTernaria(Expressao exp1, Expressao exp2, Expressao exp3){
		super(exp1, exp2);
		this.exp3 = exp3;
	}
}
