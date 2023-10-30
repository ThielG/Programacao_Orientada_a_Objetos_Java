/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author guilherme.thiel
 */
public class Desafio_ternario {
    
    public static void main(String[] args) {
    
        boolean var = false; 
        String resultado;
        resultado = (var = !var)
                ? (var = !var) ? "Hello" : "hello" 
                : (var = !var) ? "World" : "world";
        
        System.out.println(resultado);

//O sinal de '?' significa True.

    }
    
}
