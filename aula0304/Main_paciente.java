
package aula0304;

public class Main_paciente {
    
    public static void main(String[] args) {
        
        Paciente p1 = new Paciente();
        p1.peso = 72;
        p1.altura = 1.80;
        System.out.println("IMC p1: " + p1.Imc());
        
    }
    
}
