/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FavioNataren_LabP2;

/**
 *
 * @author dcasc
 */
public class Casa extends BienesRaices {
    private int numerocasa;
    private String referencia;

    public Casa() {
    }

    public Casa(int numerocasa, String referencia, String dirrecion, int id) {
        super(dirrecion, id);
        this.numerocasa = numerocasa;
        this.referencia = referencia;
    }

    public int getNumerocasa() {
        return numerocasa;
    }

    public void setNumerocasa(int numerocasa) {
        this.numerocasa = numerocasa;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Casa{" + "numerocasa=" + numerocasa + ", referencia=" + referencia + '}';
    }
    
}
