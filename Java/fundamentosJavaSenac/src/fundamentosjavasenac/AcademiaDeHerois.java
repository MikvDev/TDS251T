/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac;
import java.util.Scanner;
/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class AcademiaDeHerois {
    
    public static void main(String[] args) {
            Scanner verificar = new Scanner(System.in);
            System.out.println("Digite a sua idade: ");
            int idade = verificar.nextInt();
            System.out.println("Digite o valor de seu poder emocional: ");
            int valorEmocional = verificar.nextInt();
            System.out.println("Digite o valor de seu poder: ");
            int poder = verificar.nextInt();
            
            if (idade >= 15 && poder >= 50 && valorEmocional >= 0 ) {
                System.out.println("Parabens Voce entrou!");
        }else if(( poder < 80) && (valorEmocional >= 60 ) ){
                System.out.println("Voce pode entrar na escola");
        }else if((poder >= 80) && (valorEmocional > 0)){
                System.out.println("Voce pode entrar na escola");
                
        }else{
                System.out.println("Voce não pode entrar nas escola!");
        }
    }
    
   // idade poder controle emocional
}
