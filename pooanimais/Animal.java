package pooanimais;

public class Animal {
    
    private String Nome;
    private int idade;
    private double peso;

    public Animal() {}

    public String getNome() { return this.Nome; }

    public void setNome(String Nome) { this.Nome = Nome; }

    public int getIdade() { return this.idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public double getPeso() { return this.peso; }

    public void setPeso(double peso) { this.peso = peso; }

    public String barulho(){ return "";};
    
    
       
}
