public class Principal {
    public static void main(String[] args){

        Papagaio p = new Papagaio();

        p.setNome("Loro José");

        System.out.print("Papagio: ");
        System.out.println(p.getNome());
        System.out.println(p.voar());
        System.out.println(p.falar());
    }
}
