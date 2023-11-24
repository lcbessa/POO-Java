package projetoPessoas;

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    // Métodos públicos
    public void fazerAniversario() {
        setIdade(getIdade() + 1);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoa{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", sexo='" + getSexo() + "'" +
                "}";
    }

}
