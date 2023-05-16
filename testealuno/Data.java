
package testealuno;

   
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    private static final int[] diasPorMes = 
    {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Data(int dia, int mes, int ano){
    if(mes<=0 || mes>12){
        throw new IllegalArgumentException("Mes ("+mes+") deve estar entre 1 e 12");
    }    
    
    if(dia <=0 || dia >diasPorMes[mes]){
        throw new IllegalArgumentException("Dia ("+dia+") invalido para este mes");
    }
    
    if(mes ==2 && dia==29 && !((ano%400 == 0) || (ano%4 == 0 && ano%100 != 0))){
        throw new IllegalArgumentException("Dia("+dia+") invalido para o mes");
    }
    
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    }
    
    
    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
