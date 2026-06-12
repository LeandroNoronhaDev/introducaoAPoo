import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Escola escola = new Escola(100);

        int opcao;

        do {

            System.out.println("\n=== GERENCIADOR ESCOLAR ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Listar Professor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Matrícula: ");
                    int matricula = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Nota: ");
                    String notaStr = entrada.nextLine();
                    double nota = Double.parseDouble(notaStr.replace(',','.'));

                    Aluno aluno = new Aluno(
                            matricula,
                            nome,
                            nota
                    );

                    escola.cadastrarAluno(aluno);

                    break;

                case 2:
                    escola.listarAlunos();
                    break;

                case 3:
                    System.out.print("Código: ");
                    int codigo = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome: ");
                    String nomeProfessor = entrada.nextLine();

                    System.out.print("Disciplina: ");
                    String disciplina = entrada.nextLine();

                    Professor professor = new Professor(
                            codigo,
                            nomeProfessor,
                            disciplina
                    );

                    escola.cadastrarProfessor(professor);

                    break;

                case 4:
                    escola.listarProfessores();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}