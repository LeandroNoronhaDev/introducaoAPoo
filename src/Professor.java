public class Professor {

    private int codigo;
    private String nome;
    private String disciplina;

    public Professor(int codigo, String nome, String disciplina){
        this.codigo = codigo;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " +disciplina);
        System.out.println("---------------------");
    }
}
