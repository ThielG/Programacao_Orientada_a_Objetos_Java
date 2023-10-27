
package aula1004;

public class Sobrecarga {
    
    public int soma(int x, int y){
        return x + y;
    }
    
    public int soma(int x, int y, int z){
        return x + y + z;
    }
    
    public String concatenar(String valor1, String valor2){
        return valor1 + valor2;
    }
    
    public String concatenar(String valor1, String valor2, String valor3){
        return valor1 + valor2 + valor3;
    }
}
