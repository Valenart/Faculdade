
package matriz;

import java.util.Scanner;
public class Matriz {

        public static void imprimeMatriz(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("\t %f", mat[i][j]);
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] matrix = new double[3][6];
        Scanner sc = new Scanner(System.in);
        
        for (int nlinha = 0; nlinha < 3; nlinha++) {
            for (int ncoluna = 0; ncoluna < 6; ncoluna++) {
                System.out.println("Digite um valor real para salvar na posicao [" + nlinha 
                                  + "][" + ncoluna + "]: ");
                matrix[nlinha][ncoluna] = sc.nextDouble();
            }
        }
        
        
        imprimeMatriz(matrix);
        
    }
}
