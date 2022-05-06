/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FavioNataren_LabP2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author favio
 */
public class main {

    public static void main(String[] args) {
        ArrayList compradores = new ArrayList();
        Residencial r = new Residencial();
        Edificio e = new Edificio();
        Scanner lea = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("----Menu----"
                    + "\n0-Salida"
                    + "\n1-Agregar Casa"
                    + "\n2-Agregar Edificio"
                    + "\n3-Agregar Apartamneto"
                    + "\n4-Modificar Casa"
                    + "\n5-Modificar Edificio"
                    + "\n6-Modificar Apartamentos"
                    + "\n7-Listar Casas"
                    + "\n8-Listar Edificio"
                    + "\n9-Listar Apartamentos"
                    + "\n10-Eliminar Casas"
                    + "\n11-Eliminar Edificios"
                    + "\n12-Eliminar Apartamentos"
                    + "\n13-Agregar Compradores"
                    + "\n14-Agregar Residenciales");
            System.out.println("Ingrese opcion: ");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese la posicion de la casa: ");
                    int pos = lea.nextInt();
                    System.out.println("Ingrese la Identidad de la casa: ");
                    int id = lea.nextInt();
                    System.out.println("Ingrese el numero de casa: ");
                    int num = lea.nextInt();
                    System.out.println("Ingrese la Direccion: ");
                    String dir = lea.next();
                    System.out.println("Ingrese la referencia: ");
                    String ref = lea.next();
                    r.getCasas().add(new Casa(num, ref, dir, id));
                }
                break;
                case 2: {
                    System.out.println("Ingrese la Cantidad de locales: ");
                    int loc = lea.nextInt();
                    System.out.println("Ingrese el nombre:");
                    String nom = lea.next();
                    System.out.println("Ingrese la dirreccion del edificio: ");
                    String dir = lea.next();
                    System.out.println("Ingrese el id del edificio: ");
                    int id = lea.nextInt();
                    r.getEdificio().add(new Edificio(loc, nom, dir, id));
                }
                break;

                case 3: {
                    System.out.println("Ingrese la posicion de el dificio al cual pertenece al apartamento: ");
                    int pos = lea.nextInt();
                    System.out.println("ingrese el numero de apartamento: ");
                    int numlocal = lea.nextInt();
                    System.out.println("Ingrese la dirreccion del apartamento: ");
                    String dir = lea.next();
                    System.out.println("Ingrese la referencia del apartamento: ");
                    String ref = lea.next();
                    System.out.println("Ingrese el id del apartamento: ");
                    int id = lea.nextInt();
                    r.getEdificio().get(pos).getAparts().add(new Apartamento(numlocal, ref, dir, id));
                }
                break;
                case 4: {
                    System.out.println("Ingrese la posicion de la casa a modificar: ");
                    int pos = lea.nextInt();
                    System.out.println("Ingrese la Identidad de la casa: ");
                    int id = lea.nextInt();
                    r.getCasas().get(pos).setId(pos);
                    System.out.println("Ingrese el numero de casa: ");
                    int num = lea.nextInt();
                    r.getCasas().get(pos).setNumerocasa(num);
                    System.out.println("Ingrese la Direccion: ");
                    String dir = lea.next();
                    r.getCasas().get(pos).setDirrecion(dir);
                    System.out.println("Ingrese la referencia: ");
                    String ref = lea.next();
                    r.getCasas().get(pos).setReferencia(ref);
                }
                break;
                case 5: {
                    System.out.println("Ingrese la posicion de la casa a modificar: ");
                    int pos = lea.nextInt();
                    System.out.println("Ingrese la Cantidad de locales: ");
                    int loc = lea.nextInt();
                    r.getEdificio().get(pos).setCantidadlocales(loc);
                    System.out.println("Ingrese el nombre:");
                    String nom = lea.next();
                    r.getEdificio().get(pos).setNombre(nom);
                    System.out.println("Ingrese la dirreccion del edificio: ");
                    String dir = lea.next();
                    r.getEdificio().get(loc).setDirrecion(dir);
                    System.out.println("Ingrese el id del edificio: ");
                    int id = lea.nextInt();
                    r.getEdificio().get(pos).setId(id);
                }
                break;
                case 6: {
                    System.out.println("Ingrese la posicion de el dificio al cual pertenece al apartamento: ");
                    int posedi = lea.nextInt();
                    System.out.println("Ingrese la posicion del Apartamento: ");
                    int pos = lea.nextInt();
                    System.out.println("ingrese el numero de apartamento: ");
                    int numlocal = lea.nextInt();
                    r.getEdificio().get(posedi).getAparts().get(pos).setNumerolocal(numlocal);
                    System.out.println("Ingrese la dirreccion del apartamento: ");
                    String dir = lea.next();
                    r.getEdificio().get(posedi).getAparts().get(pos).setDirrecion(dir);
                    System.out.println("Ingrese la referencia del apartamento: ");
                    String ref = lea.next();
                    r.getEdificio().get(posedi).getAparts().get(pos).setReferencia(ref);
                    System.out.println("Ingrese el id del apartamento: ");
                    int id = lea.nextInt();
                    r.getEdificio().get(posedi).getAparts().get(pos).setId(id);
                }
                break;
                case 7: {

                }
                break;
                case 8: {
                    for (int i = 0; i < r.getEdificio().size(); i++) {
                        System.out.println(r.edificio);
                    }
                }
                break;
                case 9: {
                    for (int i = 0; i < e.getAparts().size(); i++) {
                        System.out.println(r.getEdificio().get(i).getAparts());
                    }
                }
                break;
                case 10: {
                    System.out.println("Ingrese la posicion de la casa a eliminar: ");
                    int pos = lea.nextInt();
                    r.getCasas().remove(pos);
                }
                break;
                case 11: {
                    System.out.println("Ingrese la posicion de el edificio a eliminar: ");
                    int pos = lea.nextInt();
                    r.getEdificio().remove(pos);
                }
                break;
                case 12: {

                }
                break;
                case 13: {
                    System.out.println("Ingrese la posicion del edifcio del apartamento: ");
                    int pos = lea.nextInt();
                    System.out.println("Ingrese la posicion del apartamento a eliminar: ");
                    int posedi = lea.nextInt();
                    r.getEdificio().get(pos).getAparts().remove(posedi);
                }
                break;
                case 14: {
                    String nombre = lea.next();
                    r.setNombre(nombre);
                }
                break;
                default:
                    System.out.println("opcion incorrecta o no es un entero!\n");
                    break;

            }

        } while (opcion != 0);
    }

}
