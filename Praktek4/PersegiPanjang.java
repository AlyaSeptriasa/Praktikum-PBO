/*
Nama:Alya Septriasa
 */
package Praktikum02042026;

/**
 *
 * @author alyas
 */
public class PersegiPanjang { //public = access modifier??
    //atribbut variabel
    int panjang;
    int lebar;
    
    //costructor kosong
    PersegiPanjang(){
        
    }
    
    //constructor 2 overloading
    PersegiPanjang(int p, int l){
        panjang=p;
        lebar=l;
    }
    int HitungLuas(){
        return(panjang*lebar);
    }
    int HitungKel(){
        return(2*(panjang+lebar));
    }
    // method tanpa kembalian
    void TampilData(){
        System.out.println("Panjang Persegi Panjang=" +panjang);
        System.out.println("lebar Persegi Panjang=" +lebar);
        System.out.println("Luas Persegi Panjang=" +HitungLuas());
        System.out.println("Keliling Persegi Panjang=" +HitungKel());
        
    }
}
    

