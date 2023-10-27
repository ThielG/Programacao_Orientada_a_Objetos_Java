
package aula1004;

public class Gerente {
    
    private String nome;
    private double salario;
    
    public void aumentaSalario(){
        aumentaSalario(0.1);
    }
    
    public void aumentaSalario(double taxa){
        this.salario += this.salario + taxa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
}
