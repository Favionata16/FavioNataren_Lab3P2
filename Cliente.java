/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FavioNataren_LabP2;

import java.util.ArrayList;

/**
 *
 * @author favio
 */
public class Cliente {

    private String nombre;
    private int edad;
    private int id;
    private String usuario;
    private String password;
    private ArrayList propiedad = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, int edad, int id, String usuario, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(ArrayList propiedad) {
        this.propiedad = propiedad;
    }

}
