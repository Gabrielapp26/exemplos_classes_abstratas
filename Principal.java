public class Principal {
    public static void main(String[] args){

        Papagaio p = new Papagaio();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        p.setNome("Loro José");

        System.out.print("Papagio: ");
        System.out.println(p.getNome());
        System.out.println(p.voar());
        System.out.println(p.falar());
        System.out.println(" ");


        c.setNome("Bob");
        c.setTamanho("pequeno porte");
        c.setRaça("Shih Tzu");

        System.out.print("Cachorro(a): ");
        System.out.println(c.getNome());
        System.out.println("Raça: "+c.getRaça());
        System.out.println("Tamanho: "+c.getTamanho());
        System.out.println("Som emitido: "+c.emitirSom());
        System.out.println(c.amamentar());
        System.out.println(" ");


        g.setNome("May");
        g.setRaça("Gato Comum Europeu");

        System.out.print("Gato(a): ");
        System.out.println(g.getNome());
        System.out.println("Raça: "+g.getRaça());
        System.out.println("Som emitido: "+g.emitirSom());
        System.out.println(g.amamentar());
    }
}
