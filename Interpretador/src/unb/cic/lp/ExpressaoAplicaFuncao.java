package unb.cic.lp;

import java.util.List;

import unb.cic.lp.expressao.Expressao;
import unb.cic.lp.expressao.TipoExpressao;
import unb.cic.lp.valor.Valor;

public class ExpressaoAplicaFuncao extends Expressao {
	
	private String id;
	private List<Valor> valores;
	
	public ExpressaoAplicaFuncao(String id, List<Valor> valores) {
		this.id = id;
		this.valores = valores;
	}
	
	@Override
	protected Valor avaliarExpressao(Ambiente env, List<DeclaracaoFuncao> listaFuncoes) throws ErroDeTipoException {
		//Localizando o corpo da função
		for(DeclaracaoFuncao f : listaFuncoes){
			
			//Validando os argumentos formais
			if(id.equals(f.getId())){
				if(valores.size() != f.getArgumentosFormais().size()){
					throw new RuntimeException("Quantidade de argumentos difere da declaração da função.");
				}
				
				for(int i  = 0; i < valores.size(); i++){
					if(valores.get(i).recuperaTipo().getCodigo() != f.getArgumentosFormais().get(i).getTipo().getCodigo()){
						throw new RuntimeException("Tipo dos argumentos difere da declaração da função.");
					}
				}
				
				//Validações ocorreram com sucesso, criando um novo ambiente interno à função
				Expressao expressao = f.getExpressao();
				Ambiente amb = new Ambiente();
				
				for(int i  = 0; i < valores.size(); i++){
					amb.adicionarPar(f.getArgumentosFormais().get(i).getId(), valores.get(i));
				}
				
				return expressao.avaliar(amb, listaFuncoes);
				
			}
		}
		
		throw new RuntimeException("Declaração da função não localizada: " + id);
	}

	@Override
	public Boolean checaTipo() {
		return recuperaTipo().equals(TipoExpressao.INTEIRO);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		return TipoExpressao.INTEIRO;
	}

}
