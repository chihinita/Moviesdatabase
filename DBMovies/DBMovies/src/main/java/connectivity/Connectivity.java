/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chihinita
 */
public class Connectivity {
    

 public static Connection getCon() {
        try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Moviesdb?useSSL=false", "root", "Pandu3101");
                  System.out.println("Driver Loaded");
                  return con;
                  
        }
        catch(ClassNotFoundException e){
            System.out.println("Driver not Loaded");
            return null;
        }
        catch(SQLException e){
            System.out.println("connection not established");
            return null;
        }
 } 
 } 


