/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author Aldy
 */
public class BolaBaseball {
    private double massa;
    private int kecepatan;
    
    public BolaBaseball(double massa, int kecepatan){
        this.massa = massa;
        this.kecepatan = kecepatan;
    }
    
    public double getMassa(){
        return massa;
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    private double convertGram(double massa){
    return massa/1000;
}
    private double hitungEnergiK(double massa, int kecepatan){
        return 0.5 * (convertGram(massa) * Math.pow(kecepatan, 2));
    }
    
        private double hitungUsaha(double massa, int kecepatan){
        double eAwal = 0;
        double eAkhir = hitungEnergiK(massa, kecepatan);
        return (eAkhir - eAwal);
    }
        
        public void tampil(double massa, int kecepatan){
        System.out.println("=====Program Hitung Energi Kinetik dan Usaha=====");
        System.out.println("Massa : " + massa);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println();
        System.out.printf("Energi Kinetik : %.3f joule \n",  hitungEnergiK(massa, kecepatan));
        System.out.printf("Usaha : %.3f joule \n", hitungUsaha(massa, kecepatan));
    }
}
