/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum06112026;

import java.util.Scanner;


/**
 *
 * @author alyas
 */

public class CekThrows {
    //method exception
    public static void cekAngka(int a)throws Exception{
        //body throw
        if(a<0){
            throw new Exception("nilai tidak boleh negatif");
    }else if(a>100){
    throw new Exception("nilai tidak boleh melebihi 100");
    }
  }
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan sebuah angka");
        int angka = in.nextInt();
        try{
            cekAngka(angka);
            System.out.println("Nilai berhasil disimpan!");   
        }catch (Exception ex){
            System.out.println("Error"+ex.getMessage());
        }
    }
    
}
