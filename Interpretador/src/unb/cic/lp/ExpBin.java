package unb.cic.lp;


public abstract class ExpBin extends Expressao {
	protected Expressao lhs;
	protected Expressao rhs;
	
	public ExpBin(Expressao lhs, Expressao rhs){
		this.lhs = lhs;
		this.rhs = rhs;
	}
}
