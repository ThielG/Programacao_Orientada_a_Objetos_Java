
package aula0304;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste_produto {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Produto p1 = new Produto();
        
        System.out.println("Digite um nome de produto? ");
        p1.nome = sc.nextLine();
        
        System.out.println("Digite a data de vencimento (dd/mm/yyyy): ");
        String data = sc.nextLine();
        p1.vencimento = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        
        System.out.println("Digite o preço: ");
        double preco = sc.nextDouble();
        
        double valor_acrescimo = p1.aplicar_acrescimo(preco);
        System.out.println("Valor de acrescimo: " + valor_acrescimo);
        
        p1.imprimir_dados();
        
    }
    
    
    
}
