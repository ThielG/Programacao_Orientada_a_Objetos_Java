
package aula0304;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal_animal {
    
    public static void main(String[] args) {
        
        List<Animal> animais = new ArrayList<>();
        
        for (int indice = 0; indice < 2; indice++){
            
            Animal obj = new Animal();
            Scanner sc = new Scanner(System.in);
           
            System.out.println("Digite a especie do animal: ");
            obj.especie = sc.nextLine();
            
            System.out.println("Digite a cor do animal: ");
            obj.especie = sc.nextLine();
            
            System.out.println("Digite o peso do animal: ");
            obj.peso = sc.nextDouble();
            
            System.out.println("Digite a raça do animal: ");
            obj.raca = sc.nextLine();
            
            animais.add(obj);
            
            System.out.println("Animal adicionado com sucesso na lista!");
            System.out.println();
            
            for (Animal animal : animais){
                System.out.println("A espécie do animal é: " + animal.especie + "."); 
            
            }
            
        }  
        
    }
    
}
