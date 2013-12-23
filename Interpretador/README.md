Implementação de um interpretador em Java
=======

Implementação de um interpretador para uma linguagem de programação funcional utilizando Java

Alunos: 
Vinicius Emiliano dos Santos 09/0135008
Tiago Lage Payne de Pádua 12/1042457
Eduardo Alves Silva 09/0042760
Victor Matheus da Silva Oliveira 09/0134842

Funções implementadas:
- ExpressaoAplicaFuncao
- ExpressaoDeclaraFuncao
- ExpressaoE
- ExpressaoLet
- ExpressaoMaiorQue
- ExpressaoNegacao
- ExpressaoRefId
- ExpressaoSe
- ExpressaoSoma
- ExpressaoSubtracao

As seguintes classes auxiliares foram criada para possibilitar a utilização de funções na linguagem:
- Argumento
- DeclaracaoFuncao

A função "avaliar" foi reimplementada na superclasse Expressao de modo a sempre executar a
checagem de tipos quando uma expressão é avaliada (reduzida a repetição de código);

A função "avaliar" passou a receber além do ambiente, a lista "List<DeclaracaoFuncao> listaFuncoes" 
onde são declaradas as funções da linguagem;

Quando as funções são avaliadas elas checam a quantidade e o tipo dos argumentos que foram passados;

As seguintes classes de teste foram criadas:
- TesteAmbiente
- TesteExpressaoE
- TesteExpressaoLet
- TesteExpressaoMaiorQue
- TesteExpressaoNegacao
- TesteExpressaoSe
- TesteExpressaoSoma
- TesteExpressaoSubtracao
- TesteFuncao