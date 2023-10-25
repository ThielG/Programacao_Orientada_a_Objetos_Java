
package aula0304;

public class Teste_aeronave {
    
    public static void main(String[] args) {
        
        Aeronave azul = new Aeronave();
        azul.totalAssentos = 10;
        azul.reservarAssentos(6);
        azul.reservarAssentos(2);
        azul.reservarAssentos(2);
        azul.reservarAssentos(4);
        
    }
    
}
