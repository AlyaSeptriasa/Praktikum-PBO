/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author alyas
 */
public class MainHewan {
    public static void main (String[] args){
        
        Hewan hewanUmum = new Hewan ("Makhluk");
        Kucing kucingku = new Kucing ("bubu");
        Anjing anjingku = new Anjing ("bobo");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        System.out.println();
        
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
        System.out.println();
        
                
    }
}
