
package aula0304;

public class TesteCartaoDeCredito {
    
    public static void main(String[] args) {
        
        CartaoDeCredito c1 = new CartaoDeCredito(); 
        c1.numero = 1111;
        c1.dataDeValidade = "01/28";
        
        CartaoDeCredito c2 = new CartaoDeCredito(); 
        c2.numero = 2222;
        c2.dataDeValidade = "02/30";
        
        System.out.println("Número c1: " + c1.numero + ", Data de Validade c1: " + c1.dataDeValidade + ".");
        System.out.println("Número c2: " + c2.numero + ", Data de Validade c2: " + c2.dataDeValidade + ".");
        
    }
    
}
