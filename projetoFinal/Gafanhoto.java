package projetoFinal;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto {" + super.toString() +
                " \n login='" + getLogin() + "'" +
                ", totalAssistido='" + getTotalAssistido() + "'" +
                "}";
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

}
