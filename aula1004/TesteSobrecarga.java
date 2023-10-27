
package aula1004;

public class TesteSobrecarga {
    
    public static void main(String[] args) {
        
        Sobrecarga sc = new Sobrecarga();
        System.out.println(sc.soma(10, 20));
        
        System.out.println(sc.concatenar("Guilherme", "Santos", "Thiel"));
        System.out.println(sc.concatenar("Guilherme", "Santos"));
        
    }
    
}
