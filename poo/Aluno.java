
package poo;


public class Aluno {

  private String nome;
  private int RA;
  private NotasPOO notas;
  private double media;


  public Aluno (String nome, int RA) {
    this.nome = nome;
    this.RA = RA;   
    this.notas = new NotasPOO();
    this.media = 0;
  }

  public Aluno (String nome, int RA, double[] lstnotas) {
    this.nome = nome;
    this.RA = RA;   
    this.notas = new NotasPOO(lstnotas);
    this.media = notas.calcMedia();
  }
  

  public boolean lancaAvaliacao(double avaliacao, int atividade) {
    return this.notas.lancaAvaliacao(avaliacao, atividade);
  }

  public double calcMedia() {
    this.media = this.notas.calcMedia();
    return this.media;
  }

  public void relatorio() {
    System.out.println("Aluno = " + this.nome);
    System.out.println("RA = " + this.RA);
    System.out.println("A nota A1 = " + this.notas.leAvaliacao(1));
    System.out.println("A nota A2 = " + this.notas.leAvaliacao(2));
    System.out.println("A nota A3 = " + this.notas.leAvaliacao(3));
    System.out.println("A media = " + this.media);
    System.out.println("--------------------------------");
  }


  public void relatorio2() {
    double[] lstnotas = this.notas.leAvaliacao();
    
    System.out.println("Aluno = " + this.nome);
    System.out.println("RA = " + this.RA);
    for (int i = 1; i < 4; i++) {
      System.out.println("A nota A" + i + " = " + lstnotas[i-1]);
    }
    System.out.println("A media = " + this.media);
    System.out.println("--------------------------------");
  }


  
}
