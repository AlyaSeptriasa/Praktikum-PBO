/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum090406;

/**
 *
 * @author alyas
 */
public class SaldoBankEnkapsulasi {
    // atribut variabel
    private String norekening;
    private String namanasabah;
    private double saldo;
    
    // constructor kosong
    SaldoBankEnkapsulasi(){ 
        saldo = 1000000; 
    }
    
    // constructor 1
    SaldoBankEnkapsulasi(String norek, String nama, double saldo){
        norekening = norek;
        namanasabah = nama;
        saldo = 1000000; 
    }
    
    // GETTER & SETTER
    public String getNorek(){
        return norekening;
    }
    public void setNorek(String norekening){
        this.norekening = norekening;
    }
    
    public String getNama(){
        return namanasabah;
    }
    public void setNama(String namanasabah){
        this.namanasabah = namanasabah;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    // method deposit
    public void deposit(double jumlah) {
        if (jumlah > 0)
        {
            saldo = saldo + jumlah;
            System.out.println("Deposit berhasil Rp. " + jumlah);          
        }
        else
        {
            System.out.println("deposit tidak ada");
        }
    }

    // method withdraw
    public void withdraw(double jumlah) {
        if (jumlah > saldo) 
        {
            System.out.println("Saldo tidak cukup");
        }
        else if (jumlah > 0)
        {
            saldo = saldo - jumlah;
            System.out.println("Withdraw berhasil: " + jumlah);
        }
        else{
            System.out.println("jumlah yang dimasukkan tidak ada");
        }
    }

    // method tampil data
    void TampilData(){
        System.out.println("No rekening=" + norekening);
        System.out.println("Nama Nasabah=" + namanasabah);
        System.out.println("Saldo =" + saldo); 
    }
}