package testealuno;


public class TesteAluno {


    public static void main(String[] args) {
        
        Data nascimento = new Data(28,11,1998);
        Data matricula = new Data(5,1,2040);
    
        Aluno aluno = new Aluno("Andre", "Silva", nascimento, matricula);
        
        System.out.println(aluno.toString());
    }
    
}
