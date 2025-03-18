public class Operadores {
    public static void main(String[] args) {
        double soma, sub, multi, div, resto, media;
        boolean igual, maior, menor, maiorIgual, menorIgual, diferente;
        boolean verdadeiro, falso, negar;
        int valor;
        int alteraValor;
        String situacao;

        soma = 14+24;
        sub = 54-23;
        multi = 15 * 3;
        div = 45 / 5;
        resto = 41 % 2;

        System.out.println("Operadores: " + soma + " - " + sub + " - " + multi + " - " + div + " - " + resto );

        igual = 5 == 5;
        maior = 7 > 3;
        menor = 10 < 15;
        maiorIgual = 15 >= 10;
        menorIgual = 25 <= 30;
        diferente = 25 != 25;

        System.out.println("Operadores: " + igual + " - " + maior + " - " + menor + " - " + maiorIgual + " - " + menorIgual + " - " + diferente);

        // Operadores Logicos

        verdadeiro = maior && menor;
        falso = menorIgual || maiorIgual;
        negar = !igual;

        System.out.println("Operadores Logicos: " + verdadeiro+ " - " + falso + " - " + negar);

        // Operadores de Unários

        valor = 20;

        System.out.println("Operadores Unarios: ");
        System.out.println("Valor Inicial: " + valor);
        System.out.println("Valor Inicial Pre Fixado: " + ++valor);
        System.out.println("Valor Inicial Pos Fixado: " + valor++);
        System.out.println("Valor Final: " + valor);

        // Operadores de Atribuição

        alteraValor = 25;

        System.out.println("Valor Inicial: " + alteraValor);
        System.out.println("Operadores Atribuição: ");
        alteraValor += 1;
        System.out.println(alteraValor);

        // Operadores Ternarios

        System.out.println("Operadores Ternarios: ");
        media = 1.0 + 4.0 + 5.0;

        situacao = media >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println("Sua media: " + media + "! Com essa media você foi: " + situacao);
    }
}
