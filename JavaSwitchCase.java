/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renatosilva.javaswitchcasetpa;
import java.util.Scanner;
/**
 *
 * @author Renato Aparecido da Silva - 1° MTEC DS/AMS
 */
// O código abaixo se trata sobre a estrutura tradicional do Java Switch Case, sobre um aluno com uma prova de 10 questões e sua nota.
public class JavaSwitchCase {
     public static void main(String[] args) {
        Scanner inUser = new Scanner (System.in);

        // Abaixo, a entrada de dados:
        
        System.out.println("Número de questões corretas");
        int resposta = inUser.nextInt();
       
        switch(resposta){
            case 1:
            case 2:
            case 3:    
            case 4:    
            System.out.println("Sua nota é um I - Insatisfatório");
                break;
                
            case 5:
            case 6:
            System.out.println("Sua nota é um R - Regular");    
                break; 
                
            case 7:    
            case 8:    
            System.out.println("Sua nota é um B - Bom");    
                 break;
                 
            case 9:     
            case 10:    
            System.out.println("Sua nota é um MB - Muito Bom");    
                 break;
                 
            default:     
            System.out.println("Valor de entrada inválido");   
        }
     }
}
