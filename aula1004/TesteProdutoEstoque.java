
package aula1004;

public class TesteProdutoEstoque {
    
    public static void main(String[] args) {
        
        ProdutoEstoque pe = new ProdutoEstoque();
        
        pe.setNome("Sopinha de batata");
        pe.adicionarEstoque(10);
        System.out.println(pe.getEstoque());
        pe.retirarEstoque(8);
    }  
}
