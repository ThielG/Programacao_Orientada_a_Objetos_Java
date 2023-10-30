
package poo2;

import java.util.Scanner;

public class Exercicio_matriz {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int numero = sc.nextInt();

            for(int linha = 0; linha < numero; linha ++){
                for(int coluna = 0; coluna < numero; coluna++){
                    System.out.print("#");
                }
            
            System.out.println("");

        }
        
    }
    
}
