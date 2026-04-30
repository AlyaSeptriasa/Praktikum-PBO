/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author alyas
 */
public class Anjing extends Hewan{

    public Anjing(String nama) {
        super(nama);
    }
    @Override
    public void bersuara(){
        super.bersuara();//mengakses atribut/methode super class
        System.out.println(nama+"berkata: Guk Guk!");
    }
}
