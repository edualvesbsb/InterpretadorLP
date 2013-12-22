package unb.cic.lp;

import java.util.List;

import unb.cic.lp.expressao.Expressao;

public class DeclaracaoFuncao {
	private String id;
	private List<Argumento> argumentosFormais;
	private Expressao expressao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Argumento> getArgumentosFormais() {
		return argumentosFormais;
	}

	public void setArgumentosFormais(List<Argumento> argumentosFormais) {
		this.argumentosFormais = argumentosFormais;
	}

	public Expressao getExpressao() {
		return expressao;
	}

	public void setExpressao(Expressao expressao) {
		this.expressao = expressao;
	}
}
