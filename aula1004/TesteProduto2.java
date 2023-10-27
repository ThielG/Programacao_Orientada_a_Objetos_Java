
package aula1004;

import java.util.Scanner;

public class TesteProduto2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Produto2 p2 = new Produto2();
        
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Deseja informar a marca do produto? ");
        String preencherMarca = sc.nextLine();
        
        if(preencherMarca.equalsIgnoreCase("Sim")){
            System.out.println("Informe a marca do produto: ");
            String marca = sc.nextLine();
            p2.valoresIniciais(preco, nome, marca);
        }else{
            p2.valoresIniciais(preco, nome);
        }
        
        p2.aumentarPreco();
        p2.imprimir();
        
    }
    
}
