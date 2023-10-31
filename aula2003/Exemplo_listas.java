
package atividades_lista;

import java.util.ArrayList;
import java.util.List;

public class Exemplo_listas {
    
    public static void main(String[] args) {
        
        String arrayString[] = new String[5];
        arrayString[0] = "Guilherme";
        arrayString[0] = "Guilherme Thiel";
        
        List<Double> precos = new ArrayList<>();
        
        List<String> emails = new ArrayList<>();
        emails.add("guilhermethiel1@gmail.com");
        
        if(emails.contains("guilhermethiel1@gmail.com")){
            int indice = emails.indexOf("guilhermethiel1@gmail.com");
            emails.set(0, "guilhermethiel1@gmail.com");
        }
        
        String valor_resultado = emails.get(0);
        emails.remove(0);
        
        emails.clear();
        emails.size();
        
        if(emails.isEmpty()){
            System.out.println("Lista vaizia");
        }
        
    }
            
}
