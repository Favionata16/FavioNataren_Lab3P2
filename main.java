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
public class main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Residencial proceso = new Residencial();
        int x;
        do {
            System.out.println("\nOpciones disponibles:"
                    + "\n1.crear casa"
                    + "\n2.edif"
                    + "\n3.imprimir"
                    + "\n4."
                    + "\n5."
                    + "\nseleccione una opcion: ");
            x = leer.nextInt();

            switch (x) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("adios");
                    break;
                case 5:
                    System.out.println("saliendo.....");
                    break;
                default:
                    System.out.println("opcion incorrecta o no es un entero!\n");
                    break;

            }
        } while (x != 5);
    }
    
}
