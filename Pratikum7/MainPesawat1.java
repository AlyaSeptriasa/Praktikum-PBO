/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author alyas
 */
public class MainPesawat1 {
    public static void main (String[] args){
        //membuat array pesawat
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        //mengisi elemen array
        daftarPesawat[0] = new Pesawat("Boeing 737", 2015,true,180);
        daftarPesawat[1] = new Pesawat("Airbus A320", 2020,true,140);
        daftarPesawat[2]= new Pesawat ("Cessna 172", 2008,false,4);
        
        //Menampilkan semua data pesawat
        for (int i = 0; i < daftarPesawat.length; i++){
            System.out.println("===Data Pesawat ke-"+(i+1)+"===");
            daftarPesawat[i].cetak();
            System.out.println();
        }
        
        
    }
    
}
