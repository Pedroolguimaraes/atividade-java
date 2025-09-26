public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    // Construtor
    public Professor(String nome, int idade, double salario, String disciplina) {
        super(nome, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    // Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Sobrescrevendo método
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina + ", Salário: R$" + salario);
    }
}
