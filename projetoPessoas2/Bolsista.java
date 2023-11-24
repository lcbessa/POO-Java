package projetoPessoas2;

public class Bolsista extends Aluno {
    private float bolsa;

    // Métodos públicos
    public void RenovarBolsa() {

    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }

    @Override
    public String toString() {
        return super.toString() + "," + " bolsa='" + getBolsa() + "'";
    }

    // Métodos especiais
    public Bolsista() {
    }

    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
