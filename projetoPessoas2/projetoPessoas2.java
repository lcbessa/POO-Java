package projetoPessoas2;

public class projetoPessoas2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setNome("Maria");

        a1.setCurso("Informática");

        a1.setIdade(16);

        a1.setSexo('F');

        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();

        b1.setMatricula(1112);

        b1.setNome("Jubileu");

        b1.setBolsa(12.5f);

        b1.setIdade(25);

        b1.setSexo('M');

        System.out.println(b1.toString());

    }
}
