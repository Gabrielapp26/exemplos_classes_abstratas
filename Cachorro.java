public class Cachorro extends Mamifero {

    @Override
    public String amamentar() {
        // TODO Auto-generated method stub
        return "Faz amamentação";
    }
    
    @Override
    public String emitirSom() {
        // TODO Auto-generated method stub
        return "Latir";
    }

    private String tamanho;
    private String raça;

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
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
