# System

## System.out.printf
O método `System.out.printf` é usado para exibir saída formatada no console. Ele funciona de maneira semelhante ao `printf` em C e outras linguagens. O método aceita uma string de formato e argumentos correspondentes aos espaços reservados nessa string.

### Exemplo de Uso
```java
int idade = 18;
double altura = 1.75;
System.out.printf("Idade: %d anos, Altura: %.2f metros\n", idade, altura);
```
### Principais Marcadores de Formatação
| Marcador | Descrição |
|----------|------------|
| %d | Número inteiro decimal |
| %f | Número de ponto flutuante |
| %.xf | Número de ponto flutuante com x casas decimais |
| %s | String |
| %c | Caractere |
| %n | Nova linha (equivalente a `\n`) |

## Caracteres de Escape
Os caracteres de escape são usados para representar caracteres especiais dentro de strings.

### Principais Caracteres de Escape
| Caractere | Descrição |
|-----------|------------|
| `\n` | Nova linha |
| `\t` | Tabulação horizontal |
| `\b` | Backspace |
| `\r` | Retorno de carro |
| `\f` | Avanço de página |
| `\'` | Aspas simples |
| `\"` | Aspas duplas |
| `\\` | Barra invertida |

## Scanner
A classe `Scanner` é utilizada para a leitura de entradas do usuário a partir do console ou de outras fontes de entrada.

### Métodos Principais do Scanner

#### next()
Lê uma única palavra, ou seja, captura os caracteres até encontrar um espaço em branco.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Digite uma palavra: ");
String palavra = scanner.next();
System.out.println("Você digitou: " + palavra);
```

#### nextLine()
Lê uma linha inteira de entrada, incluindo espaços em branco.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Digite uma frase: ");
String frase = scanner.nextLine();
System.out.println("Você digitou: " + frase);
```

#### nextInt(), nextDouble(), nextFloat(), nextBoolean()
São métodos usados para capturar diferentes tipos de dados numéricos e booleanos.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Digite um número inteiro: ");
int numero = scanner.nextInt();
System.out.println("Número digitado: " + numero);
```

#### nextBigDecimal(), nextBigInteger()
São métodos utilizados para capturar valores numéricos de grande precisão.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Digite um número decimal grande: ");
BigDecimal valor = scanner.nextBigDecimal();
System.out.println("Valor digitado: " + valor);
```

### Fechando o Scanner
Após utilizar o `Scanner`, é recomendável fechá-lo para liberar os recursos:
```java
scanner.close();
```

