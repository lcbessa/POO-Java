package projetoPessoas;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    // Métodos públicos
    public void receberAumento(float aumento) {
        this.setSalario(getSalario() + aumento);
    }

    // Métodos especiais
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
