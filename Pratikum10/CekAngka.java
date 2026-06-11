/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum06112026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alyas
 */
public class CekAngka {
    public static void main(String[]args){
        //todo code application ligic here
        Scanner input = new Scanner(System.in);
        int a,b;
        int hasil;
        //percobaan try
        try{  
        System.out.println("Masukkan bilangan Pertama");
        a = input.nextInt();
        System.out.println("Masukkan bilangan Kedua");
        b = input.nextInt();
        hasil = a/b;
        System.out.println(a+"/ "+b+" = "+hasil);
        //tryy:
       }catch(InputMismatchException e){
            System.out.println("Masukkan nilai berupa angka !");
        }
        catch(ArithmeticException e){
            System.out.println("Nilai ke2/ penyebut tidak boleh 0!");
        }catch(Exception e){
            System.out.println("Error tidak terduga"+e.getMessage());
        }
        finally{
            System.out.println("Pengecekan nilai selesai");
       
            
        }
        
    }
}
    