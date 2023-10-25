
package aula2803;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        Conta cc = new Conta();
        cc.numero = 897;
        cc.saldo = 100;
        
        Conta cp = new Conta();
        cp.numero = 465;
        cp.saldo = 110;
        
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);
        
        for(Conta i : contas){
            System.out.println("Exibindo os valores da conta");
            System.out.println("Numero: " + i.numero);
            System.out.println("Saldo: " + i.saldo);
            
        }
        
    }
    
}
