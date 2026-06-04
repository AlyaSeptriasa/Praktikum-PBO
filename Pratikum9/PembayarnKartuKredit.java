/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
public class PembayarnKartuKredit extends Pembayaran implements CetakStruk{
    private String noKartu;
    private String namaKartu;

    public PembayarnKartuKredit(String noKartu, String namaKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
        this.namaKartu = namaKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

   

    @Override
    public void prosesPembayaran() {
       System.out.println("Pembayaran Menggunakan Kartu Kredit");
       System.out.println("Nama Kartu  :"+namaKartu);
       System.out.println("No Kartu    :"+noKartu);
       System.out.println("Id Transaksi:"+idTransaksi);
       System.out.println("Jumlah Bayra: Rp."+jumlahBayar); 
    }

    @Override
    public void cetak() {
       System.out.println("--------- Struk Pembayaran Menggunakan Kartu Kredit--------");
       System.out.println("Nama Kartu  :"+namaKartu);
       System.out.println("No Kartu    :"+noKartu);
       System.out.println("Id Transaksi:"+idTransaksi);
       System.out.println("Jumlah Bayra: Rp."+jumlahBayar); 
    }
    
    
}
