
package poo2;

public class While_impar {
    
    public static void main(String[] args){
        
        int contador = 1;
        
        while(contador <= 99){
            if (contador % 2 != 0){
                System.out.println(contador);
                contador++;
            }else{
                contador++;
            }
            
        }
        
    }
    
}
