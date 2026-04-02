/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum02042026;

/**
 *
 * @author alyas
 */
public class Mahasiswa {
    String nama;
    String nobp;  
    double tugas = 0;
    double uts = 0;
    double uas = 0;
    
    Mahasiswa(){
        
    }
     Mahasiswa(double us, double ut, double tgs){
        uas=us;
        uts=ut;
        tugas=tgs;
    }
    double HitungNilaiAkhir(){
        return( (uas*0.40)+(uts*0.35)+(tugas*0.25));
    }
     void TampilData(){
        System.out.println("Nilai Uas =" +uas);
        System.out.println("Nilai uts =" +uts);
        System.out.println("Nilai Tugas =" +tugas);
        System.out.println("Nilai Akhir =" +HitungNilaiAkhir());
        
    }
    
}

