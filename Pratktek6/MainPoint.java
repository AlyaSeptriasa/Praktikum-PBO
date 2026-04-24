/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum23042026;

/**
 *
 * @author alyas
 */
public class MainPoint {
    public static void main(String []args){
        Point Rin = new Point(1,2);
        System.out.println(Rin);
        
        Rin.setX(10);
        Rin.setY(3);
        System.out.println(Rin);
        System.out.println("X:"+Rin.getX());
        System.out.println("Y:"+Rin.getY());
        int[]xy=Rin.getXY();
        System.out.println("XY:("+xy[0]+","+xy[1]+")");
    }
    
}
