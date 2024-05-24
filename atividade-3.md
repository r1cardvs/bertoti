Arquitetura de camadas:
 - Um sistema de uma padaria, com uma unica máquina rodando a aplicação.
Para esse sistema eu preciso de um custo mais baixo, sem me preocupar com escalabilidade afinal a regra de negócio é inauteravel, também não será preciso de recursos mais complexicos como autenticação de usuário, apenas CRUDs

Pipeline:
  - Sistema que gerencia uma agenda de um consultório
Para esse sistema eu preciso de confiabilidade nas transações, porém nao há nescessidade de se preocupar com infraestrutura ou com grande volume de dados

Micro-kernel:
  - Sistema de estoque.
Sistema que possui um grande nucleo de operações comuns e com pouca demanda de alteração, sistema com baixo custo e dificilmente vai escalar

Served-base:
   - Sistema de Processamento de Imagens para um Website
Para este sistema, a aplicação precisa ser altamente escalável e capaz de lidar com picos de carga, como quando um grande número de usuários faz upload de imagens ao mesmo tempo. A aplicação deve se beneficiar do modelo de pagamento por uso, reduzindo os custos durante períodos de baixa demanda. Além disso, a infraestrutura serverless permite focar no desenvolvimento das funcionalidades específicas de processamento de imagens sem se preocupar com a gestão de servidores. A aplicação também deve integrar-se facilmente com outros serviços cloud, como armazenamento de arquivos e funções computacionais on-demand.

Micro-serviços:
  - Sistemas de gerenciamento mais complexos, com constantes customizações e melhorias.
Para sistemas desse tipo há uma demanda constante por escalabilidade, na mesma medida que há também disponibilidade grande de recursos de infraestrutura, equipe e financeiros.