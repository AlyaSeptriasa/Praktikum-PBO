/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum090406;

/**
 *
 * @author alyas
 */
public class PersegiPanjangEnkapsulasi {
    //atribbut variabel
    private int panjang;
    private int lebar;
    private static int jumlahObjek=0;
    
    PersegiPanjangEnkapsulasi(){
        jumlahObjek ++;
    }
            
    //constructor kosong
    PersegiPanjangEnkapsulasi(int p, int l){
        panjang=p;
        lebar=l;
        jumlahObjek ++;
    }
     
    //GETTR\SETTER
    public int getPanjang(){
        return panjang;
    }
    public void setPanjang(int panjangBaru){
        panjang= panjangBaru;
    }
    public int getLebar(){
        return lebar;
    }
    public void setLebar(int lebar){
        this.lebar=lebar;
    }
    public static int getjumlahObjek(){
        return jumlahObjek ;     
    }
         
        
    int HitungLuas(){
        return(panjang*lebar);
    }
    int HitungKel(){
        return(2*(panjang+lebar));
    }
    // method tanpa kembalian
    void TampilData(){
        System.out.println("Panjang Persegi Panjang\t=" +panjang);
        System.out.println("lebar Persegi Panjang\t\t=" +lebar);
        System.out.println("Luas Persegi Panjang\t\t=" +HitungLuas());
        System.out.println("Keliling Persegi Panjang\t=" +HitungKel());
        
    }
}

    

