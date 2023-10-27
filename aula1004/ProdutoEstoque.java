
package aula1004;

public class ProdutoEstoque {
    
    private String nome;
    private int estoque; 
    
    public String getNome(){
        return nome;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void adicionarEstoque(int estoque){
        this.estoque += estoque;
        this.verificarEstoqueMinimo();
    }
    
    public void retirarEstoque(int estoque){
        this.estoque -= estoque;
        this.verificarEstoqueMinimo();
    }
    
    private void verificarEstoqueMinimo(){
        if (this.estoque < 5){
            System.out.println("O estoque está baixo. Nº de itens: " + this.estoque + ".");
        }
    }
}
