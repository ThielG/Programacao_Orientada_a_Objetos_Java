
package aula0304;

public class TesteAgencia {
    
    public static void main(String[] args) {
       
        Agencia a1 = new Agencia(); 
        a1.numero = 1111;
    
        Agencia a2 = new Agencia(); 
        a2.numero = 2222;
        
        a1.imprimir();
        a2.imprimir();
        
    }
    
}
