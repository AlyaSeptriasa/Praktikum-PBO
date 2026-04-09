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
public class MainMahasiswaEnkapsulasi {
    public static void main (String[] args){
        
     MahasiswaEnkapsulasi pp1 = new MahasiswaEnkapsulasi();
     pp1.setNama("Alya Septriasa");
     pp1.setNim("2501083007");
     pp1.setJurusan("Teknologi Informasi");
     pp1.setUmur(19);
     pp1.setIpk(4.0);
     System.out.println();
     pp1.TampilData();
     
     
     System.out.println("Status Kelulusan: "+ pp1.StatusKelulusan());
     System.out.println("\nObjek 2 menggunakan constructor 2");
     MahasiswaEnkapsulasi pp2 = new MahasiswaEnkapsulasi ("Alya Septriasa","2501083007",
     "Teknologi Informasi",19,4.0);
     System.out.println();
     pp2.TampilData();
     
     
     System.out.println("Status Kelulusan: "+ pp2.StatusKelulusan());
     Scanner input = new Scanner (System.in);
     System.out.print("Masukkan nama =");
     String na = input.nextLine();
     System.out.print("Masukkan nim =");
     String ni = input.nextLine();
     System.out.print("Masukkan Jurusan=");
     String jrsn = input.nextLine();
     System.out.print("Masukkan umur=");
     int umur = input.nextInt();
     System.out.print("Masukkan ipk=");
     double ipk = input.nextDouble();
     MahasiswaEnkapsulasi pp3 = new MahasiswaEnkapsulasi(na,ni,jrsn,umur,ipk);
     System.out.println();
     pp3.TampilData();
     System.out.println("Status Kelulusan: "+ pp3.StatusKelulusan());
       
    }
    
}

