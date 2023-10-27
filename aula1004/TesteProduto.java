
package aula1004;

public class TesteProduto {
    
    public static void main(String[] args) {
        
        Produto p = new Produto();
        
        p.valoresIniciais(9.0, "Produto X", "Marca Y");
        p.imprimir();
        p.aumentarPreco(10);
        p.setDescricao("Nome produto alterado");
        p.setMarca("Nova marca");
        p.imprimir();
        if(p.isVendido()){
            
        }
                
    }
    
}
