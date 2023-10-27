
package aula1004;

public class Encapsulamento {

    private int numero;
    private String nome;
    
    public void alterarNome(String nomeAlterar){
        this.nome = nomeAlterar;
        
    }
    
    public String recuperarNome(){
        return nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getNumero(){
        return numero;
    }
    
}
