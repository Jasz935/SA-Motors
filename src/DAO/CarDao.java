/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import Modelos.ConexionSa;
import Modelos.Car;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author PERSONAL
 */
public class CarDao {
    
    PreparedStatement ps;
    
    ResultSet rs;
    
    Connection con;
    
    ConexionSa conectar = new ConexionSa();
    
    Car carro = new Car();
    
    public List listar(){
          List<Car> datos = new ArrayList<>();
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from VEHICULO1" +
"WHERE tipo_vehi_id IN (1,2,3,4,5);");
            rs = ps.executeQuery();
            //crear arreglo datos
            while (rs.next()){
                Car carro = new Car();
                carro.setVehi_id(rs.getInt(1));
                carro.setTipo_id(rs.getInt(2));
                carro.setProv_id(rs.getInt(3));
                carro.setMarca(rs.getString(4));
                carro.setModelo(rs.getString(5));
                carro.setYear(rs.getInt(6));
                carro.setColor(rs.getString(7));
                carro.setPlaca(rs.getString(8));
                carro.setCosto(rs.getInt(9));
                carro.setEstado(rs.getString(10));
                carro.setFecha_ingreso(rs.getString(11));
                
                datos.add(carro);
                System.out.println("Tabla creada Crack");
                
                
            }
        
        } catch (Exception e){
            System.out.println("No pudo crear la lista");
            e.printStackTrace();
        }
        
        return datos;
    }
    
    

    
    
    
    
    
}