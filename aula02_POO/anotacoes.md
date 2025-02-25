# Introdução a Java

- No processo de compilação, ao invés do programa ser compilado para código de máquina da plataforma que vai ser executado, o programa é compilado para bytecode.

- O bytecode é genérico, isto é, não é específico para nenhum sistema operacional em particular.

- Quando um programa Java é executado, o arquivo bytecode é interpretado pelo interpretador da tecnologia java, que é denominado Java Virtual Machine.

- Existe uma JVM* diferente para cada plataforma onde a tecnologia Java pode ser executada e deverá existir umainstalada no computador no qual será executado um programa Java.

- JVM possibilita uma das características mais impressionantes da linguagem Java, a portabilidade do código.

## Principais Características do Java

- **Orientada a Objetos**: Paradigma atual mais utilizado na construção de softwares. Dentre suas vantagens, podemos citar reaproveitamento de código e aumento da manutenibilidade dos sistemas assim desenvolvidos.

- **Portabilidade**: O Java pode ser executado em qualquer plataforma ou equipamento que possua um interpretador Java e que tenha sido especialmente compilado para o sistema a ser utilizado.

- **Simples e Robusta**: Java representa em muitos aspectos um aperfeiçoamento da linguagem C++. Ela possui certas características que permitem a criação de programas de forma mas rápida, pois tiram do programador a possibilidade de cometer erros que são comuns de ocorrer em C++.

- **Segurança**: Pode ser executado via rede, com restrições de execução, além de proteger o sistema do cliente contra possíveis ataques não intencionais.

- **Gerenciamento Automático de Memória**: Em Java não existe ponteiros, isto é, não é permitido ao programador acessar explicitamente uma posição de memória. Java automaticamente gerencia o processo de alocação e liberação de memória, ficando o programador livre desta atividade **(Garbage Collector)**.

## Funcionamento de um Programa em Java

### Editor

- É a escrita ou desenvolvimento do programa (código-fonte). Se faz necessário um editor de texto
simples como o Bloco de Notas (Windows) ou o Vi (Linux).

- Existem ambientes de desenvolvimento integrado (IDE – Integrated Development Environment)
que fornecem muitas ferramentas de suporte ao processo de desenvolvimento de software em
Java e outras linguagens.
    - NetBeans;
    - Eclipse;
    - JCreator;
    - BlueJ.

### Compilador

- O compilador Java converte o código-fonte Java em "bytecodes", que representam as tarefas a serem realizadas durante a fase de execução. Os bytecode são executados pela Java Virtual Machine (JVM) – uma parte do JDK e a base da plataforma Java.

- A máquina virtual Java (JVM) é um aplicativo de software que simula um computador, mas oculta o sistema operacional e o hardware subjacentes dos programas que interagem com a VM.

### Carregador

- Todo programa deve ser colocado na memória antes de poder executar. O carregador de classe transfere os arquivos .class contendo os bytecode do programa para a memória principal.

- O carregador de classe também carrega qualquer arquivo .class fornecido pelo Java que seu programa utiliza. Os arquivos .class podem ser carregados a partir de um disco em seu sistema ou em uma rede.

### Verificador

- Enquanto as classes são carregadas, o verificador de bytecode examina os códigos para assegurar que eles são válidos e não violam restrições de segurança do Java.

- O Java impõe uma forte segurança para certificar-se de que os programas Java que chegam pela rede não danifiquem os arquivos do sistema.

### Interpretador

- A JVM executa o programa interpretando os bytecodes gerados na fase de compilação. Com isso, sequências de ações especificadas pelo programador são, enfim, executadas.

- Atualmente, as JVM utilizam uma combinação de interpretação e de compilação just-in-time (JIT). Nesse processo, a JVM analisa os bytecodes à medida que eles são interpretados.

- Procurando hot spots (pontos ativos) – partes dos bytecodes que são executadas com frequência. Para essas partes, um compilador JIT, conhecido como compilador Java HotSpot, traduz os bytecodes para a linguagem de máquina.
