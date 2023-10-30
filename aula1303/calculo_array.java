
package atividade_array;

import java.util.Scanner;

public class calculo_array {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da matriz: ");
        int quantidade = sc.nextInt();
        
        int primeiro[][] = new int [quantidade][quantidade];
        int segundo[][] = new int [quantidade][quantidade];
        int resultado[][] = new int [quantidade][quantidade];
        
        for(int linha = 0; linha < primeiro.length; linha++){
            for(int coluna = 0; coluna < primeiro.length; coluna++){
                
                System.out.println("Informe um número para o índice [" + linha+ "." + coluna + "].");
                int numero = sc.nextInt(); 
                
                primeiro[linha][coluna] = numero; 
                
            }
            
        }
    
        for(int linha = 0; linha < segundo.length; linha++){
            for(int coluna = 0; coluna < segundo.length; coluna++){
                
                System.out.println("Informe um número para o índice [" + linha+ "." + coluna + "].");
                int numero = sc.nextInt(); 
                
                segundo[linha][coluna] = numero; 
                
        }
    
    }
    
        for(int linha = 0; linha < resultado.length; linha++){
            for(int coluna = 0; coluna < resultado.length; coluna++){
                
                int valor1 = primeiro[linha][coluna];
                int valor2 = segundo[linha][coluna];
                
                resultado[linha][coluna] = valor1 + valor2; 
                
                System.out.println("A soma do índice [" + linha + "." + coluna + "]. É: " + resultado[linha][coluna]);
                
            }
    
        }

    }
    
}
