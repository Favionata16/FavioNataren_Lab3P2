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
public class Casas extends Bienes {

    int numCasas;

    public Casas(String direc, int dimension, int id, int numCasas) {
        super(direc, dimension, id);
        this.numCasas = numCasas;
    }

    @Override
    public void imprimir() {
        System.out.println("\n-----Casa-----"
                + "\nDireccion: " + direc
                + "\nDimension: " + dimension
                + "\nid: " + id
                + "\nNum: " + numCasas);
    }
    
    

}
