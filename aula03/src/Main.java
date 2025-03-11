import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Frontend
        String numero1, numero2, resultado;
        numero1 = "10";
        numero2 = "90";

        //Backend
        int valor1, valor2, total;
        final double porcentagem_taxa = 5.65254;

        valor1 = Integer.parseInt(numero1);
        valor2 = Integer.parseInt(numero2);

        total = valor1 + valor2;

        //Frontend
        resultado = String.valueOf(total);

        System.out.println("O primeiro valor: " + numero1);
        System.out.println("O segundo valor: " + numero2);
        System.out.println("O resultado da soma: " + resultado);

        System.out.printf("O valor da porcentagem: %.3f", porcentagem_taxa);
    }
}