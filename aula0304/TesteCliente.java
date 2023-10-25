
package aula0304;

public class TesteCliente {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(); 
        c1.nome = "Jojo Todinho";
        c1.codigo = 1111;
        
        Cliente c2 = new Cliente();
        c2.nome = "Valeska Popozuda";
        c2.codigo = 2222;
        
        System.out.println("Nome c1: " + c1.nome + ", código c1: " + c1.codigo + ".");
        System.out.println("Nome c2: " + c2.nome + ", código c2: " + c2.codigo + ".");
        
    }
    
}
