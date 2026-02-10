/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojinha.util;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/lojinha_games";
    private static final String PASS = "root";
    private static final String USER = "root";
    
   public static Connection getConnection() throws  SQLException{
       try {
           return DriverManager.getConnection(URL,PASS,USER);
       } catch (Exception e) {
           throw  new RuntimeException("ERRO ao conectar no mysql: " +  e.getMessage());
       }
   }
}
