
package poo2;

public class Numeros_pares {
   
    public static void main(String[] args){
    
        for(int contador = 1; contador <= 10 ; contador++){
            
            int resto_divisao = contador % 2;
            if(resto_divisao == 0){
                System.out.println(contador + " é um número par.");
            }else{
                System.out.println(contador + " é um número impar.");
            }
            
        }
        
    }
    
}
