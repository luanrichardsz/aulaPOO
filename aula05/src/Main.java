public class Main {
    public static void main(String [] args){
        Pessoa professor = new Pessoa();
        Pessoa aluno = new Pessoa();

        professor.nome = "Leo Dev";
        professor.idade = 30;
        professor.sexo = 'M';

        professor.salario = professor.calcularSalario(1200.00);
        professor.endereco = "Lagoa do Carro, N 95";

        System.out.println("Informações do Professor: \n" +
                           "\nNome: " + professor.nome +
                           "\nIdade: " + professor.idade +
                           "\nSexo: " + professor.sexo +
                           "\nSalario: " + professor.salario);
                           Pessoa.imprimirEndereco();

        aluno.atribuirNome("Emmanuel Pega no Maranhão");
        aluno.idade = 18;
        aluno.sexo = 'F';
        Pessoa.endereco = "Rua Sentado do Maranhão";

        System.out.println();

        System.out.println("Informações do Aluno: \n" +
                           "\nNome: " + aluno.nome +
                           "\nIdade: " + aluno.idade +
                           "\nSexo: " + aluno.sexo);
                           Pessoa.imprimirEndereco();
    }


}
