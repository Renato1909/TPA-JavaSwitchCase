/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.expressivo.jogofavoritoswitch;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva
 */
public class JogoFavoritoSwitch {

    public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 5 e descubra seu jogo favorito: ");
            int resposta = scanner.nextInt();
            
            switch (resposta) {
                case 1 -> System.out.println("Seu jogo favorito é Minecraft");
                case 2 -> System.out.println("Seu jogo favorito é FIFA");
                case 3 -> System.out.println("Seu jogo favorito é Fortnite");
                case 4 -> System.out.println("Seu jogo favorito é Call Of Duty");
                case 5 -> System.out.println("Seu jogo favorito é The Sims");
                default -> System.out.println("Valor inválido, seu jogo favorito não foi encontrado! Digite de 1 a 5.");
    }
}
    }
}
