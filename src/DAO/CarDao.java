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
        }finally {

        try {

            if(ps != null) ps.close();
            if(con != null) con.close();
            if(rs != null) rs.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
        
        return datos;
    }
    
    public int agregar(Car carro){
               int r=0;
        String sql ="Insert into VEHICULO1(tipo_vehi_id, proveedor_id, marca, modelo, year, color, costo, placa, estado, fecha_ingreso) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, carro.getTipo_id());
            ps.setInt(2, carro.getProv_id());
            ps.setString(3, carro.getMarca());
            ps.setString(4, carro.getModelo());
            ps.setInt(5, carro.getYear());
            ps.setString(6, carro.getColor());
            ps.setInt(7, carro.getCosto());
            ps.setString(8, carro.getPlaca());
            ps.setString(9, carro.getEstado());
            ps.setString(10, carro.getFecha_ingreso());
            r = ps.executeUpdate();
            if(r==1){
                return 1;
            } else{
                return 0;
            }
            
        } catch (Exception e){
            System.out.println("No se pudo actualizar");
            e.printStackTrace();
                   
        }finally {

        try {

            if(ps != null) ps.close();
            if(con != null) con.close();
            if(rs != null) rs.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
        return r;
    }
        
        
        
        public int actualizar(Car carro){
            int r=0;
            String sql="UPDATE VEHICULO1"
                    +"SET tipo_vehi_id=?, proveedor_id=?, marca=?, modelo=?, year=?, color=?, costo=?, placa=?, estado=?, fecha_ingreso=?"
                    +"WHERE vehi_id=?";
            
             try {
            
            con = conectar.getConnection();
            ps.setInt(1, carro.getTipo_id());
            ps.setInt(2, carro.getProv_id());
            ps.setString(3, carro.getMarca());
            ps.setString(4, carro.getModelo());
            ps.setInt(5, carro.getYear());
            ps.setString(6, carro.getColor());
            ps.setInt(7, carro.getCosto());
            ps.setString(8, carro.getPlaca());
            ps.setString(9, carro.getEstado());
            ps.setString(10, carro.getFecha_ingreso());
            r = ps.executeUpdate();
            if(r==1){
                return 1;
            } else{
                return 0;
            }
            
        } catch (Exception e){
            System.out.println("No se pudo actualizar");
            e.printStackTrace();
                   
        }finally {

        try {

            if(ps != null) ps.close();
            if(con != null) con.close();
            if(rs != null) rs.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
        return r;
            
        }
        
        
        
        
         public Car buscar(int vehi_id){

    Car carro = new Car();

    String sql = "SELECT * FROM VEHICULO1 WHERE vehi_id=?";

    try {

        con = conectar.getConnection();
        ps = con.prepareStatement(sql);

        ps.setInt(1, vehi_id);

        rs = ps.executeQuery();

        if(rs.next()){

            carro.setVehi_id(rs.getInt("vehi_id"));
            carro.setTipo_id(rs.getInt("tipo_vehi_id"));
            carro.setProv_id(rs.getInt("proveedor_id"));
            carro.setMarca(rs.getString("marca"));
            carro.setModelo(rs.getString("modelo"));
            carro.setYear(rs.getInt("year"));
            carro.setColor(rs.getString("color"));
            carro.setCosto(rs.getInt("costo"));
            carro.setEstado(rs.getString("estado"));
            carro.setFecha_ingreso(rs.getString("modelo"));

        }

    } catch (Exception e){

        System.out.println("No se pudo buscar");
        e.printStackTrace();

    }finally {

        try {

            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(con != null) con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    return carro;
}
        
        
   }
    
    

    
    
    
    
    
