
package pooanimais;


public class POOanimais {

    
    public static void main(String[] args) {
     // TODO code application logic here
        
        Animal dog = new Animal();
        dog.setNome("toto");
        dog.setIdade(1);
        dog.setPeso(20);
        
        
        
        Cachorro dog2 = new Cachorro();
        dog2.setNome("toto2");
        dog2.setPeso(10);
        dog2.setIdade(5);
        dog2.setPelagem("grande");
        System.out.println(dog2.barulho());
        System.out.println(dog2.setEspecie("dourado"));
        
        Gato felix = new Gato();
        felix.setCor("preto");
        felix.setPelagem("curta");
        felix.setNome("Felix");
        System.out.println(felix.barulho());
        
        
        Peixe dourado = new Peixe();
        dourado.setNome("Dourado");
        dourado.setEspecie("dourado");
        System.out.println(dourado.barulho());
              
    }
    
}
