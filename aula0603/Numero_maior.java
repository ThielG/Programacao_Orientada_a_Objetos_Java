/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Scanner;

public class Numero_maior {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int valor1 = sc.nextInt();
       
        System.out.print("Digite o segundo número: ");
        int valor2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int valor3 = sc.nextInt();
        
    if((valor1 > valor2) && (valor1 > valor3)) {
        System.out.println(valor1 + " é o maior número!");
    }
    
    if((valor2 > valor1) && (valor2 > valor3)) {
        System.out.println(valor2 + " é o maior número!");
    }
    
    if((valor3 > valor1) && (valor3 > valor2)) {
        System.out.println(valor3 + " é o maior número!");
    }
    
    }
    
}
    