# Métodos

Métodos são operações que realizam ações e modificam os valores dos atributos dos objeto  responsável pela sua execução

```java
public class Conta {
    private String numero;
    private double saldo;
    
    void creditar(double valor) {
    saldo = saldo + valor;
    }
    ... 
}
```

## Declaração de Métodos

• modificadores podem ser:
    • public, protected, “friendly”, private, static, final
• Assinatura de um método:
    • É o que identifica um método
    • Composta por nome, lista de parâmetros (quantidade, tipo, ordem)

modificadores    tipo de retorno      nome                ( parâmetros )
```java
private              double      obterRendimento    (String numConta, int mes);
```

## Padrão de Nomes de Métodos

• Segue o mesmo padrão para nomes de atributos:
    • Inicia com minúscula e segue a regra da palavra composta

• Normalmente nomes de métodos usam verbos no infinitivo:
        • debitar, creditar, cadastrarFuncionario, etc. 

## Métodos e Tipos de Retorno

• O tipo de retorno de um método pode ser qualquer tipo válido 
em Java: 
    • Tipo Primitivo:
        • int, double, char, long, boolean
    • Tipo Referenciado:
        • Qualquer tipo que não é primitivo
        • Conta, String, Date, Cliente

• Métodos que retornam valores devem fazê-lo com o comando 
return;

• Métodos que não retornam valores possuem o tipo void

```java
public class Conta {
    private String numero;
    private double saldo;

    String getNumero() {
        return numero;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double s){
        saldo = s;
    }

    void debitar(double saldo){
        saldo = saldo - valor;
    }
}
```

## Métodos e Modificadores 

• De acesso:
    • Alteram a visibilidade/acesso ao método
    • public, protected, “friendly”, private 

• De escopo (static):
    • O método passa a ser de toda a classe

• De definição de constantes (final)
    • O método não pode ser sobrescrito

## O Corpo do Método

• O corpo do método contém os comandos que determinam as ações do método

• Esses comandos podem
    • realizar simples atualizações dos atributos de um objeto
    • retornar valores
    • executar ações mais complexas como chamar métodos de outros objetos

## Chamada dos Métodos

• Os objetos se comunicam para realizar tarefas
• Parâmetros são passados por “cópia”
• A comunicação é feita através da chamada de métodos
