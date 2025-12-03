/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.POO;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class SobrecargaPizzaTest {
    public static void main(String[] args) {
        SobrecargaPizza mypizza = new SobrecargaPizza();
        mypizza.exebirInfo();
        
        SobrecargaPizza mypizza2 = new SobrecargaPizza(" Costelinha");
        mypizza2.exebirInfo();
        
        SobrecargaPizza mypizza3 = new SobrecargaPizza(" Doritos", true);
        mypizza3.exebirInfo();
        
        SobrecargaPizza mypizza4 = new SobrecargaPizza(" 20 queijo", 93.7);
        mypizza4.exebirInfo();
    }
}
