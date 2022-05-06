/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg;

/**
 *
 * @author elbal
 */
public class Bienes {
    
    //Atributos
    protected String direc;
    protected int dimension,id;
    
    //Constructor

    public Bienes(String direc, int dimension, int id) {
        this.direc = direc;
        this.dimension = dimension;
        this.id = id;
    }
    
    
    //Funciones
    
    //Función para imprimir los atributos
    public void imprimir(){
        System.out.println("direc: "+direc+
                "\nDimension: "+dimension+
                "\nId: "+id);
    }
    
    
}
