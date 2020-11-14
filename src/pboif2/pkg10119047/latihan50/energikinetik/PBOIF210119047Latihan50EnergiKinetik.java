/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan50.energikinetik;
import data.BolaBaseball;

/**
 *
 * @author Aldy
 */
public class PBOIF210119047Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BolaBaseball energiKinetik = new BolaBaseball(145, 25);
        
        energiKinetik.tampil(energiKinetik.getMassa(), energiKinetik.getKecepatan());
    }
    
}
