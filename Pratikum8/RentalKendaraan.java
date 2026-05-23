/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public abstract class RentalKendaraan {
  protected String noPolisi;
  protected double biayabensin;
  protected int lamarental; 
  
  
     public RentalKendaraan(){   
   }

    public RentalKendaraan(String noPolisi, double biayabensin, int lamarental) {
        this.noPolisi = noPolisi;
        this.biayabensin = biayabensin;
        this.lamarental = lamarental;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public double getbiayabensin() {
        return biayabensin;
    }

    public void setbiayabensin(double biayabensin) {
        this.biayabensin = biayabensin;
    }

    public int getLamarental() {
        return lamarental;
    }

    public void setLamarental(int lamarental) {
        this.lamarental = lamarental;
    }
     
     
    
    
}
