/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum090406;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class MainSaldoBankEnkapsulasi {
    
    public static void main(String[] args){
        SaldoBankEnkapsulasi pp1 = new SaldoBankEnkapsulasi();
        pp1.setNorek("6512563135618");
        pp1.setNama("Alya Septriasa");
        pp1.setSaldo(1000000);
        pp1.TampilData();
        Scanner input = new Scanner(System.in);
        double deposit, withdraw;
        
        System.out.print("\nMasukan Jumlah Deposit = ");
        deposit = input.nextDouble();
        pp1.deposit(deposit);
        pp1.TampilData();
        
        System.out.print("\nMasukan Jumlah Withdraw =");
        withdraw = input.nextDouble();
        pp1.withdraw(withdraw);
        pp1.TampilData();
        System.out.println();
        
        SaldoBankEnkapsulasi pp2 = new SaldoBankEnkapsulasi("34342434242", "Nezuya", 1000000);
        pp2.TampilData();
        System.out.print("\nMasukan Jumlah Deposit = ");
        deposit = input.nextDouble();
        pp2.deposit(deposit);
        pp2.TampilData();
        
        System.out.print("\nMasukan Jumlah Withdraw =");
        withdraw = input.nextDouble();
        pp2.withdraw(withdraw);
        pp2.TampilData();
        
    }    
    }