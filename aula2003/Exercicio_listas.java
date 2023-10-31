
package atividades_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_listas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<String> bebidas = new ArrayList<>();

        int qtdMinima = 4;

        boolean desejaContinuarCadastrando = true;
        do {
            System.out.println("Informe uma bebida: ");
            String bebida = sc.nextLine();
            bebidas.add(bebida);

            if (bebidas.size() >= qtdMinima) {
                System.out.print("Deseja continuar cadastrando bebidas ? (1 para 'S' ou outro numero para 'N'): ");
                desejaContinuarCadastrando = (sc.nextShort() == 1);
                sc.nextLine();
            }

        } while (desejaContinuarCadastrando);

        
        
        
        boolean desejaContinuarPesquisando = false;
        do {
            System.out.println("Informe uma bebida deseja pesquisar: ");
            String bebidaPesquisa = sc.nextLine();

            if (bebidas.contains(bebidaPesquisa)) {
                bebidas.remove(bebidaPesquisa);
                System.out.println("Bebida removida com sucesso");
                desejaContinuarPesquisando = false;
            } else {
                System.out.println("Não temos essa bebida ;/");
                System.out.print("Deseja continuar pesquisando bebidas ? (1 para 'S' ou outro numero para 'N'): ");
                desejaContinuarPesquisando = (sc.nextShort() == 1);
                sc.nextLine();
            }
        } while (desejaContinuarPesquisando);

        
        System.out.println(bebidas.toString());

    }

}
