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
 * Clase Powered Vehicle que extiende de Vehicle e implementa la interface IntVehicle.
 */

public abstract class PoweredVehicle extends Vehicle implements IntVehicle{
    
    private String myFuelType; //tipo de combustible.
        
    /**
     * Contructor con el atributo de powered vehicle y la herencia de vehicle.
     * @param myFuelType Atributo de powered vehicle que guarda tipo de combustible.
     * @param myBrand Atributo de vehicle.
     * @param myModel Atributo de vehicle.
     */

    public PoweredVehicle(String myFuelType, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myFuelType = myFuelType;
    }
    
    /**
     * Metodo fuelType de la clase powered vehicle.
     */
    
    public void fuelType(){
        System.out.println("Tipo de combustible");
    }
    
    /**
     * Metodo que sobre escribe el metodo encerder de la interfaz intvehicle.
     */
    
    @Override
    public void encender(){
        System.out.println("Encendido");
    };
    
    /**
     * Metodo que sobre escribe el metodo apagar de la interfaz intvehicle.
     */
    
    @Override
    public void apagar(){
        System.out.println("Apagado");
    };

    /**
     * 
     * Getters y Setters 
     */
    
    public String getMyFuelType() {
        return myFuelType;
    }

    public void setMyFuelType(String myFuelType) {
        this.myFuelType = myFuelType;
    }
  
}


