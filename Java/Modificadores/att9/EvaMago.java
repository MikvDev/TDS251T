/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.att9;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class EvaMago extends EvaUnit{
    public void sincronizarMagicamente(){
        ajustar(100); // permitido pq é protected
        System.out.println("Sync magico completo: " + sincronizacao + "%");
    }
}
