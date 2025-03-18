import java.util.Scanner;

/*
    Ler uma temperatura em Celsius e converter em Fahrenheit
    F = (9 * C + 160) / 5
    F representa Fahrenheit
    C representa Celsius
*/
public class LerTemperatura {
    public static void main(String [] args){
        double F, C;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nConverter Grau Celsius em Fahrenheit \n");
        System.out.println("Digite a temperatura em grau Celsius: ");
        C = sc.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.println(C + "°C convertido em fahrenheit é " + F + "°F");
    }
}
