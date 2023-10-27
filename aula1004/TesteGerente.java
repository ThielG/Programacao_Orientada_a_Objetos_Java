
package aula1004;

public class TesteGerente {
   
    public static void main(String[] args) {
        
        Gerente ge = new Gerente();
        ge.setNome("Guilherme");
        ge.setSalario(13000);
        ge.aumentaSalario(0.5);
        System.out.println(ge.getSalario());
        
    }

}
