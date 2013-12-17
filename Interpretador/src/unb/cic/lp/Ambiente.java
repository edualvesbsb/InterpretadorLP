package unb.cic.lp;

import java.util.HashMap;

import unb.cic.lp.expressao.Expressao;

public class Ambiente {
	private HashMap<String, Expressao> mapa;
	
	public Ambiente() {
		mapa = new HashMap<String, Expressao>();
	}
	
	public void adicionarPar(String id, Expressao exp) {
		mapa.put(id, exp);
	}
	
	public Expressao obterExpressao(String id) {
		return mapa.get(id);
	}
}
