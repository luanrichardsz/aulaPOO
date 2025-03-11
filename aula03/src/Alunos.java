import java.util.Scanner;

public class Alunos {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String nome, curso, cpf, sexo;
        int idade, matricula;
        double media_final;


        System.out.println("Cadastro de Alunos - Coloque os dados do aluno \n");

        System.out.print("Digite o nome: ");
        nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o sexo: ");
        sexo = sc.nextLine();

        System.out.print("Digite o CPF: ");
        cpf = sc.nextLine();

        System.out.print("Digite o curso: ");
        curso = sc.nextLine();

        System.out.print("Digite a matricula: ");
        matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a media final: ");
        media_final = sc.nextDouble();

        sc.close();

        System.out.println("\nInformações do Aluno: ");
        System.out.println("Nome Completo: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso matriculado: " + curso);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("A media final ficou: " + media_final);
    }
}
