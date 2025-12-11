/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.composicao;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Carroteste {
    // lembrando que o ponto de partida é o main, entao aqui faremos isso;
    public static void main(String[] args) {
       // Criar um carro novo objeto ou instanciar;
        Carro c1 = new Carro();
        // Dentro do constructor do carro , tambem sera criado um motor associado a ele (composição);
        
        System.out.println(c1.estaLigado());
        c1.ligar();
        // Chamamos o metodo ligar() do carro;
        // que internamente configura o motor.ligado = true;
        System.out.println(c1.estaLigado());
        System.out.println(c1.motor.giros());
        // acelera !! esse carinho
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giros());
        c1.desligar();
        System.out.println(c1.motor.giros());
     
    }
}
