package unb.cic.lp.expressao;


public abstract class ExpressaoBinaria extends ExpressaoUnaria {
	protected Expressao exp2;
	
	public ExpressaoBinaria(Expressao exp1, Expressao exp2){
		super(exp1);
		this.exp2 = exp2;
	}
}
