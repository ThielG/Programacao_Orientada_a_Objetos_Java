
package aula0304;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
    
    public String nome;
    public LocalDate vencimento; 
    
    public double aplicar_acrescimo (double preco){
        return preco * 1.20;
    };
    
    void imprimir_dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Vencimento: " + vencimento.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
    };
    
}
