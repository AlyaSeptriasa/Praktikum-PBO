/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author alyas
 */
public class Hewan  {
    protected String nama;
    
    public Hewan(String nama){
        this.nama=nama;
    }
    public void bersuara(){
        System.out.println("Hewan bersuara...");
    }
    
    public void tampilkanNama(){
        System.out.println("Nama Hewan:"+nama);
    }
    
   
    
}
