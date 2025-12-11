/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.Default;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class DragaoBluetooth {
    boolean sinal = false;
    void interferencia(){
        System.out.println("O sinal está tento falhas..");
        System.out.println("infelizmente o sinal caiu :( ");
        sinal = false;
    }
    void arrumarSinal(){
        if (sinal == true) {
            System.out.println("obs: O sinal voltou ao normal!");
            sinal = true;
        }else{
            System.out.println("obs: O sinal já esta bom! :3");
        }
    }
    void conectar(){
        if (sinal == false) {
            System.out.println("A coneccao esta ruim.. nao foi possivel estabelecer uma conccao estavel!");
            
        }else{
            System.out.println("Conectado!");
    }
}
}
