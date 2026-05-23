/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public class KaryawanTetap extends Karyawan{
    private int golongan;
    private double tunjangan;
    private double gajipokok;
    
    public KaryawanTetap(){
        
    }

    public KaryawanTetap(int golongan, String Nik, String Nama) {
        super(Nik, Nama);
        this.golongan = golongan;
      
    }

        

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }
          

    @Override
    public void TampilkanData() {
        switch(golongan){
           case 1:
               gajipokok = 9000000;
               break;
           case 2:
               gajipokok = 7000000;
               break;
           case 3:
               gajipokok = 5000000;
               break;
              
        
        default:
        System.out.println("Golongan tidak tersedia");
       
       }
       tunjangan = 0.12 * gajipokok;
       System.out.println("Nik            :"+Nik);
       System.out.println("Nama Karyawan  :"+Nama);
       System.out.println("Golongan       :"+golongan);
       System.out.println("Gaji Pokok     :"+gajipokok);
       System.out.println("Tunjangan      :"+tunjangan);
       System.out.println("Total Gaji     :"+(gajipokok + tunjangan ));
       
    }

    
    
}