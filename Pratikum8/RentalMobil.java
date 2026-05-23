/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public class RentalMobil extends RentalKendaraan {
     private double uangjaminan;
     private double uangsewa;

    public RentalMobil(double uangjaminan, double uangsewa) {
        this.uangjaminan = uangjaminan;
        this.uangsewa = uangsewa;
    }

    public RentalMobil(double uangjaminan, double uangsewa, String noPolisi, double biayabensin, int lamarental) {
        super(noPolisi, biayabensin, lamarental);
        this.uangjaminan = uangjaminan;
        this.uangsewa = uangsewa;
    }

    public double getUangjaminan() {
        return uangjaminan;
    }

    public void setUangjaminan(double uangjaminan) {
        this.uangjaminan = uangjaminan;
    }

    public double getUangsewa() {
        return uangsewa;
    }

    public void setUangsewa(double uangsewa) {
        this.uangsewa = uangsewa;
    }
     
    public void TampilkanData(){
         double totalBayar = lamarental*uangsewa+uangjaminan+biayabensin;
         System.out.println("No Polisi                  :"+noPolisi);
         System.out.println("Uang Jaminan               :"+uangjaminan);
         System.out.println("lama rental                :"+lamarental);
         System.out.println("Uang Sewa perhari          :"+uangsewa);
         System.out.println("Biaya bensin               :"+biayabensin);
         System.out.println("Total Bayar rental mobil   :"+totalBayar);
    } 
     
     
    
}
