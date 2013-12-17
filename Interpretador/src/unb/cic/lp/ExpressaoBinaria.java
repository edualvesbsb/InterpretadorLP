package unb.cic.lp;


public abstract class ExpressaoBinaria extends Expressao {
	protected Expressao lhs;
	protected Expressao rhs;
	
	public ExpressaoBinaria(Expressao lhs, Expressao rhs){
		this.lhs = lhs;
		this.rhs = rhs;
	}
}
