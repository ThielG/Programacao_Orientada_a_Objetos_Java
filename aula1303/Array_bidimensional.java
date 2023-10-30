
package atividade_array;

public class Array_bidimensional {
    
    
    public static void main(String[] args) {
        
        String arrayBidimensional [][] = new String [3][3];
        arrayBidimensional[0] [2]= "SC";
        for (int linha =0; linha < arrayBidimensional.length; linha++){
            
            for(int coluna =0; coluna < arrayBidimensional[linha].length;coluna++){
            String resposta = arrayBidimensional[linha][coluna];
            System.out.println(resposta);
            
            }
        
        }
        
    }
    
}