/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.condicionais;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Frieren2 {

    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);
        System.out.println("Digite o nivel de magia: ");
        int magia = verificar.nextInt();

        if (magia < 30) {
            System.out.println("Magia fraca");
        } else if (magia > 30 && magia <= 70) {
            System.out.println("Magia mediana");
        } else if (magia > 71) {
            System.out.println("Caraca! Você é digno de treinar com a Frieren! ");
        } else if (magia  !=isEmpty()) {
            
        }

        verificar.close();
    }

}
