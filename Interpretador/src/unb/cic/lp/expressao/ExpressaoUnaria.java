package unb.cic.lp.expressao;


public abstract class ExpressaoUnaria extends Expressao {
	protected Expressao exp1;
	
	public ExpressaoUnaria(Expressao exp1){
		this.exp1 = exp1;
	}
}
