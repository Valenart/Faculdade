package pooanimais;

public class Gato extends Animal{
    
    private String pelagem;
    private String cor;

    public String getPelagem() {
        return this.pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override //sobreescrita do método barulho
    public String barulho() {
        return "Miau";
    }  
}
