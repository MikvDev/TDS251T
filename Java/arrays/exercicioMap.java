/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class exercicioMap {
    public static void main(String[] args) {
        Map<String, Double> info = new HashMap<>();
        info.put("Doubledoor", 10000.00);
        info.put("GangDalf", 200.00);
        info.put("Valdo Da morte", 12309.00);
        info.put("Chapolin", 2222.00);
        
        System.out.println("O poder de gangdalf e:" + info.get("GangDalf"));
        info.put("Doubledoor", 10800.00);
        System.out.println("O poder de DoubleDoor foi aumentado em 800: " + info.get("Doubledoor"));
        
          for(Map.Entry<String, Double> entry : info.entrySet()){
             System.out.println("Mago: " + entry.getKey() + " | Poder: " + entry.getValue());
        }
          for (Map.Entry<String, Double> entry : info.entrySet()) {
          
            
        }
        System.out.println("O numero de magos que esta no map e:  " + info.size());
        
        // poder de gangdalf;
        // aumatenatr poder de doubledoor;
        //exibir todo mundo;
        //conte e exiba qunatos magos tem;
        
    }
}
