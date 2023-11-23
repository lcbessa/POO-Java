
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos públicos

    public String detalhes() {
        return "Livro{" +
                " \n titulo='" + getTitulo() + "'" +
                ", \n autor='" + getAutor() + "'" +
                ", \n totPaginas='" + getTotPaginas() + "'" +
                ", \n pagAtual='" + getPagAtual() + "'" +
                ", \n aberto='" + getAberto() + "'" +
                ", \n leitor='" + leitor.getNome() + "'" +
                ", \n idade='" + leitor.getIdade() + "'" +
                ", \n sexo='" + leitor.getSexo() + "'" +
                "\n }";
    }

    // Métodos especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotPaginas()) {
            this.pagAtual = 0;
        } else {
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() == getTotPaginas()) {
            this.setPagAtual(1);
        } else {
            this.setPagAtual(getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() == 1) {
            this.setPagAtual(this.getTotPaginas());
        } else {
            this.setPagAtual(getPagAtual() - 1);
        }
    }

}
