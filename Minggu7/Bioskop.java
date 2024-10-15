package Minggu7;
import java.util.Scanner;
public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double hargaTiket = 50000, totalHarga = 0, hargaSetelahDiskon;

        System.out.println("Program Penghitung Penjualan Tiket Bioskop");

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan angka positif.");
                continue;
            } else if (jumlahTiket == 0) {
                break;
            }

            double hargaSebelumDiskon = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                hargaSetelahDiskon = hargaSebelumDiskon * 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                hargaSetelahDiskon = hargaSebelumDiskon * 0.9; // Diskon 10%
            } else {
                hargaSetelahDiskon = hargaSebelumDiskon;
            }

            totalTiket += jumlahTiket;
            totalHarga += hargaSetelahDiskon;

            System.out.println("Total harga setelah diskon: Rp" + hargaSetelahDiskon);
        } while (true);

        System.out.println("\nTotal tiket yang terjual: " + totalTiket + " tiket");
        System.out.println("Total harga penjualan: Rp" + totalHarga);

        input.close();
    }
}