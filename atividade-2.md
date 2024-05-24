Exemplos de Trade-off:
1 - Em um sistema legado, há um patters problemático, o sistema contem uma tabela que relaciona tres campos, sendo um referente a uma referência textual e outro armazena
textos longos, este campo de textos longos está apresentando problemas pois o mesmo armazena código PHP que é executado para validar um valor que sera inserido no terceiro
campo relacionado na tabela.
Isso apresenta vários problemas, são os mais críticos:
  -> Dificuldade de escalabilidade, uma vês que toda validação nova deve possuir uma nova lógica ou replicar o exato código
  -> Não é possível implementar testes unitários quando se utiliza essa abordagem, e se dificulta a implementação de teste de integração
  -> Há a ocupação não nescessária de boa parte do banco de dados, atualmente está tabela é a mais pesada do sistema
  -> Além dos pontos mencionados há vários problemas relacionados a arquitetura.

Para soluicionar o problema podemos considerar o seguintes opções:
  -> Manter o sistema da forma que está:
    -> Pontos negativos:
      -> Todos os problemas se mantem
      -> Se cria uma dependência relacionada aos desenvolvedores com mais tempo de casa, como também se torna mais dificil treinar novos desenvolvedores
      -> Custo financeiro mais elevado
    -> Pontos positivos:
      -> Não será preciso dedicar esforços para mudar o sistema
      -> As pessoas que já dominam o patters atual
    -> Criar um objeto e implementar um patters proximo ao prototype:
      -> Pontos positivos:
        -> Melhoria da escalabilidade do sistema
        -> Redução do uso do recurso Banco de dados
        -> Código mais legivel
        -> O sistema fica mais proximo ao que se entende como boas praticas

2 - JQuery x AXIOS: Em um sistema foram levantadas duas possiblidades para se usar na integração entre fornt-end e backend são essas:
    ->JQuery:
      -> Pontos positivos:
        -> O JQuery já usado no sistema.
        -> Boa parte da equipe já domina a stack
      -> Pontos negativos:
        -> O JQuery não é uma biblioteca muito atual
        -> Dificuldade em encontrar desenvolvedores interessados
        -> Documentação ruim da biblioteca
    -> AXIOS:
      -> Pontos positivos:
        -> Organização do retorno da requisição
        -> Recursos a mais na requisição( interceptar a requisição)
        -> Documentação
        -> Depende apenas do JavaScript
        -> Mais desenvolvedores conhecem
      -> Pontos negativos:
        -> Adicionar uma nova biblioteca no sistema
  -> Foi considerado o JQuery uma melhor opção pois apesar do AXIOS ter mais pontos positivos, o esforço dedicado a implementar uma nova biblioteca não será um grande
impacto em entregas

3- ArchLinux x Ubuntu: Escolha para o sistema operacional de um PC:
  ->ArchLinux:
    ->Pontos positivos:
      -> Atualização constante(roleplay)
      -> Desempenho grande
      -> Maior possibilidade de customização
    -> Pontos negativos:
      -> Atualização constante(roleplay)
      -> Maior numero de configurações

  -> Ubuntu: 
    -> Pontos positivos:
      -> Segurança e estabilidade no usu
      -> Interface e Drives já pré-configurados
      -> Instalação simples

    ->Pontos Negativos:
      -> Sistema não totalmente flexivel
      -> Dependencia da comunidade