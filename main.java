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
        ArrayList<Cliente> compradores = new ArrayList();
        Residencial r = new Residencial();
        Edificio e = new Edificio();
        Scanner lea = new Scanner(System.in);
        int opcion = 69;

        do {
            System.out.println("\n----Menu----"
                    + "\nOpciones disponibles:"
                    + "\n0 .Salida"
                    + "\n1 .Agregar Casa"
                    + "\n2 .Agregar Edificio"
                    + "\n3 .Agregar Apartamneto"
                    + "\n4 .Modificar Casa"
                    + "\n5 .Modificar Edificio"
                    + "\n6 .Modificar Apartamentos"
                    + "\n7 .Listar Casas"
                    + "\n8 .Listar Edificio"
                    + "\n9 .Listar Apartamentos"
                    + "\n10.Eliminar Casas"
                    + "\n11.Eliminar Edificios"
                    + "\n12.Eliminar Apartamentos"
                    + "\n13.Agregar Compradores"
                    + "\n14.Agregar Residenciales"
                    + "\n15.Simulacion Venta"
                    + "\nseleccione una opcion: ");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese la Identidad de la casa: ");
                    int id = lea.nextInt();
                    System.out.println("Ingrese el numero de casa: ");
                    int num = lea.nextInt();
                    System.out.println("Ingrese la Direccion: ");
                    String dir = lea.next();
                    lea.nextLine();
                    System.out.println("Ingrese la referencia: ");
                    String ref = lea.next();
                    r.getCasas().add(new Casa(num, ref, dir, id));
                }
                break;
                case 2: {
                    System.out.println("Ingrese la Cantidad de locales: ");
                    int numloc = lea.nextInt();
                    System.out.println("Ingrese el nombre:");
                    String nom = lea.next();
                    lea.nextLine();
                    System.out.println("Ingrese la dirreccion del edificio: ");
                    String dir = lea.next();
                    System.out.println("Ingrese el id del edificio: ");
                    int id = lea.nextInt();
                    r.getEdificio().add(new Edificio(numloc, nom, dir, id));
                }
                break;
                case 3: {
                    System.out.println("Ingrese la posicion de el dificio al cual pertenece al apartamento: ");
                    int pos = lea.nextInt();
                    System.out.println("ingrese el numero de apartamento: ");
                    int numlocal = lea.nextInt();
                    System.out.println("Ingrese la dirreccion del apartamento: ");
                    String dir = lea.next();
                    lea.nextLine();
                    System.out.println("Ingrese la referencia del apartamento: ");
                    String ref = lea.nextLine();
                    System.out.println("Ingrese el id del apartamento: ");
                    int id = lea.nextInt();
                    r.getEdificio().get(pos).getAparts().add(new Apartamento(numlocal, ref, dir, id));
                }
                break;
                case 4: {
                    System.out.println("Ingrese la posicion de la casa a modificar: ");
                    int pos = lea.nextInt();
                    r.getCasas().get(pos).setId(pos);
                    System.out.println("Ingrese el numero de casa: ");
                    int num = lea.nextInt();
                    r.getCasas().get(pos).setNumerocasa(num);
                    System.out.println("Ingrese la Direccion: ");
                    String dir = lea.next();
                    r.getCasas().get(pos).setDirrecion(dir);
                    System.out.println("Ingrese la referencia: ");
                    String ref = lea.nextLine();
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
                    for (int i = 0; i < r.getCasas().size(); i++) {
                        System.out.println(r.casas);
                    }
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
                    System.out.println("Ingrese la posicion del edifcio del apartamento: ");
                    int pos = lea.nextInt();
                    System.out.println("Ingrese la posicion del apartamento a eliminar: ");
                    int posedi = lea.nextInt();
                    r.getEdificio().get(pos).getAparts().remove(posedi);
                }
                break;
                case 13: {
                    System.out.println("Ingrese su Nombre: ");
                    String nom = lea.next();
                    System.out.println("Ingrese la edad: ");
                    int edad = lea.nextInt();
                    System.out.println("Ingrese su id: ");
                    int id = lea.nextInt();
                    System.out.println("Ingrese su Usuario: ");
                    String usuario = lea.next();
                    System.out.println("Ingrese su password");
                    String password = lea.next();
                    compradores.add(new Cliente(nom, edad, id, usuario, password));
                }
                break;
                case 14: {
                    String nombre = lea.next();
                    r.setNombre(nombre);
                }
                break;
                case 15: {
                    System.out.println("Ingrese su usuario: ");
                    String user = lea.next();
                    System.out.println("Ingrese contrasena: ");
                    String pass = lea.next();
                    boolean usuariovalido = false;
                    for (Cliente comprador : compradores) {
                        if (user.equals(comprador.getUsuario()) && pass.equals(comprador.getPassword())) {
                            usuariovalido = true;
                            while (opcion != 0) {
                                System.out.println("0.salida"
                                        + "\n1.Comprar casa\n"
                                        + "\n2.Comprar edificio"
                                        + "\n3.Comprar apartamento");
                                opcion = lea.nextInt();
                                if (opcion == 1) {
                                    System.out.println("Ingrese la posicion de la casa que desea comprar: ");
                                    int pos = lea.nextInt();
                                    comprador.getPropiedad().add(r.getCasas().get(pos));
                                }
                                if (opcion == 2) {
                                    System.out.println("Ingrese la posicion de el edificio que desea comprar: ");
                                    int pos = lea.nextInt();
                                    comprador.getPropiedad().add(r.getEdificio().get(pos));
                                }
                                if (opcion == 3) {
                                    System.out.println("Ingrese la posicion de el edifico que desea comprar: ");
                                    int pos = lea.nextInt();
                                    System.out.println("Ingrese la posicion del apartamento que desea comprar: ");
                                    int posapr = lea.nextInt();
                                    comprador.getPropiedad().add(r.getEdificio().get(pos).getAparts().get(posapr));
                                }
                            }
                            break;
                        }
                    }
                    System.out.println("Usuario No encontrado o Password Incorrecta");
                }
                break;
                default:
                    System.out.println("opcion incorrecta o no es un entero!\n");
                    break;

            }
        } while (opcion != 5);


    }

}
