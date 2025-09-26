public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrevendo método
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula + ", Curso: " + curso);
    }
}
