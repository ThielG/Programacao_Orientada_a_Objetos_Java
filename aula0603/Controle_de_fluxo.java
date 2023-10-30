/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.Scanner;

/**
 *
 * @author guilherme.thiel
 */
public class Controle_de_fluxo {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    String nome = sc.next();
    
    System.out.print("Digite o seu peso: ");
    double peso = sc.nextDouble();
    
    System.out.print("Digite a sua altura: ");
    double altura = sc.nextDouble();
    
    double imc = peso / (altura * altura);
    
    System.out.print("Digite M ou F: ");
    String sexo_pessoa = sc.next();
    
    if(sexo_pessoa.equalsIgnoreCase("F")){
        
        if (imc < 19.1){
            System.out.print("Você está baixo do peso!");
        }else if (imc >= 19.1 && imc <= 25.8) {
            System.out.print("Você está no peso ideal!");
        }else if (imc >= 25.8 && imc <= 27.3) {
            System.out.print("Você está um pouco acima do peso!");
        }else if (imc >= 27.3 && imc <= 32.3) {
            System.out.print("Você está acima do ideal!");
        }else if (imc <= 32.3) {
            System.out.print("Você está obeso!");
        }
            
    }else if(sexo_pessoa.equalsIgnoreCase("M")){
       
        if (imc < 20.7){
            System.out.print("Você está baixo do peso!");
        }else if (imc >= 20.8 && imc <= 26.4) {
            System.out.print("Você está no peso ideal!");
        }else if (imc >= 26.5 && imc <= 27.8) {
            System.out.print("Você está um pouco acima do peso!");
        }else if (imc >= 27.9 && imc <= 31.1) {
            System.out.print("Você está acima do ideal!");
        }else if (imc <= 31.1) {
            System.out.print("Você está obeso!");
        }
    
}

}
    
}