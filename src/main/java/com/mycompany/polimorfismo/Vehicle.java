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
 * Clase padre de PoweredVehicle, Bicycle, Skateboard.
 */

public abstract class  Vehicle {
    
    private String myBrand;
    private String myModel;

    /**
     * Constructor con los atributos de Vehicle.
     * @param myBrand Atributo de vehicle que guarda la marca.
     * @param myModel Atributo de vehicle que guarda el modelo.
     */

    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
    }
    
    /**
     * Metodo printType de la clase vehicle.
     */
    
    public void printType(){
        System.out.println("Padre vehicle");
    }

    /**
     * 
     * Getters y Setters. 
     */
    
    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
    
}
