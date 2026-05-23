/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class MainKaryawan {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Karyawan Karyawan = null;
        System.out.println("--- Penggajian Karyawan---- ");
      
      System.out.print("Masukkan Nama :");
      String nama =input.nextLine();
      
      System.out.print("Masukkan Nik :");
      String nik = input.nextLine();
      
      System.out.println("Pilihan Divisi");
      System.out.println("1.Karyawan Tetap");
      System.out.println("2.Karyawan Kontrak");
      int pil = input.nextInt();
       
      switch(pil){
          case 1 -> {
              System.out.println("Karyawan Tetap:");
              System.out.print("Masukkan golongan :");
              int golongan= input.nextInt();
              Karyawan = new KaryawanTetap(golongan,nama,nik);
            }
          case 2 -> {
              System.out.println("Karyawan Kontrak");
              Karyawan = new KaryawanKontrak(nama,nik);
            }
          default -> System.out.println("Pilihan tidak tersedia");     
      }
     
      System.out.println(" Gaji Karyawan");
     Karyawan.TampilkanData();
      
    }
}