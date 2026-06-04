/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public abstract class Pembayaran {
   protected double jumlahBayar;
   protected String idTransaksi;

    public Pembayaran() {
    }
   
    public Pembayaran(double jumlahBayar, String idTransaksi) {
        this.jumlahBayar = jumlahBayar;
        this.idTransaksi = idTransaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    // Konep Polymorpishm
    // Abstrack method
    public abstract void prosesPembayaran();
    
    


   
    
   
           
           
           
           
           
           
}
