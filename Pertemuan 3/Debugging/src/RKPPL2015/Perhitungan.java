/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RKPPL2015;

/**
 *
 * @author SB 604 -08
 */
public class Perhitungan {

    public int pertambahan(int angka) {
        if (angka <= 0) {
            return angka;
        } else if (angka >= 10) {
            return angka - 10;
        } else {
            return angka + 5;
        }
    }
    
    public static void main(String[] args) {
        Perhitungan p = new Perhitungan();
        System.out.println(p.pertambahan(5));
    }
}
