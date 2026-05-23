/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public class RentalBus extends RentalKendaraan {
    private int muatanbus;
    private double rentalbus;

    public RentalBus(int muatanbus, double rentalbus, String noPolisi, double biayabensin, int lamarental) {
        super(noPolisi, biayabensin, lamarental);
        this.muatanbus = muatanbus;
        this.rentalbus = rentalbus;
    }

    public int getMuatanbus() {
        return muatanbus;
    }

    public void setMuatanbus(int muatanbus) {
        this.muatanbus = muatanbus;
    }

    public double getRentalbus() {
        return rentalbus;
    }

    public void setRentalbus(double rentalbus) {
        this.rentalbus = rentalbus;
    }
    
    public void TampilkanData(){
        double totalBayar = rentalbus * lamarental+biayabensin;
        if(muatanbus >= 25){
        totalBayar += 650000;
        }
        else if(muatanbus <= 25){
        totalBayar += 500000;
        }
        else{
          totalBayar  += 50000;
        }
        System.out.println("No Polisi                   :"+noPolisi);
        System.out.println("Muatan Bus                  :"+muatanbus);
        System.out.println("Harga Rental bus            :"+rentalbus);
         System.out.println("lama rental                :"+lamarental);
         System.out.println("Biaya bensin               :"+biayabensin);
         System.out.println("Total Bayar rental Bus      :"+totalBayar);
    
    }
    

    
}
