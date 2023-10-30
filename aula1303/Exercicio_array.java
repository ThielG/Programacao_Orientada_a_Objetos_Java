
package atividade_array;

public class Exercicio_array {
    
    public static void main(String[] args) {
        
        int[] notas = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10};
        int[] frequencia = new int[11]; 
        
        for (int indice = 0; indice < notas.length; indice++){
            int valor = notas[indice]; 
            frequencia[valor] = frequencia[valor] + 1;
        
        }
        
        for(int i = 1; i < frequencia.length; i++){
            System.out.println("A nota " + i + " teve " + frequencia[i] + " respostas.");
            
        }
        
    }
    
}
