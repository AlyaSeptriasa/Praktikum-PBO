/*
Nama:Alya Septriasa
 */
package Praktikum02042026;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class MainPersegiPanjang {
    public static void main(String[]args){
        // TODO code application here
        // object pp1 menggunakan constructor 1
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang= 10;
        pp1.lebar = 7;
        System.out.println("Akses method dalam main class");
        System.out.println("Luas Persegi Panjang = "+pp1.HitungLuas());
        System.out.println("Keliling Persegi Panjang = "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        
        //object pp2 menggunakan constructor 2
        System.out.println("\nObjek 2 menggunakan constructor 2");
        PersegiPanjang pp2 = new PersegiPanjang (19,10);
        System.out.println("Akses method dalam main class");
        System.out.println("Luas persegi panjang = "+pp2.HitungLuas());
        System.out.println("Keliling persegi panjang = "+pp2.HitungKel());
         
        System.out.println();
        pp2.TampilData();
                
        
        //object pp2 menggunakan constructor 2
        int p;
        int l; 
               
        System.out.print("\nPanjang dan lebar input user \n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang =");
        p = input.nextInt();
        System.out.print("Masukkan lebar =");
        l = input.nextInt();
                
        PersegiPanjang pp3 = new PersegiPanjang(p,l);
                 
        System.out.println();
        pp3.TampilData();
                               
        
    }
    
}
    

