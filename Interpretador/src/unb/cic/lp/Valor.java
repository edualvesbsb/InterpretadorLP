package unb.cic.lp;


public abstract class Valor extends Expressao {
	
	@Override
	public Valor avaliar() {
		return this;
	}
}
