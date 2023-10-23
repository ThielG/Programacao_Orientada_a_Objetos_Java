
package aula2703;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Guilherme";
        p1.idade = 23;
        p1.nascimento = LocalDateTime.of(1999, Month.SEPTEMBER, 11, 15, 25);
        
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.nascimento);
        
        p1.andar();
        p1.falar();
        
        Pessoa p2 = new Pessoa();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome de uma pessoa: ");
        p2.nome = sc.nextLine();
        
        System.out.println("Digite a idade de uma pessoa: ");
        p2.idade = sc.nextInt();
        
        System.out.println(p2.nome);
        System.out.println(p2.idade);
        
        p2.andar();
        p2.falar();
        
        Pessoa p3 = new Pessoa();
        
        p3.nome = "Giovana Caiu o Forninho";
        p3.cpf = "111.222.333-44";
        p3.rg = "1.111.111";
        p3.nascimento = LocalDateTime.now();
        p3.telefones.add("(48) 99988-7766");
        p3.telefones.add("(48) 99955-4433");
        
        System.out.println("Nome: " + p3.nome);
        System.out.println("CPF: " + p3.cpf);
        System.out.println("RG: " + p3.rg);
        System.out.println("Nascimento: " + p3.nascimento);
        for(String telefone : p3.telefones){
            System.out.println("Telefone: " + telefone);
        
        }
        
    }
    
}
