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
 */
public class Types {
    
    /**
     * Crea la lista de Vehicle.
     */
    public List<Vehicle> listVehicle = new ArrayList<>();
    //public List<PoweredVehicle> listPoweredVehicle = new ArrayList<>();

    /**
     * Metodo que llena la lista usando polimorfismo.
     */
    public void data(){
        
        Vehicle bicy1 = new Bicycle("Cromo fucsia", "BMC", "Cross");
        Vehicle bicy2 = new Bicycle("Cromo verde", "GW", "Todo terreno");
        Vehicle skate1 = new Skateboard("Roble", "Powell", "Long board");
        Vehicle skate2 = new Skateboard("Pino", "Element", "Penni");
        Vehicle jet1 = new Jet("3 ", "Diesel", "Boeing", "777");
        Vehicle jet2= new Jet("2", "Corriente", "Airbus", "A340");
        Vehicle car1 = new Car("4", "Gas", "Ford", "Focus");
        Vehicle car2 = new Car("2", "Electrico", "Checrolet", "Sail");
        

        listVehicle.add(bicy1);
        //listVehicle.add(bicy2);
        listVehicle.add(skate1);
        //listVehicle.add(skate2);
        listVehicle.add(jet1);
        //listVehicle.add(jet2);
        listVehicle.add(car1);
        //listVehicle.add(car2);
        
        
    }
    
    /**
     * Metodo recorre la lista Vehicle y aplica instanceof 
     * para saber el elemento de la lista a que clase pertenece;
     * Para despues llamar los metodos e imprimirlos.
     */
    
    public void Print(){
        
        data();
        
        for(Vehicle tempVehicle : listVehicle){
            
            if (tempVehicle instanceof Bicycle){
                
                System.out.println("\n");
                ((Bicycle)tempVehicle).printType();
                //((Bicycle)tempVehicle).getCromatico();
                System.out.println(((Bicycle) tempVehicle).getCromatico());
            }
            else if (tempVehicle instanceof Skateboard){
                
                System.out.println("\n");
                Skateboard skt = (Skateboard)tempVehicle;
                skt.printType();
                System.out.println("Madera: " + skt.getMadera());
                
            }            
            else if(tempVehicle instanceof Car){
                System.out.println("\n");
                ((Car)tempVehicle).printType();
                ((Car)tempVehicle).puertas();
                System.out.println("Tiene: " + ((Car)tempVehicle).getPuertas() +" puertas");
                ((Car)tempVehicle).encender();
                ((Car)tempVehicle).apagar();
                
            }
            else if (tempVehicle instanceof Jet){
                System.out.println("\n");
                Jet jt = (Jet)tempVehicle;
                jt.printType();
                jt.recMoto();
                System.out.println("Tiene " +jt.getMyEngineCount()+ "motores");
                jt.encender();
                jt.apagar();
                
            }
             
        }
        
    }
    
}       
 

