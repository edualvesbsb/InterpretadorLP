package unb.cic.lp;

import junit.framework.TestCase;

public class TesteExpressaoSoma extends TestCase {

	public void testSoma() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorInteiro valor10 = new ValorInteiro(10);
		
		Expressao soma = new ExpressaoSoma(valor5, valor10);
		
		try {
			ValorInteiro resultado = (ValorInteiro)soma.avaliar();
			assertEquals(new Integer(15), resultado.getValor());
		}
		catch(ErroDeTipoException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public void testErroDeTipo() {
		ValorInteiro valor5 = new ValorInteiro(5);
		ValorBooleano valorF = new ValorBooleano(false);
		
		Expressao soma = new ExpressaoSoma(valor5, valorF);
		
		try {
			soma.avaliar();
			System.out.println("chamou avaliar. esperavamos uma exce?�o");
			fail();
		}
		catch(ErroDeTipoException e) {
			assertTrue(true);
		}
//		catch(ErroDeTipo e) {
//			System.out.println("tratando exce?�o!!!!");
//			if(true) {
//				throw new RuntimeException();
//			}
//			else {
//				System.out.println("Nao deve imprimir isso");
//				assertTrue(true);
//			}
//			System.out.println("Nao deve imprimir tambem");
//		}
//		catch(Throwable e) {
//			System.out.println("blah....");
//		}
//		finally {
//			System.out.println("Liberando recursos... conexoes com BD, arquivos, etc.");
//			System.out.println("Ok... terminou o teste");
//			assertTrue(true);
//		}
//		System.out.println("Pelo amor de Deus, nao imprima se nao estarei errado");
		
	}
}
