package aula07;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos públicos
    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    };

    public void status() {
        System.out.print(getNome());
        System.out.print(" é um peso " + getCategoria());
        System.out.print(" com " + getVitorias() + " vitórias, ");
        System.out.print(getDerrotas() + " derrotas, ");
        System.out.println(getEmpates() + " empates.");
    };

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    };

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    };

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    };

    // Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2 || this.getPeso() > 120.2) {
            System.out.println("Inválido!");
        } else if (this.getPeso() <= 70.3) {
            categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
