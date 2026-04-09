/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum090406;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {
    public static void main(String[]args){
        // TODO code application here
        
        // object pp1 menggunakan constructor 1
        System.out.println("Akses method dalam main class");
        System.out.println("Objek 1 menggunakan constructor 1");
        System.out.print("\njumlah Objek=" +PersegiPanjangEnkapsulasi.getjumlahObjek());
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setLebar (7);
        System.out.println("\nLuas Persegi Panjang\t\t= "+pp1.HitungLuas());
        System.out.println("Keliling Persegi Panjang\t= "+pp1.HitungKel());
        pp1.TampilData();
        System.out.println();
        
        //object pp2 menggunakan constructor 2
        System.out.print("\nAkses method dalam main class");
        System.out.println("Objek 2 menggunakan constructor 2");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi (19,10);
        System.out.println("Akses method dalam main class");
        System.out.println("Luas persegi panjang\t\t= "+pp2.HitungLuas());
        System.out.println("Keliling persegi panjang\t = "+pp2.HitungKel());
        pp2.TampilData();
        System.out.println();
               
         //object pp3 menggunakan constructor 3
        System.out.print("\nAkses method dalam main class");
        System.out.print("\nobjek 3 menggunakan kontruktor 3");
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan panjang\t=");
        int p = input.nextInt();
        System.out.print("\nMasukkan lebar\t\t=");
        int l = input.nextInt();     
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(p,l);      
        pp3.TampilData();
      System.out.print("\njumlah Objek=" +PersegiPanjangEnkapsulasi.getjumlahObjek());  
                               
}
}
