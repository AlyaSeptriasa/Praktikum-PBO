/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
   public class KaryawanKontrak extends Karyawan{
    private double uangMakan = 300000;
    
    public KaryawanKontrak(){
        
    }

    public KaryawanKontrak( String Nik, String Nama) {
        super(Nik, Nama);
    }

    public double getuangMakan() {
        return uangMakan;
    }

    public void setuangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }
    

    @Override
    public void TampilkanData() {
        System.out.println("Nik        :"+Nik);
        System.out.println("Nama       :"+Nama);
        System.out.println("uangMakan  :"+uangMakan);     
        
     
    }

    
}
