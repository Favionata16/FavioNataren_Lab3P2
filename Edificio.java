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
public class Edificio extends Bienes {

    int numLocal;
    String nombre;

    public Edificio(String direc, int dimension, int id, int numLocal, String nombre) {
        super(direc, dimension, id);
        this.numLocal = numLocal;
        this.nombre = nombre;
    }

    @Override
    public void imprimir() {
        System.out.println("\n----Edificio----"
                + "\nDireccion: " + direc
                + "\nDimension: " + dimension
                + "\nid: " + id
                + "\nNumLocal: " + numLocal
                + "\nNombre: " + nombre);
    }

}
