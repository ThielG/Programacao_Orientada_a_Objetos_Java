
package aula0304;

public class Aeronave {
    
    public int totalAssentos;
    
    public int assentosReservados;
    
    public void reservarAssentos(int numeroAssentos){
        
        int qtdAssentosDisponiveis = calcularAssentosDisponiveis();
        
        if (qtdAssentosDisponiveis >= numeroAssentos){
            this.assentosReservados += numeroAssentos; 
            System.out.println("Assento reservado com sucesso.");
        }else{
            System.out.println("Não foi possivel reservar.");
        }
        
    }
    
    public int calcularAssentosDisponiveis(){
        return this.totalAssentos - this.assentosReservados;
    }

}
