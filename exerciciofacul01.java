import java.security.SecureRandom;

class Main {

  public static int rolaOsDados(){
  SecureRandom  numeroAleatorio = new SecureRandom();
  int dado1 = 1 + numeroAleatorio.nextInt(6);
  int dado2 = 1 + numeroAleatorio.nextInt(6);
  int soma = dado1 + dado2;
  System.out.println("O jogador rolou " + dado1
                    + " e " + dado2 + " a soma dos dois é " + 
                    + soma);
    return soma;
  }

  public static void main(String[] args) {
    int retorno = rolaOsDados();

    if (retorno == 7 || retorno == 11) {
    System.out.println("O jogador venceu! ");  
    } else if (retorno == 2 || retorno == 3 || retorno ==12) {
    System.out.println("O jogador perdeu! ");
    } else {
      int pontuacao = retorno;
      boolean controle = true;
      while (controle == true) {
        retorno = rolaOsDados();
        if (retorno == pontuacao) {
          System.out.println("O jogador venceu!");
          controle = false;
        }
        
        if (retorno == 7) {
          System.out.println("O jogador perdeu!");
          controle = false;
        }  
      }
    } 
  }
}
