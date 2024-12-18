package Minggu16;
import java.util.Scanner;
public class UASTI1A07 {
    public static void main (String[] args) {
        Scanner sc07 = new Scanner(System.in);
        int menu07;
        System.out.println(" === MENU UTAMA === ");
        System.out.println("1. Input Data Skor Tim");
        System.out.println("2. Tampilkan Tabel Skor");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");

        System.out.print("Pilih Menu (1-4): ");
        menu07 = sc07.nextInt();
        if (menu07 == 1) {
            System.out.println();
            inputSkor07();
        } if (menu07 == 2) {
            System.out.println();
            TabelSkor07();
        } if (menu07 == 3) {
            System.out.println();
            Juara07();
        } if (menu07 == 4) {
            System.out.println("Berhasil keluar dari Menu");
        } if (menu07<1 || menu07>4) {
            System.out.println("Pilihan Menu Tidak Valid! Hanya bisa memilih Menu 1-4!");
        }
    }

    public static void inputSkor07() {
        Scanner sc207 = new Scanner(System.in);
        int jumlahTim07 = ((7%3)+4);
        String[][] skor07 = new String[2][jumlahTim07];

        for (int i=0; i<skor07.length; i++) {
            System.out.print("Masukkan nama Tim ke-"+ (i+1) +" : ");
            String namaTim07 = sc207.nextLine();
            for (int j=0; j<skor07.length; j++) {
                System.out.print("Masukkan skor " + namaTim07 + " Untuk Level " + (j+1) + " : ");
                int jmlhSkor07 = sc207.nextInt();
                sc207.nextLine();
                if (jmlhSkor07<0) {
                    System.out.println("Skor tidak valid! Silahkan input ulang");
                }
            }
        }
        return;
    }

    public static void TabelSkor07() {

    }

    public static void Juara07() {

    }
}
