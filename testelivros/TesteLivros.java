
package testelivros;

import java.util.EnumSet;
public class TesteLivros {


    public static void main(String[] args) {
        System.out.println("Todos os livros:");
        for(Livros livros :Livros.values()){
            System.out.printf("%-5s%-5s%-25s%s%n", livros,"-", livros.getTituloLivro(), livros.getAnoDePublicacao());
        }
    }
    
}
