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
public class Residencial {
    private String nombre;
    ArrayList <Casa> casas=new ArrayList();
    ArrayList <Edificio> edificio = new ArrayList();

    public Residencial() {
    }

    public Residencial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    public ArrayList<Edificio> getEdificio() {
        return edificio;
    }

    public void setEdificio(ArrayList<Edificio> edificio) {
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "Residencial{" + "nombre=" + nombre + ", casa=" + casas + ", edificio=" + edificio + '}';
    }
    
    
}
