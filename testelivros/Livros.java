
package testelivros;

public enum Livros {
    ARDB("A revolucao dos bichos","1945"),
    OSA("O senhor dos aneis","1954"),
    DUNA("Duna", "1965"),
    AGDT("A guerra dos Tronos", "1996"),
    CDP("Caixa de Passaros", "2014"),
    IAC("It - A Coisa", "1986");
           
    private final String tituloLivro;
    private final String anoDePublicacao;
    
    Livros(String tituloLivro, String anoDePublicacao){
        this.tituloLivro = tituloLivro;
        this.anoDePublicacao = anoDePublicacao;
        
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }


}
