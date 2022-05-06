/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FavioNataren_LabP2;

/**
 *
 * @author favio
 */
public class Apartamento extends BienesRaices {
    private int numerolocal;
    private String referencia;

    public Apartamento() {
    }

    public Apartamento(int numerolocal, String referencia, String dirrecion, int id) {
        super(dirrecion, id);
        this.numerolocal = numerolocal;
        this.referencia = referencia;
    }

    public int getNumerolocal() {
        return numerolocal;
    }

    public void setNumerolocal(int numerolocal) {
        this.numerolocal = numerolocal;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "Numero de Locales:" + numerolocal + ", Referencia: " + referencia + '}';
    }
}
