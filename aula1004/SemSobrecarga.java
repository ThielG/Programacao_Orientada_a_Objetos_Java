
package aula1004;

public class SemSobrecarga {
    
    public int soma2(int x, int y){
        return x + y;
    }
    public int soma3(int x, int y, int z){
        return x + y + z;
    }
    public int somaN(int numeros[]){
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }
}
