package pooanimais;

public class Peixe extends Animal{
    
    private String especie;
    private boolean respagua;

    public String getEspecie() {
        return especie;
    }

    public boolean setEspecie(String especie) {
        
        if (especie.contains("guppy") ||
            especie.contains("dourado") ||
            especie.contains("carpa")) {
                this.especie = especie;
                return true;
        } else {
            return false;
        }
    }

    public boolean isRespagua() {
        return respagua;
    }

    public void setRespagua(boolean respagua) {
        this.respagua = respagua;
    }
    
    @Override //sobreescrita do método barulho
    public String barulho() {
        return "glub";
    }
    
}
