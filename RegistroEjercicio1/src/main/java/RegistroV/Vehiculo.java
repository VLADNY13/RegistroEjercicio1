/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroV;



/**
 *
 * @author Bayron Vargas
 */
public class Vehiculo {
    
    private String placa;
    private String modelo;
    private String marca;
    private String dueno;
    
    

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String dueno) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.dueno = dueno; 
    }

   

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
     public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
}
