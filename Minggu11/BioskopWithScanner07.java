package Minggu11;
import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        //Membuat Menu
        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
                case 1: // Menu 1 : Input Data Penonton
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris-1][kolom-1] = nama;
                    break;

                case 2: // Menu 2 : Tampilkan Daftar Penonton
                    for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton setiap baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
                    }
                    break;
                
                case 3: //Menu 3 : Exit
                    System.out.println("Terimakasih Sudah Membeli Tiket");
                    return;

                default:
                    System.out.println("Menu Invalid");
            }
        }
    } 
}
