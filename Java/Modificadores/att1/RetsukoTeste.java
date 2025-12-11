/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class RetsukoTeste {
    public static void main(String[] args) {
        Retsuko r1 = new Retsuko();
        r1.cantarMetal("METALLLLLLL!!!!");
        r1.estado(80);
        System.out.println("Dados ao contrario:");
        r1.cantarMetal(5);
        r1.estado(2);
    }
}
