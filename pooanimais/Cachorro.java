package pooanimais;

public class Cachorro extends Animal{
    
    private String pelagem;
    private String cor;
    private String especie;

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
        return "Auau";
    }
    
    public String getEspecie() {
        return especie;
    }

    public boolean setEspecie(String especie) {
        
        if (especie.contains("viralata") || 
            especie.contains("poodle") ||
            especie.contains("bulldog")) {
                this.especie = especie;
                return true;
        }else {
            return false;
        }
    } 
    
    
}

