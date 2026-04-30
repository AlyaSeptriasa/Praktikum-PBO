/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author alyas
 */
public class Kendaraan {
    private String nama;
    private int tahunproduksi;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getTahunProduksi(){
        return tahunproduksi;
    }
    public void setTahunProduksi(int tahunproduksi){
        this.tahunproduksi=tahunproduksi;
    }
    public Kendaraan(){
        
    }
     public Kendaraan(String nama, int tahunproduksi){
         this.nama=nama;
         this.tahunproduksi=tahunproduksi;
     }   
     public void cetak(){
         System.out.println("Nama kendaraan"+nama);
         System.out.println("Tahun Produksi"+tahunproduksi);
     }
}
