
package exresolvido1;

public class Horario {

  private int horas; // 0 - 23
  private int minutos; // 0 - 59
  private int segundos; // 0 - 59

  public void setHorario(int horas, int minutos, int segundos) {
    if (horas < 0 || horas >= 24 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60) {
      throw new IllegalArgumentException("Horas, minutos ou segundos invalidos");
    }
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public String toUniversalString() {
    return String.format("%02d:%02d:%02d", horas, minutos, segundos);

  }

  public String toString() {
    return String.format("%02d:%02d:%02d %s",
        ((horas == 0 || horas == 12) ? 12 : horas % 12), minutos, segundos,
        ((horas < 12) ? "AM" : "PM"));

  }
  // Operador ternário
}
