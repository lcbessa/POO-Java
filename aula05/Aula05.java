package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1);
        conta1.setDono("Bessa");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");

        conta1.depositar(100);
        conta2.depositar(500);

        conta2.sacar(100);
        conta1.sacar(150);

        conta1.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();

        // contaDoBessa.depositar(1000);
    }
}
