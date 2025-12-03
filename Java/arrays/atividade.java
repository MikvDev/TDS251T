/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MIGUELVARGASFERREIRA
 * // Dia 03/12;
//arry tradicional é fixo
// list, set, map = list(pode repetido), set(não pode rept), map(dicionario);
// list add, get, set, remove, size, conatains;
// list é mais moderna, pode remover, modificar..;
// DAO; - data access obj;
// exercicio de map;
 * 
 */ 


public class atividade {
    public static void main(String[] args) {
        // criando uma "agenda" de notas:;
        // cada aluno tem um nome chave e uma nota valor;
        // map <chave, Valor>;
        // bashmap = rapido, não mantem a ordem;
        
        
        Map<String,Double> notas = new HashMap<>();
        // put(chave,valor) - adicionar ou atualizar entradas;
        notas.put("Ana", 9.5);
        notas.put("Bruno", 7.5);
        notas.put("carlos", 8.3);
        
        System.out.println("");
        // se a chave já existe, o valor é atualizado(substituido);
        notas.put("Ana", 9.8);
        // get(chave) - recupera o valor associado a chave;
        // aqui pegamos a nota do aluno. no caso a Ana;
        System.out.println("Nota de Ana:" + notas.get("Ana"));
        // ai podemos pegar todas as chaves tmbm com o keyset();
        //
        //podemos usar o foreach para imprimir chave + valor corresponde 
        for (String nome: notas.keySet()) {
            System.out.println(nome + " -> " + notas.get(nome));
            
        }
        
    }
}
