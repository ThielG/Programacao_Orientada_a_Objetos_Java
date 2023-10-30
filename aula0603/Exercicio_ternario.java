/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Scanner;

public class Exercicio_ternario {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número aleatório: ");
    int numero = sc.nextInt();
    
    if(numero % 2 == 0){
        System.out.println("O número informado é par!");
    }else{
        System.out.println("O número informado é ímpar!");
    }
    
}
     
}