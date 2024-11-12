package Minggu11;
import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;

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
                    if (baris > 0 && baris <= 4 && kolom > 0 && kolom <=2) {
                        if (penonton[baris-1][kolom-1] == null)  {
                            penonton[baris-1][kolom-1] = nama;
                        } else {
                            System.out.println("Kursi sudah terisi, silahkan pilih kursi lainnya");
                        }
                    } else {
                        System.out.println("Nomor kursi tidak tersedia");
                    }
                    break;

                case 2: // Menu 2 : Tampilkan Daftar Penonton
                    System.out.println("Daftar Penonton");
                    for (int i=0; i<penonton.length; i++) {
                        for (int j=0; i<penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print(" *** ");
                            } else {
                                System.out.print(" " + penonton[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                
                case 3: //Menu 3 : Exit
                    System.out.println("Terimakasih Sudah Membeli Tiket");
                    return;

                default:
                    System.out.println("Menu Invalid");
            }
        }
    } 
}
