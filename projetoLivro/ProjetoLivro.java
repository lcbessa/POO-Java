public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, 'M');
        p[1] = new Pessoa("Maria", 25, 'F');

        l[0] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178, p[0]);
        l[1] = new Livro("1984", "George Orwell", 328, p[1]);
        l[2] = new Livro("A Menina que Roubava Livros", "Markus Zusak", 480, p[0]);

        l[0].abrir();
        l[0].folhear(1178);
        System.out.println(l[0].detalhes());
        
        l[0].avancarPag();

        System.out.println(l[0].detalhes());
    }
}
