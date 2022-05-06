/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elbal
 */
public class procesos {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Casas> casaLista = new ArrayList<Casas>();
    ArrayList<Edificio> edificioLista = new ArrayList<Edificio>();

    public static void main(String[] args) {
        procesos proceso = new procesos();

        proceso.registrarCasas();
        proceso.registrarEdificios();
        proceso.imprimirTodos();
        

    }

    public void registrarCasas() {
        System.out.print("Ingrese numero De casa: ");
        int num = leer.nextInt();
        if (numCasas(num) == null) {
            /*System.out.print("Dimension: ");
            int d = leer.nextInt();
            System.out.print("id: ");
            int id= leer.nextInt();*/

            casaLista.add(new Casas("En choloma", 1233, 22141210, num));
        } else {
            System.out.println("El nombre científico ingresado no es único. No se puede registrar");
        }

    }

    public void registrarEdificios() {
        System.out.print("nombre: ");
        String name = leer.next();
        if (nombre(name) == null) {
            /*System.out.print("Dimension: ");
            int d = leer.nextInt();
            System.out.print("id: ");
            int id= leer.nextInt();*/

            edificioLista.add(new Edificio("En choloma", 1233, 22141210, 4, name));
        } else {
            System.out.println("El nombre científico ingresado no es único. No se puede registrar");
        }

    }

    public Casas numCasas(int num) {
        for (Casas casa : casaLista) {
            if (casa.numCasas == num) //Retornar animal porque ya existe ese nombre
            {
                return casa;
            }
        }
        //Si no existe el nombre, retornar null
        return null;
    }

    public Edificio nombre(String name) {
        for (Edificio edificio : edificioLista) {
            if (edificio.nombre.equals(name)) //Retornar animal porque ya existe ese nombre
            {
                return edificio;
            }
        }
        //Si no existe el nombre, retornar null
        return null;
    }

    public void imprimirTodos() {
        for (Casas animal : casaLista) {
            animal.imprimir();
        }
        for (Edificio animal : edificioLista) {
            animal.imprimir();
        }
    }
}
