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
 * Clase Bicycle que extiende de Vehicle.
 */
public class Bicycle extends Vehicle{
    
    private String cromatico;
    //public List <Bicycle> listBicycle;

    /**
     * Constructor de bicycle.
     * @param cromatico Atributo de bicycle que guarda cromatico.
     * @param myBrand Atributo de vehicle que guarda la marca.
     * @param myModel Atributo de vehicle que guarda el modelo.
     */   

    public Bicycle(String cromatico, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.cromatico = cromatico;
    }

    /**
     * Metodo que sobre escribe el de la clase padre.
     */
    
    @Override
    public void printType() {
        System.out.println("Soy una Bicycle");
    }

    /**
     * 
     * Getters y Setters. 
     */
    
    public String getCromatico() {
        return cromatico;
    }

    public void setCromatico(String cromatico) {
        this.cromatico = cromatico;
    }

}
