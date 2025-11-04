/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.login_;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Reptil extends Animal{
    private String corDasEscamas;

    public Reptil(String corDasEscamas, String raca, int peso) {
        super(raca, peso);
        this.corDasEscamas = corDasEscamas;
    }
    @Override
    public String fazerSom(){
        return  "roar";
    }
}
