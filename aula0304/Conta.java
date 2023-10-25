
package aula0304;

public class Conta {
    
    public int numero;
    
    public double saldo;
    
    public double limite = 100.0;
    
    public void depositar(double valor){
        saldo += valor; 
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public void imprimirExtrato(){
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    
    }
    
    public double consultarSaldoDisponivel(){
        return saldo + limite;
        
    }
    
}
