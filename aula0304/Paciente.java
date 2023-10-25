
package aula0304;

public class Paciente {
    
    public double peso;
    public double altura;
    
    public double Imc(){
        double imc = peso / (altura * altura);
        return imc;
    
    }
    
}
