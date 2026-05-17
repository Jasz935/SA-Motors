/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author PERSONAL
 */
public abstract class Vehicle {
    
    
    private int vehi_id;
    private int tipo_id;
    private int prov_id;
    private String marca;
    private String modelo;
    private String color;
    private int year;
    private int costo;
    private String placa;
    private String estado;
    private String fecha_ingreso;

    public Vehicle() {
    }

    public Vehicle(int vehi_id, int tipo_id, int prov_id, String marca, String modelo, String color, int year, int costo, String placa, String estado, String fecha_ingreso) {
        this.vehi_id = vehi_id;
        this.tipo_id = tipo_id;
        this.prov_id = prov_id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
        this.costo = costo;
        this.placa = placa;
        this.estado = estado;
        this.fecha_ingreso = fecha_ingreso;
    }

    

    
    
    
    
    

    public int getVehi_id() {
        return vehi_id;
    }

    public void setVehi_id(int vehi_id) {
        this.vehi_id = vehi_id;
    }

    public int getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
    
    
    
    
} 


