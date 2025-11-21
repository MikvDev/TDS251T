/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.loops;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class att {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vida = 100;
        int danoJogador = 14;
        int danoInimigo = 15;
        int vidaInimigo = 40;
        System.out.println("====================BATALHA===========================");
        System.out.println("Digite quantos inimigos voce quer batalhar contra (1-5)");

        int inimigoAtual = 1;
        int quantidadeInimigo = sc.nextInt();
        while (quantidadeInimigo < 1 || quantidadeInimigo > 5) {   
            System.out.println("-----------------------------------");
            System.out.println("Quantidade invalida!");
            System.out.println("-----------------------------------");
           
            System.out.println("Digite uma quantidade de 1 - 5 !");
             quantidadeInimigo = sc.nextInt();
           
        }
        while (inimigoAtual <= quantidadeInimigo && vida > 0) {
            vidaInimigo = 40;
            while (vida > 0 && vidaInimigo > 0) {

                System.out.println("\n \n Inimigo " + inimigoAtual);
                System.out.println("Sua vida: " + vida + "| vida do inimigo: " + vidaInimigo);
                System.out.println("Digite 1 - para atacar | Digite 2 - para defender");
                int acao = sc.nextInt();

                switch (acao) {
                    case 1:
                        System.out.println("Voce atacou o inimigo! Causou: " + danoJogador);
                        vidaInimigo -= danoJogador;
                        if(vidaInimigo > 0){
                        vida -= danoInimigo;
                        System.out.println("Inimigo te atacou de volta!");
                        }
                        break;
                    case 2:
                        System.out.println("Voce defendeu!");
                        int danoMenor = danoInimigo / 2;
                        vida -= danoMenor;
                        System.out.println("Dano do inimigo dividido pela metade");
                        break;
                    default:
                        System.out.println("Invalido!");
                        System.out.println("Perdeu sua vez! o inimigo te atacou.. Voce recebeu" + danoInimigo + " de dano");
                        vida -= danoInimigo;

                }

                if (vidaInimigo < 0) {
                    System.out.println("\n-----------------------------");
                    System.out.println("Você matou um inimigo !");
                    System.out.println("------------------------------\n");
                }

            }
            inimigoAtual++;
        }
        if (vida > 0) {
            System.out.println("=================================");
            System.out.println("Parabens voce passou no teste!!");
            System.out.println("=================================");
        }else{
            System.out.println("Voce foi derrotado...");
        }
    }
}
