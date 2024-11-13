package Minggu12;
import java.util.Scanner;
public class SistemInventarisGudang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisBarang, lokasiPenyimpanan;

        //1. Buat Array 2 Dimensi untuk menyimpan informasi stok barang
        System.out.print("Masukkan jumlah jenis barang: ");
        jenisBarang = sc.nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan: ");
        lokasiPenyimpanan = sc.nextInt();

        int[][] stokBarang = new int[jenisBarang][lokasiPenyimpanan];

        //2. Array 1 Dimensi tambahan untuk menyimpan nama kota di setiap lokasi gudang
        System.out.println("Masukkan nama kota untuk setiap lokasi: ");
        String[] kota = new String[lokasiPenyimpanan];
        for (int i = 0; i < lokasiPenyimpanan; i++) {
            System.out.print("Kota untuk lokasi " + (i + 1) + ": ");
            kota[i] = sc.next();
        }
        sc.nextLine();

        //3. Fungsi untk mengisi stok barang di lokasi tertentu
        while (true) {
            System.out.println("Mengisi stok barang...");
            System.out.print("Jenis barang (0-" + (jenisBarang-1) + ", pilih '-1' untuk keluar): ");
            jenisBarang = sc.nextInt();
            if (jenisBarang == -1) break;

            System.out.print("Lokasi (0-" + (lokasiPenyimpanan-1) + "): ");
            lokasiPenyimpanan = sc.nextInt();

            System.out.print("Tambah stok: ");
            int jumlahBarang = sc.nextInt();
            sc.nextLine();
            stokBarang[jenisBarang][lokasiPenyimpanan] += jumlahBarang;
        }

        //4. Menampilkan tabel stok barang
        System.out.println("\nTabel Stok Gudang:");
        System.out.printf("%-12s", "");
        for (String lokasi : kota) {
            System.out.printf("%-12s", lokasi);
        }
        System.out.println();

        for (int i = 0; i < stokBarang.length; i++) {
            System.out.printf("Barang %d:   ", (i + 1));
            for (int j = 0; j < stokBarang[i].length; j++) {
                System.out.printf("%-12d", stokBarang[i][j]);
            }
            System.out.println();
        }
        sc.nextLine();

        //5. Menghitung total stok jenis barang
        System.out.println("\nTotal stok untuk setiap jenis barang:");
        for (int i = 0; i < stokBarang.length; i++) {
            int total = 0;
            for (int j = 0; j < stokBarang[i].length; j++) {
                total += stokBarang[i][j];
            }
            System.out.println("Jenis barang ke-" + (i + 1) + ": " + total);
        }
        sc.nextLine();

        //6. Menemukan lokasi dengan stock terbanyak
        System.out.println("Lokasi dengan stok terbanyak untuk setiap jenis barang:");
        for (int i = 0; i < stokBarang.length; i++) {
            int maxStock = -1;
            int maxLocationIndex = -1;
            for (int j = 0; j < stokBarang[i].length; j++) {
                if (stokBarang[i][j] > maxStock) {
                    maxStock = stokBarang [i][j];
                    maxLocationIndex = j;
                }
            }
            if (maxStock > 0) {
                System.out.println("Jenis barang ke-" + (i + 1) + ": " + kota [maxLocationIndex]);
            } else {
                System.out.println("Jenis barang ke-" + (i + 1) + ": Tidak ada stok");
            }
        }
        sc.close();
    }
}

