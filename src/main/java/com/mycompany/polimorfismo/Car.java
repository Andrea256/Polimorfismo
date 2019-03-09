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
 * Clase Car que extiende de Powered Vehicle.
 */
public class Car extends PoweredVehicle {
    
    private String puertas;

    /**
     * Constructor de car.
     * @param puertas Atributo de car que guarda puertas.
     * @param myFuelType Atributo de powered vehicle.
     * @param myBrand Atributo de vehicle.
     * @param myModel Atributo de vehicle.
     */
    public Car(String puertas, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.puertas = puertas;
    }
    
    /**
     * Metodo puertas de la clase car.
     */
    
    public void puertas (){
        
        System.out.println("Puede tener 2 o 4 puertas");
    }
    
    /**
     * Metodo que sobre escribe el de la clase padre.
     */
    
    @Override
    public void printType() {
        System.out.println("Soy Car");
    }
    
    /**
     * Metodo que sobre escribe el metodo encerder de la interfaz intvehicle.
     */
    
    @Override
    public void encender() {
        
        System.out.println("Preparando el carro");
        super.encender(); 
    }
    
    /**
     * Metodo que sobre escribe el metodo apagar de la interfaz intvehicle.
     */

    @Override
    public void apagar() {
        
        System.out.println("Apagado en proceso");
        super.apagar(); 
    }
    
    /**
     * 
     * Getters y Setters.
     */
    
    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
    
    
}  

