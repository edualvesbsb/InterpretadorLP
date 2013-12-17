package unb.cic.lp.expressao;

public enum TipoExpressao {

	INTEIRO(0,"Inteiro"), 
	BOOLEANO(1, "Booleano"), 
	INVALIDO(2, "Invalido");
	
	private int codigo;
	private String descricao;
	
	TipoExpressao(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
