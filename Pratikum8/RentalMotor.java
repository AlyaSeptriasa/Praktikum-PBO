/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public class RentalMotor extends RentalKendaraan {
     private double sewaMotor;

    public RentalMotor() {
    }

    public RentalMotor(double sewaMotor, String noPolisi, double biayabensin, int lamarental) {
        super(noPolisi, biayabensin, lamarental);
        this.sewaMotor = sewaMotor;
    }

    
    public double getSewaMotor() {
        return sewaMotor;
    }

    public void setSewaMotor(double sewaMotor) {
        this.sewaMotor = sewaMotor;
    }
    
    
     public void TampilkanData(){
         double totalBayar =sewaMotor * lamarental + biayabensin;
         if(lamarental >= 15){
         totalBayar -= 0.10 * totalBayar;
         }
         else if(lamarental >=10){
         totalBayar -= 0.05 * totalBayar;
         }
         else{
           System.out.println("Tidak ada diskon");

         }
         System.out.println("No Polisi                  :"+noPolisi);
         System.out.println("lama rental                :"+lamarental);
         System.out.println("Biaya bensin               :"+biayabensin);
         System.out.println("Total Bayar rental mobil   :"+totalBayar);
    
     }
    
}