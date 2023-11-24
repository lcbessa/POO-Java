package projetoPessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    // Métodos públicos
    public void mudarTrabalho() {
        this.setTrabalhando(!getTrabalhando());
    }

    // Métodos especiais
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
