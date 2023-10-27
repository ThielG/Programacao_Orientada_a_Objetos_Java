
package aula1004;

public class Produto {
    
    private String descricao;
    private String marca;
    private double preco;
    private boolean vendido; 
    
    public boolean isVendido(){
        return vendido;
    }
    
    public void setVendido(boolean vendido){
        this.vendido = vendido;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;    
    }
    
    public void setMarca(String marca){
        this.marca = marca;    
    }
    
//    public void setPreco(double preco){
//        this.preco = preco;
//    }
    
    public void alterarPreco(double novoPreco){
        if(novoPreco >= 0){
        this.preco = novoPreco;
        }
    }
    
    public void aumentarPreco(double porcentagem){
        if(porcentagem > 0){
            System.out.println("Aumentando o preço em " + porcentagem + " %.");
            porcentagem = 1 + (porcentagem / 100);
            this.preco *= porcentagem;
            System.out.println("Novo preço = " + this.preco);
        }else{
            System.out.println("Aumento deve ser maior que zero!");
        }
    }
    
    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
    }

    public void valoresIniciais(double umPreco, String umaDescricao, String umaMarca){
        alterarPreco(umPreco);
        setDescricao(umaDescricao);
        setMarca(umaMarca);
    }

}


