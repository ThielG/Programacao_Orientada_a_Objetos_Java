
package aula2803;

public class Produto {
    
    public int id;
    public double preco;
    public String nome;
 
public void aumentar_preco(){

    preco = preco + 1.50;
    System.out.println("Novo preço com acrescimo: " + preco);
    
    }   

public void aplicar_desconto(){

    preco = preco - 0.50;
    System.out.println("Novo preço com desconto: " + preco);
    
    }

public void alterar_nome(){

    nome = nome.toUpperCase();
    System.out.println("Novo nome alterado: " + nome);
    }

}
