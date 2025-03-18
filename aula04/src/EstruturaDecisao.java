import java.util.Scanner;

public class EstruturaDecisao {
    public static void main(String [] args){
        double salario,salarioFinal, totalVendas, bonus;
        boolean metaBatida = false;
        String cargo;
        Scanner sc = new Scanner(System.in);

        bonus = 150.00;

        System.out.println("Digite o cargo do funcionario: ".toLowerCase());
        cargo = sc.nextLine();

        System.out.println("Digite o total de vendas do funcionario: ");
        totalVendas = sc.nextInt();

        if (cargo.equals("operario")) {
            salario = 1500.00;
        } else {
            salario = 1800.00;
        }

        if(totalVendas >= 150){
            salarioFinal = salario + bonus;
            System.out.println(salarioFinal);
        } else {
            salarioFinal = salario;
            System.out.println(salarioFinal);
        }
    }
}
