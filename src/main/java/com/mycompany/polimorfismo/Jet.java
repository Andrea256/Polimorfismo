/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 * 
 * Clase Jet que extiende de Powered Vehicle.
 */

public class Jet extends PoweredVehicle{
    
    private String myEngineCount; //recuento de motores

    /**
     * Constructor de Jet.
     * @param myEngineCount Atributo de jet que guarda motores.
     * @param myFuelType Atributo de powered vehicle.
     * @param myBrand Atributo de vehicle.
     * @param myModel Atributo de vehicle.
     */
    
    public Jet(String myEngineCount, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineCount = myEngineCount;
    }    
    
    /**
     * Metodo recmoto de la clase jet.
     */
    
    public void recMoto(){
        
        System.out.println("Recuento de motores:" );
        
    }
    
    /**
     * Metodo que sobre escribe el de la clase padre.
     */
    
    @Override
    public void printType() {
        System.out.println("Soy Jet");
    }
    
    /**
     * Metodo que sobre escribe el metodo encerder de la interfaz intvehicle.
     */

    @Override
    public void encender() {
        
        System.out.println("Calentando motores");
        
        super.encender(); 
    }
    
    /**
     * Metodo que sobre escribe el metodo apagar de la interfaz intvehicle.
     */
    
    @Override
    public void apagar() {
        
        System.out.println("Enfriando motores");
        
        super.apagar(); 
    }
 
    /**
     * 
     * Geters y Setters
     */

    public String getMyEngineCount() {
        return myEngineCount;
    }

    public void setMyEngineCount(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }
    
    
}
