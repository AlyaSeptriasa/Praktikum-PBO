/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author alyas
 */
public class Udara extends Kendaraan {
    public static void main (String[] args){
    } 
     private boolean mesin;
     
     public boolean getMesin(){
         return mesin;
     }
     public void setMesin(boolean mesin){
         this.mesin=mesin;
     }
     public Udara(){
         super();
     }
     public Udara(String nama, int tahunproduksi, boolean mesin){
         super(nama,tahunproduksi);
         this.mesin=mesin;     
     }
    @Override
     public void cetak(){
         super.cetak();
         System.out.println("menggunakan mesin:"+(mesin? "Ya":"Tidak"));
     }
}
