/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author PERSONAL
 */
public class ConexionSa {
    
     Statement consulta;
    
    String url = "jdbc:sqlite:baseConcesionario.db" ;
    
    Connection con;

    public Connection getConnection() {
        try {
            con= DriverManager.getConnection(url);
            consulta= con.createStatement();
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
        return con;
    }
    
}
