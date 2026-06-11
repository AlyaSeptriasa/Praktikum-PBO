/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum06112026;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alyas
 */
public class CekArray {
    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        int[] angka = {10,20,30,40,50};
        try{
        System.out.print("Mau ditampilkan array indeks keberapa");
        int index =input.nextInt();
        System.out.println("Nilai array adalah = "+angka[index]);
        System.out.print("Mau dibagi berapa?");
        int n =input.nextInt();
        int hasil =angka[index]/n;
        System.out.print("Hasil pembagian = "+hasil);
        }catch(InputMismatchException e){
            System.out.println("Pastikan input berupa bilangan bulat!");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Angka pembagian tidak boleh 0!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index diluar range array!");
        }
        finally
        {
            System.out.println("------Tampilan Array--------");
            System.out.println("Cara 1=");
            for(int i=0; i<angka.length;i++)
            System.out.print(" "+angka[i]);
            System.out.println();
            System.out.println("cara 2");
            System.out.println("Isi array ="+Arrays.toString(angka));
            
            
        }
        
    }
    
}

