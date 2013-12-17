package unb.cic.lp.valor;

public abstract class ValorGenerico<T> extends Valor {

	private T valor;
	
	public ValorGenerico(T valor) {
		this.valor = valor;
	}

	public T getValor() {
		return this.valor;
	}
	
	@Override
	public Boolean checaTipo() {
		return true;
	}
	
}
