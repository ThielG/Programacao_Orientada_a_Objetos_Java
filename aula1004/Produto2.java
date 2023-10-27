
package aula1004;

public class Produto2 {
    
    private String nome;
    private String marca;
    private double preco;
    
    public void valoresIniciais(double preco, String nome){
        valoresIniciais(preco, nome , null);
//        this.preco = preco;
//        this.nome = nome;
    }
    
    public void valoresIniciais(double preco, String nome, String marca){
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
    }
    
    public void aumentarPreco(){
        aumentarPreco(8);
    }
    
    public void aumentarPreco(double porcentagem){
        if (preco > 0){
        porcentagem = 1 + (porcentagem / 100);
        this.preco += porcentagem;
    }else{
        System.out.println("Valor invalido.");
        }
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        if(marca != null){
            System.out.println("Marca: " + marca);
        }
        System.out.println("Preço: " + preco);
    }
}
