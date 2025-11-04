/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.login_;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Calculadora {
// atributo 

    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // metodos
// metodo de soma
    public double somar() {
        return this.numero1 + this.numero2 // com ou sem this
                ;// se não é void precisa de return

    }
    
    public double subtrair(){
        return this.numero1 - this.numero2;
    
    }
    public double multiplicar(){
        return this.numero1 * this.numero2;
    }
    public double dividir(){
        if (this.numero2 == 0) {
            return 0;
        }
        return  this.numero1 / numero2;
    }
}
