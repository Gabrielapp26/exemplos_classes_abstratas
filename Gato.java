public class Gato extends Mamifero {

    @Override
    public String amamentar() {
        //TODO Auto-generated method stub
        return "Faz amamentação";
    }
    
    @Override
    public String emitirSom() {
        //TODO Auto-generated method stub
        return "Miar";
    }

    private String raça;
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void mensagem(){
        System.out.println("");
    }
}
