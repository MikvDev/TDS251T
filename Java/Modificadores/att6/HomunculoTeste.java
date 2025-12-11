/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.Private;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class HomunculoTeste {
    public static void main(String[] args) {
        Homunculo h1 = new Homunculo();
        h1.setNome("Gabrielalalalalaal");
        System.out.println("Homunculo: " + h1.getNome());
        h1.setNivelPerigo(90);
        System.out.println("Nivel de perigo: " + h1.getNivelPerigo());
    }
}
