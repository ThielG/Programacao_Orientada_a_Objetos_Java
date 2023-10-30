
package atividade_array;

public class Array_exercicio_um {
    
    public static void main(String[] args) {
        
        int meses[][] = new int[12][];
        for(int mes = 0; mes < meses.length; mes++){
            
            switch(mes){
                
                case 1:
                    meses[mes] = new int[28];
                    break;
                
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                case 12:
                    meses[mes] = new int[31];
                    break;
                
                case 3:
                case 5:
                case 8:
                case 10: 
                    meses[mes] = new int[30];
                    break;
                    
            }
            
        }
        
        for(int i = 0; i < meses.length; i++){
            System.out.println("O mês " + (i+1) + " possui " + meses[i].length + " dias.");
            
        }
        
    }
    
}
