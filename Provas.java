
package provas;

import java.util.Scanner;
        
public class Provas {


    public static void main(String[] args) {
        
    Scanner teclado= new Scanner(System.in); 
        
        double A1= 0;
        double A2= 0;
        double A3= 0;
        double resultadofinal= 0;
           
        
            System.out.println("Qual a nota da A1? ");
            A1 = teclado.nextDouble ();
            
            System.out.println("Qual a nota da A2? ");
            A2 = teclado.nextDouble ();
            
            System.out.println("Qual a nota da A3? ");
            A3 = teclado.nextDouble ();
            
            resultadofinal= 0.3*A1+0.3*A2+0.4*A3;   
            System.out.println("Sua nota final é: " + resultadofinal );
    }
    
}
