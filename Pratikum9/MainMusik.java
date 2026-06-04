/*
 Nama:Alya Septriasa
 kelas: tekom1B
 */
package Praktikum04062026;

/**
 *
 * @author alyas
 */
public class MainMusik {
    public static void main(String[]args){
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard(true,"Yamaha PSR","Elektronik");
        
        System.out.println("--------info gitar-----------");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("--------info keyboard-----------");
        keyboard.info();
        keyboard.nyalakan();
        keyboard .stem();
        keyboard.matikan();
        keyboard.nyalakan();
    }
    
}
