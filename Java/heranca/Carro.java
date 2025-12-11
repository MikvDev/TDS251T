/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.heranca;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Carro extends Veiculo {
    public Carro(String marca, int ano){
        super(marca, ano);
    }
    @Override
    public void mover(){
        System.out.println(marca + " o carro está se acelerando... vrummmm!");
    }
}
