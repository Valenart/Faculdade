
package poo;

public class NotasPOO {
  private double[] avaliacoes = new double [3];
  
  public NotasPOO() {};
  
     public NotasPOO(double[] lstnotas) {
      if (lstnotas.length == 3) {
        avaliacoes[0] = lstnotas[0];
        avaliacoes[1] = lstnotas[1];
        avaliacoes[2] = lstnotas[2];
      }
    };
    
    public boolean testaNota(double avaliacao) {
        if ((avaliacao < 0) || (avaliacao > 10)) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean lancaA1(double avaliacao) {
        if (testaNota(avaliacao)) {
            avaliacoes[0] = avaliacao;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean lancaAvaliacao(double avaliacao, int atividade) {
        if ((atividade > 0) && (atividade <= 3)) {
            if (testaNota(avaliacao)) {
                avaliacoes[atividade-1] = avaliacao;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public double calcMedia () {
        return (avaliacoes[0]*0.3 + avaliacoes[1]*0.3 + avaliacoes[2]*0.4);
    }

    public void relatorio() {
      System.out.println("A nota A1 = " + avaliacoes[0]);
      System.out.println("A nota A2 = " + avaliacoes[1]);
      System.out.println("A nota A3 = " + avaliacoes[2]);
      System.out.println("--------------------------------");
    }

  public double leAvaliacao(int atividade) {
    if ((atividade > 0) && (atividade <=3)) {
      return this.avaliacoes[atividade-1];
    } else {
      return -1;
    }
  }

  public double[] leAvaliacao() {
    return this.avaliacoes;
  }

}





