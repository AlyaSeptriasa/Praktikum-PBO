/*
 Nama:Alya Septriasa
 kelas: tekom1B
 */
package Praktikum04062026;

/**
 *
 * @author alyas
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

   
    

    @Override
    public void mainkan() {
        System.out.println(nama+ "Dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem() {
       System.out.println("Keyboard" +nama+"di stem digital dengan aplikasi");
    }

    @Override
    public void nyalakan() {
       if(cekListrik()){
        System.out.println(nama+"dinyalakan.");
    }
       else{
           System.out.println(nama+"tidak bisa nyala karena tidak ada ");
       }
    }

    @Override
    public void matikan() {
        System.out.println(nama+ "dimatikan");
    }

    @Override
    public boolean cekListrik() {
       return dayaTersambung;
    }
    
}
