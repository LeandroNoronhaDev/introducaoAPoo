public class Escola {

    private Aluno[] alunos;
    private Professor[] professores;

   private int qtdAlunos;
   private int qtdProfessores;

   public Escola(int tamanho){
       alunos = new Aluno[tamanho];
       professores = new Professor[tamanho];

       qtdAlunos = 0;
       qtdProfessores = 0;
   }
   // Metodos dos Alunos
   public void cadastrarAluno(Aluno aluno){
       if (qtdAlunos < alunos.length){
           alunos[qtdAlunos] = aluno;
           qtdAlunos++;
           System.out.println("Aluno cadastrado com sucesso!");
       }else{
           System.out.println("Limite de alunos atingido.");
       }
   }

   public void listarAlunos(){
       if (qtdAlunos == 0){
           System.out.println("Nenhum aluno cadastrado.");
           return;
       }
       System.out.println("\n=== ALUNOS CADASTRADOS ===");

       for (int i = 0; i < qtdAlunos; i++){
           alunos[i].exibirDados();
       }

   }

    // Metodos dos Professores
    public void cadastrarProfessor(Professor professor){
        if (qtdProfessores < professores.length){
            professores[qtdProfessores] = professor;
            qtdProfessores++;
            System.out.println("Professor cadastrado com sucesso!");
        }else{
            System.out.println("Limite de professores atingido.");
        }
    }

    public void listarProfessores(){
        if (qtdProfessores == 0){
            System.out.println("Nenhum professor cadastrado.");
            return;
        }
        System.out.println("\n=== PROFESSORES CADASTRADOS ===");

        for (int i = 0; i < qtdProfessores; i++){
           professores[i].exibirDados();
        }

    }
}