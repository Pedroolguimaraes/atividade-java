public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos", 20, "2023001", "Engenharia");
        Professor professor = new Professor("Mariana", 35, 4500.00, "Matemática");

        System.out.println("--- Dados do Aluno ---");
        aluno.exibirInfo();

        System.out.println("\n--- Dados do Professor ---");
        professor.exibirInfo();
    }
}
