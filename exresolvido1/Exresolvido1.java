package exresolvido1;

public class Exresolvido1 {

    public static void main(String[] args) {

        
    Horario relogio = new Horario();

    try {
      relogio.setHorario(99, 99, 99);
    } catch (IllegalArgumentException e) {
      System.out.printf("Exception: %s,%n,%n", e.getMessage());
    }

    relogio.setHorario(21, 03, 47);
    System.out.println(relogio.toUniversalString());
    System.out.println(relogio.toString());
    }
}
