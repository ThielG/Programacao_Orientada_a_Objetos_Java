
package aula0304;

public class TesteConta {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.numero = 1111;
        c1.saldo = 800.00;
        
        Conta c2 = new Conta();
        c2.numero = 2222;
        c2.saldo = 1600.00;
        
        System.out.println("Conta c1: " + c1.numero + ", limite c1: " + c1.limite + ", saldo c2: " + c1.saldo + ".");
        System.out.println("Conta c2: " + c2.numero + ", limite c2: " + c2.limite + ", saldo c2: " + c2.saldo + ".");
        
    }
    
}
