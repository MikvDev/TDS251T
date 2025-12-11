/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.composicao;

/**
 *
 * @author MIGUELVARGASFERREIRA Classe carro;
 *
 *
 *
 */
public class Carro {

    // um carro é composto por UM motor;
    final Motor motor;
    //'Final ' garante que, depois de criado no costructor não trocaremos esse motor;
    // Conscructor do carro( lembrando  da palavra new);

    public Carro() {
        this.motor = new Motor(this);
        // ao criarmos o carro, ele tambem cria seu motor;

    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {

            //verificar se o fator de injeção ainda não chegou ao limite de 2.6
            motor.fatorInjecao += 0.4;
            // aumenta o fatror inseção em 0.4;
            // isso fará o motor girar mais quando chamarmos o giro();
        }

    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            // garante que o fator de injeção não fiquei abaixo de um limite minimo (0.5);
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;

    }

    void desligar() {
        motor.ligado = false;

    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
