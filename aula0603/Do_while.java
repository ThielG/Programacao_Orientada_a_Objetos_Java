
package poo2;

import java.util.Scanner;

public class Do_while {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
    
        do{
            System.out.print("Digite um valor: ");
            numero = sc.nextInt();
            soma += numero;
    
        }while (numero != 0);
        
        System.out.println("A soma é: " + soma);
    
    }

}
