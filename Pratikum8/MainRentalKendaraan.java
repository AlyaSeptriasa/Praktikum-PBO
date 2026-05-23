/*
 * Nama:Alya Septriasa
   kelas: tekom1B
 */
package Praktikum21052026;

/**
 *
 * @author alyas
 */
import java.util.Scanner;

public class MainRentalKendaraan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        RentalKendaraan rentalkendaraan = null;

        System.out.println("===== PILIH JENIS RENTAL KENDARAAN =====");
        System.out.println("1. Rental Mobil");
        System.out.println("2. Rental Motor");
        System.out.println("3. Rental Bus");
        System.out.print("Masukkan Pilihan Anda : ");
        int pil = input.nextInt();
        input.nextLine();

        switch (pil) {

            case 1: {

                System.out.print("Masukkan Nomor Polisi : ");
                String noPolisi = input.nextLine();

                System.out.print("Masukkan Biaya Bensin : ");
                double biayaBensin = input.nextDouble();

                System.out.print("Masukkan Lama Rental : ");
                int lamaRental = input.nextInt();

                System.out.print("Masukkan Uang Jaminan : ");
                double uangJaminan = input.nextDouble();

                System.out.print("Masukkan Uang Sewa per Hari : ");
                double uangSewa = input.nextDouble();

                rentalkendaraan = new RentalMobil(
                        uangJaminan,
                        uangSewa,
                        noPolisi,
                        biayaBensin,
                        lamaRental
                );

                System.out.println("\n===== DATA RENTAL MOBIL =====");
                ((RentalMobil) rentalkendaraan).TampilkanData();

            }
            break;

            case 2: {

                System.out.print("Masukkan Nomor Polisi : ");
                String noPolisi = input.nextLine();

                System.out.print("Masukkan Biaya Bensin : ");
                double biayaBensin = input.nextDouble();

                System.out.print("Masukkan Lama Rental : ");
                int lamaRental = input.nextInt();

                System.out.print("Masukkan Harga Sewa Motor : ");
                double sewaMotor = input.nextDouble();

                rentalkendaraan = new RentalMotor(
                        sewaMotor,
                        noPolisi,
                        biayaBensin,
                        lamaRental
                );

                System.out.println("\n===== DATA RENTAL MOTOR =====");
                ((RentalMotor) rentalkendaraan).TampilkanData();

            }
            break;

            case 3: {

                System.out.print("Masukkan Nomor Polisi : ");
                String noPolisi = input.nextLine();

                System.out.print("Masukkan Biaya Bensin : ");
                double biayaBensin = input.nextDouble();

                System.out.print("Masukkan Lama Rental : ");
                int lamaRental = input.nextInt();

                System.out.print("Masukkan Muatan Bus : ");
                int muatanBus = input.nextInt();

                System.out.print("Masukkan Harga Rental Bus : ");
                double rentalBus = input.nextDouble();

                rentalkendaraan = new RentalBus(
                        muatanBus,
                        rentalBus,
                        noPolisi,
                        biayaBensin,
                        lamaRental
                );

                System.out.println("\n===== DATA RENTAL BUS =====");
                ((RentalBus) rentalkendaraan).TampilkanData();

            }
            break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

    }

}