
package aula2703;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    
    public String nome; 
    public String cpf;
    public String rg;
    public int idade; 
    public LocalDateTime nascimento;
    public List<String> telefones = new ArrayList<>();
            
    public void andar(){
    
        System.out.println(nome + " andou");
        
    }
    
    public void falar(){
    
        System.out.println(nome + " falou");
        
    }
            
}
