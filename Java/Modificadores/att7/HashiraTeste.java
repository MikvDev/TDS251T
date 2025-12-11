/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.Private;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class HashiraTeste {
    public static void main(String[] args) {
        Hashira h1 = new Hashira();
        h1.usarRespiracao("Fogo");
       int a = h1.forcaTotal(4, 6);
        System.out.println("------------------------");
        System.out.println("A forca total e: " + a );
        System.out.println("------------------------");
    }
}
