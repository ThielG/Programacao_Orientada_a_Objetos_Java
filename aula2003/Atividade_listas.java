package atividades_lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_listas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> estoque = new ArrayList<String>();
        boolean continuar_cadastro = true;
        System.out.println("Para cadastrar um carro, digite o nome do carro e pressione ENTER.");
        System.out.println("Quando desejar parar o cadastro, digite 'fim' e pressione ENTER.");
        
        while (continuar_cadastro) {
            String carro = sc.nextLine();
            if (carro.equals("Fim")) {
                continuar_cadastro = false;
            } else {
                estoque.add(carro);
            }
            
        }
        
        System.out.println("Estoque cadastrado:");

        for(String carro : estoque){
            System.out.println(carro);
        }
        
        boolean continuar_procura = true;
        
        while (continuar_procura) {
            System.out.println("Qual carro você deseja comprar?");
            String carro_procurado = sc.nextLine();
            
            if (estoque.contains(carro_procurado)) {
                System.out.println("O carro que você procura está no estoque.");
                System.out.println("Você deseja comprar o carro?");
                String resposta_compra = sc.nextLine();
                
                if (resposta_compra.equalsIgnoreCase("sim")) {
                    System.out.println("Você deseja dar o seu carro na troca?");
                    String resposta_troca = sc.nextLine();
                    
                    if (resposta_troca.equalsIgnoreCase("sim")) {
                        System.out.println("Qual carro você possiu? ");
                        String carro_troca = sc.nextLine();
                        estoque.add(carro_troca);
                        estoque.remove(carro_procurado);
                     
                    } else {
                        System.out.println("Venda realizada: " + carro_procurado);
                        estoque.remove(carro_procurado);
                    }
                    
                }else{
                    System.out.println("Procura finalizada.");
                    continuar_procura = false;
                }
                
            }else{
                System.out.println("O carro que você procura não está no estoque.");
                System.out.println("Deseja continuar procurando em seu estoque?");
                String resposta_continuar = sc.nextLine();
                if (resposta_continuar.equalsIgnoreCase("Não")) {
                    System.out.println("Procura finalizada.");
                    continuar_procura = false;
                }
                
            }
            
        }
        
        System.out.println("Carros restantes no estoque:");
        
        for (String carro : estoque) {
            System.out.println(carro);
        }
        
    }
    
}
