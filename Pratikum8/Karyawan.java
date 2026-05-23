/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public abstract class Karyawan {
   protected String Nik;
   protected String Nama;
   
   
   public Karyawan(){   
   }

    public Karyawan(String Nik, String Nama) {
        this.Nik = Nik;
        this.Nama = Nama;
    }

    public String getNik() {
        return Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
  
    
    public abstract void TampilkanData();
}
