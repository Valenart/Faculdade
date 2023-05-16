package testealuno;


public class Aluno {
    
    private String nome;
    private String sobrenome;
    private Data dataDeNascimento;
    private Data dataDaMatricula;

    public Aluno(String nomedoaluno, String sobrenome,Data dataDeNascimento, Data dataDeMatricula){
        this.nome = nomedoaluno;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDaMatricula = dataDeMatricula;
          
    }
    
    
    @Override
    public String toString(){
        return String.format("%s,%s,matricula: %s, nascimento: %s",nome,sobrenome,dataDaMatricula,dataDeNascimento);
    }

}
