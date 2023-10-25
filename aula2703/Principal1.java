
package aula2803;

public class Principal1 {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.id = 1;
        p1.nome = "Sopinha de Abóbora";
        p1.preco = 6.50;
        
        p1.aumentar_preco();
        p1.aplicar_desconto();
        p1.alterar_nome();
        
    }
    
}
