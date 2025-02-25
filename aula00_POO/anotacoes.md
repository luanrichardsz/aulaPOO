# Aula de POO

## Lógica de Programação
Conjunto de regras sintáticas e semânticas, utilizados para se estabelecer comunicação entre o programador e o computador. 
São usadas para se escrever programas ou softwares.

## Métodos de Implementação de Linguagens de Programação
É a forma como uma linguagem de programação se comunica (é entendida e executada) com o computador.  
O computador possui uma linguagem de máquina de baixo nível que oferece operações primitivas.  
O software de sistema deve criar uma interface com os programas de nível mais alto.  
O sistema operacional e as implementações de linguagens são dispostos em camadas sobre a interface de linguagem de máquina de um computador.

## Diferentes níveis das Linguagens de Programação
- **Baixo Nível**: São linguagens que estão mais próximas da interpretação da máquina, diante do algoritmo desenvolvido. 
  - Exemplo: Linguagem Assembly e C.
- **Alto Nível**: São linguagens que disponibilizam uma proposta de sintaxe (forma de escrever processos para serem executados pelo computador) mais próxima da interpretação humana.
  - Exemplo: Java, JavaScript, Python e C++.

## POO (Programação Orientada a Objetos)
POO é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

## Como funcionam os pilares da POO?

### Abstração
A abstração foca em representar apenas os detalhes essenciais de um objeto, escondendo aspectos internos desnecessários para o contexto de uso. Isso simplifica a complexidade do sistema e melhora a organização do código.

**Exemplo:**  
Imagine um carro como uma classe em um sistema. Para um motorista, os detalhes relevantes são o volante, os pedais e o painel. O funcionamento interno do motor não precisa ser exposto para quem está dirigindo. Da mesma forma, no código, você pode criar uma classe `Carro` que expõe métodos como `ligar()` e `acelerar()`, sem precisar mostrar toda a lógica interna do motor.

### Encapsulamento
O encapsulamento protege os dados, garantindo que eles só possam ser acessados ou modificados da maneira correta. Ele esconde os detalhes internos de implementação e expõe apenas o necessário para o usuário da classe.

**Exemplo:**  
Em um sistema bancário, os atributos `saldo` e `senha` de uma conta bancária não devem ser acessados diretamente de fora da classe `ContaBancaria`. Para isso, utilizamos modificadores de acesso como `private` e criamos métodos como `getSaldo()` e `sacar(valor)` que controlam o acesso.

### Herança
A herança permite que uma classe reutilize atributos e métodos de outra, evitando a repetição de código e facilitando a manutenção.

**Exemplo:**  
Suponha que temos uma classe `Veiculo` e queremos criar classes mais específicas, como `Carro` e `Moto`. Em vez de duplicar código, podemos fazer `Carro` e `Moto` herdarem de `Veiculo`.

### Polimorfismo
O polimorfismo permite que objetos de diferentes classes sejam tratados de forma genérica, aumentando a flexibilidade do código.

**Exemplo:**  
Imagine que temos uma classe `Animal` com um método `fazerSom()`. Diferentes subclasses (como `Cachorro` e `Gato`) podem sobrescrever esse método para se comportarem de maneira específica.
