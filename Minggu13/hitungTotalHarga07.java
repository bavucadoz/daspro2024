package Minggu13;

import java.util.Scanner;
public class hitungTotalHarga07 {
    public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Nama Pelanggan: ");
    String namaPelanggan = sc.nextLine();
    System.out.print("Apakah " + namaPelanggan + " adalah Member? (true/false): ");
    boolean isMember = sc.nextBoolean();
    sc.nextLine(); 
    System.out.print("Masukkan Kode Promo: ");
    String kodePromo = sc.nextLine();
    menu(namaPelanggan, isMember, kodePromo);
    sc.nextLine();
    sc.close();
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println(namaPelanggan + " adalah member, akan mendapatkan diskon 10% untuk setiap pembelian!");
        }

        int totalHargaKeseluruhan = 0;
        Scanner sc2 = new Scanner(System.in);
        boolean pesanLagi = true;
        while (pesanLagi) { 
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
            int PilihanMenu = sc2.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc2.nextInt();
            
            int totalHarga = hitungTotalHarga(PilihanMenu, banyakItem);
            totalHargaKeseluruhan += totalHarga; 
            System.out.print("Apakah ada yang ingin Anda pesan lagi? (true/false) : ");
            pesanLagi = sc2.nextBoolean();
        }
        
        if (isMember) {
            totalHargaKeseluruhan = (int) (totalHargaKeseluruhan * 0.9); 
        }

        if (kodePromo.equals("DISKON50")) {
            totalHargaKeseluruhan = totalHargaKeseluruhan / 2; 
            System.out.println("Selamat! " + namaPelanggan + " mendapatkan diskon 50% dengan kode promo " + kodePromo);
        } else if (kodePromo.equals("DISKON30")) {
            totalHargaKeseluruhan = (int) (totalHargaKeseluruhan * 0.7); 
            System.out.println("Selamat! " + namaPelanggan + " mendapatkan diskon 30% dengan kode promo " + kodePromo);
        } else {
            System.out.println("Kode promo " + kodePromo + " tidak valid, tidak ada pengurangan harga");
        }
        System.out.println("Total harga untuk pesanan anda: " + totalHargaKeseluruhan);
        System.out.println("Terimakasih sudah memesan makanan disini ^^ ");

        sc2.close();
    }

public static int hitungTotalHarga(int PilihanMenu, int banyakItem) {
    int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int hargaTotal = hargaItems[PilihanMenu-1] * banyakItem;
    return hargaTotal;
    }
}