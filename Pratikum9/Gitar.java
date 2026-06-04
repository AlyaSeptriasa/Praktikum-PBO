/*
 Nama:Alya Septriasa
 kelas: tekom1B
 */
package Praktikum04062026;

/**
 *
 * @author alyas
 */
public class Gitar extends AlatMusik {
    private int jumlahsenar;

    public Gitar(int jumlahsenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahsenar = jumlahsenar;
    }
    
    

    @Override
    public void mainkan() {
        System.out.println(nama+ "dipetik dengan +"+jumlahsenar+" senar.");   
    }
    @Override
    public void stem() {
        System.out.println("Menyetem gitar +"+nama+" secara manual");
    }
    public int getJumlahsenar() {
        return jumlahsenar;
    }
    public void setJumlahsenar(int jumlahsenar) {
        this.jumlahsenar = jumlahsenar;
    }
    
    
}
