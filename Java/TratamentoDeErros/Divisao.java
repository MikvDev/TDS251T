/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.TratamentoDeErros;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Divisao {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("@-----------@@@-----------@");
         System.out.println("Digite o primeiro numero: ");
         System.out.println("@-------------------------@");
         int num1 = sc.nextInt();
         System.out.println("@-----------@@@-------------@");
         System.out.println("Digite o segundo numero: ");
         System.out.println("@---------------------------@");
         int num2 = sc.nextInt();
         
         try{
             
            int resultado = num1 / num2;
             System.out.println("Resultado: " + resultado);
         }catch(ArithmeticException e){
             System.out.println("");
             // Tratamento de erro caso ocorra a divisao por zero
             System.out.println("Erro: Nao e possivel dividir por 0!");
         }finally{
             System.out.println("Codigo finalizado!");
         }
         sc.close();
             
    }
   
}
