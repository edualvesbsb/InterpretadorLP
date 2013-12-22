package unb.cic.lp;

import unb.cic.lp.expressao.TipoExpressao;

public class Argumento {
	private String id;
	private TipoExpressao tipo;
	
	public Argumento(String id, TipoExpressao tipo){
		this.id = id;
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoExpressao getTipo() {
		return tipo;
	}

	public void setTipo(TipoExpressao tipo) {
		this.tipo = tipo;
	}

}
