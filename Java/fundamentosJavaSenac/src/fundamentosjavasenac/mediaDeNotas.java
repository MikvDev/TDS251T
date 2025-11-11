/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class mediaDeNotas {
    double nota1;
    double nota2;
    double nota3;

    public mediaDeNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public void calcularNotas(){
        double soma = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua media aritimetica das suas notas é: " + soma);
    }
}
