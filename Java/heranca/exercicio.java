/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.heranca;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class exercicio {
    public static void main(String[] args) {
        Carro car = new Carro("Uninho",1900);
        Moto mot = new Moto("yamaha", 2000);
        
        car.mover();
        mot.mover();
        car.mover();
    }
}

