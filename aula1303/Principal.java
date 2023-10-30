
package atividade_array;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de produtos que você deseja cadastrar: ");
        int quantidade = sc.nextInt();
        
        sc.nextLine();
        
        String produtos_array[] = new String[quantidade];
        
        for(int indice = 0; indice < quantidade; indice++){
            System.out.print("Informe o nome do n° " + indice + " produto: ");
            String nome = sc.nextLine();
            produtos_array[indice] = nome;
            
        }
        
        System.out.println("Imprimir em ordem alfabética: ");
        Arrays.sort(produtos_array);
        
        for(int i = 0; i < quantidade; i++){
            System.out.println(produtos_array[i]);
            
        }
        
    }
    
}
