/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.config;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class ConnectionFactory {
    private static  final String URL = "jdbc:mysql://localhost:3306/escoladao";
    private static  final String USER = "root";
    private static  final String PASS = "root";
    
  public static Connection getConnection() throws  SQLException{
      return DriverManager.getConnection(URL,USER,PASS);
  }
}
