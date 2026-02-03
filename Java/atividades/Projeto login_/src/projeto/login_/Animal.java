/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.login_;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Animal {
    protected String raca; // os filhos acessam
    private int peso;

    public Animal(String raca, int peso) {
        this.raca = raca;
        this.peso = peso;
    }
    
    public String mostrarRacaEPeso(){
        return " O animal e um(a) " + this.raca + " e pesa " + this.peso + "kg. ";
    }
    
    public String fazerSom(){
        return  " O animal esta fazendo um som."; // polimorfismo
       
    }
}
