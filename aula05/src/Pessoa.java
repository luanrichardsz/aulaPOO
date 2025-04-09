public class Pessoa {
    public String nome;
    public int idade;
    public char sexo;
    public double salario;
    public static String endereco;
    public final double imposto_renda = 2.5;

    public void atribuirNome(String nome){
        this.nome = nome;
    }

    public static void imprimirEndereco(){
        System.out.println("Endereço: " + endereco);
    }

    public double calcularSalario(double salario){
       this.salario = salario - (salario * imposto_renda);
       return salario;

    }
}


