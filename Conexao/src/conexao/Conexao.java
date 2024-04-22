package conexao;
    import java.io.*;
    import java.net.Socket;

public class Conexao {

 
    public static void send(Socket socket, Object object) {
        ObjectOutputStream out;
        
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(object);        
        } catch (IOException e){
            System.out.println("Problema no ObjectOutputStream: " + e);        
        }        
    }
    
    public static Object receive(Socket socket) {
        ObjectInputStream in;
        Object object = null;
        
        try {
            in = new ObjectInputStream(socket.getInputStream());
            object = in.readObject();                
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Problema no InputStream: " + e);
        }
        return object;
    
    }
}
