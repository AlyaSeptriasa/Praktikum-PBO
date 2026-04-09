/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum090406;

/**
 *
 * @author alyas
 */
public class MahasiswaEnkapsulasi {
    //atribbut variabel
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk=0;
    
    //constructor kosong
    MahasiswaEnkapsulasi(){
    }
    
    //constructor 1
    MahasiswaEnkapsulasi(String na, String ni){
        nama=na;
        nim=ni;
    }
            
    //constructor 2
    MahasiswaEnkapsulasi(String na, String ni, String jrsn, int umr, double ip){
        nama=na;
        nim=ni;
        jurusan=jrsn;
        umur=umr;
        ipk=ip;
    }
     
    //GETTR\SETTER
    public String getNama(){
        return nama;
    }
    public void setNama(String na){
        this.nama= na;
    }
    public String getNim(){
        return nim ;
    }
    public void setNim(String ni){
        this.nim= ni;
    }
    public String getJurusan(){
        return jurusan ;
    }
    public void setJurusan(String jrsn){
        this.jurusan= jrsn;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umr){
        this.umur= umr;
    }
    public double getIpk(){
        return ipk;
    }
    public void setIpk(double ip){
        this.ipk= ip;
    }
      
    // method tanpa kembalian
    void TampilData(){
        System.out.println("Nama Mahasiswa=" +nama);
        System.out.println("NIM Mahasiswa=" +nim);
        System.out.println("Jurusan Mahasiswa=" +jurusan);
        System.out.println("Umur Mahasiswa=" +umur);
        System.out.println("ipk Mahasiswa=" +ipk);
                      
    }
    public String StatusKelulusan(){
        if(ipk >=2.75){
            return("lulus");           
        }
        else{
            return("tidak lulus");
        }
    }
}

    



