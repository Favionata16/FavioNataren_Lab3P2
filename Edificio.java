/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FavioNataren_LabP2;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Edificio extends BienesRaices {
    private int cantidadlocales;
    private String nombre;
    private ArrayList <Apartamento> aparts=new ArrayList();

    public Edificio() {
    }

    public Edificio(int cantidadlocales, String nombre, String dirrecion, int id) {
        super(dirrecion, id);
        this.cantidadlocales = cantidadlocales;
        this.nombre = nombre;
    }

    public int getCantidadlocales() {
        return cantidadlocales;
    }

    public void setCantidadlocales(int cantidadlocales) {
        this.cantidadlocales = cantidadlocales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Apartamento> getAparts() {
        return aparts;
    }

    public void setAparts(ArrayList<Apartamento> aparts) {
        this.aparts = aparts;
    }

    @Override
    public String toString() {
        return "Edificio{" + "cantidadlocales=" + cantidadlocales + ", nombre=" + nombre + ", aparts=" + aparts + '}';
    }
    
}
