package conexao;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Cliente {
    static Conexao c;
    static Socket socket;
    
    public Cliente(){
        try {
            socket = new Socket("localHost", 9600);
        } catch (IOException e){
            System.out.println("Nao consegui resolver o Host");
        }
    }
    
    public static void main(String[] args) {
        new Cliente();
        float op1, op2;
        char oper;
        
        Scanner in = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("*** CALCULADORA DISTRIBUIDA ***");
        System.out.println("*******************************");
        System.out.println("Digite o primeiro numero");
        op1 = in.nextFloat();
        System.out.println("Digite o segundo numero");
        op2 = in.nextFloat();
        System.out.println("Escolha uma operacao");
        System.out.println("(+)SOMA (-)SUBTRACAO (X)MULTIPLICACAO (/)DIVISAO");
        oper = in.next().charAt(0);
        Requisicao msgReq = new Requisicao(op1,op2,oper);
        c.send(socket, msgReq);
        Resposta msgRep = (Resposta) c.receive(socket);
        if (msgRep.getStatus() == 0) {
            System.out.println("Resultado = " + msgRep.getResult());
        } else if (msgRep.getStatus() == 1) {
            System.out.println("Operacao nao implementada");
        } else {
            System.out.println("Divisao por Zero");
        }    
        
        try {
            socket.close();
        } catch (Exception e){
            System.out.println("Problemas ao fechar Socket");
        }
    }
}
