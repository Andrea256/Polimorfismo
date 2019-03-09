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
 * Clase Skateboard que extiende de Vehicle.
 */
public class Skateboard extends Vehicle {

    private String madera;

    /**
     * Contructor con el atributo de skateboard y la herencia de vehicle.
     * @param madera Atributo de skateboard que guarda la madera.
     * @param myBrand Atributo de vehicle.
     * @param myModel Atributo de vehicle.
     */
    
    public Skateboard(String madera, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.madera = madera;
    }
    
    /**
     * Metodo que sobre escribe el de la clase padre.
     */
    
    @Override
    public void printType() {
        System.out.println("Soy Skateboard ");
    }

    /**
     * 
     * Getters y Setters.
     */
    
    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

}
