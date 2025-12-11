/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.TratamentoDeErros;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Conta {
   
        private double saldo = 100;
        // Aqui nos vamos trabalhar com throws avisando que o metodo pode dar erro(mas n esta dando erro ainda);
        public void sacar(double valor) throws Exception{
            if (valor > saldo ) {
                throw new Exception("Saldo insuficiente! seu saldo é: " + saldo );
            }
                saldo -= valor;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            }
        }
    


