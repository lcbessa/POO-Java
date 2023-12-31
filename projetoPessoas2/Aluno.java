package projetoPessoas2;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    // Métodos públicos
    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada!");
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno" + this.getNome());
    }

    // Métodos especiais
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
