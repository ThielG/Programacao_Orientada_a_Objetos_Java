
package aula0304;

public class Animal {
    
    public String especie;
    public String cor;
    public Double peso;
    public String raca;
    
    void imprimir_valores(){
        System.out.println("Especie: " + especie);
        System.out.println("Cor: " + cor);
        System.out.println("Raça: " + raca);
        
    }
    
    double buscar_peso_animal(){        
        System.out.println("Acessou o metodo 'buscar_peso_animal'.");
        return peso;
                
    }
    
}
