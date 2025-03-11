import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, resultado, soma, subtracao, muti, div;
        String mensagem = "O resultado da operação: ";

        System.out.println("Digite dois valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        soma = valor1 + valor2;
        System.out.println(mensagem + soma);
    }
}
