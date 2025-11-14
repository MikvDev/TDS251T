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
public class DemonSlayer {
    public static void main(String[] args) {
        
        Scanner verifivarScanner = new Scanner(System.in);
        
        System.out.println("Digite o nivel de conectarção ");
        int concentracao = verifivarScanner.nextInt();
        System.out.println("Digite o nbovel da sua energia: ");
        int energia = verifivarScanner.nextInt();
        
        
        if ( concentracao >= 60 && energia > 50) {
            System.out.println("Voce pode usar a tecnica de respiração da água!");
        }else{
            System.out.println("Você não pode usar a respiração da água! ");
    
        }
        verifivarScanner.close();
    }
    
}
