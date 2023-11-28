package projetoAnimal;

public class projetoAnimal {
    public static void main(String[] args) {
        // Animal a = new Animal(); // Não pode instanciar classe abstrata
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        // Cobra j = new Cobra();
        // Tartaruga t = new Tartaruga();
        // GoldFish g = new GoldFish();
        // Arara e = new Arara();

        System.out.println("MAMÍFERO");
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println();
        System.out.println("REPTIL");

        r.setPeso(30.1f);
        r.alimentar();
        r.locomover();
        r.emitirSom();

        System.out.println();
        System.out.println("PEIXE");

        p.setPeso(3.4f);
        p.alimentar();
        p.locomover();
        p.emitirSom();

        System.out.println();
        System.out.println("AVE");

        a.setPeso(12.8f);
        a.alimentar();
        a.locomover();
        a.emitirSom();

        c.locomover();
        c.usarBolsa();
        k.emitirSom();
    }
}
