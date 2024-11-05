package Minggu10;
import java.util.Scanner;
public class NilaiMahasiswaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMHS, totalNilai = 0;
        double rata2;

        System.out.print("Masukkan Jumlah Mahasiswa = ");
        jmlMHS = sc.nextInt();
        int[] NilaiMHS = new int[jmlMHS];

        for (int i = 0; i < jmlMHS; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            NilaiMHS[i] = sc.nextInt();
        }

        int nilaiTertinggi = NilaiMHS[0];
        int nilaiTerendah = NilaiMHS[0];

        for (int i = 0; i < jmlMHS; i++) {
            totalNilai += NilaiMHS[i];  
            if (NilaiMHS[i] > nilaiTertinggi) {
                nilaiTertinggi = NilaiMHS[i];
            }
            if (NilaiMHS[i] < nilaiTerendah) {
                nilaiTerendah = NilaiMHS[i];
            }
        }
        rata2 = (double) totalNilai / jmlMHS;
        System.out.println();
        System.out.println("Nilai rata-rata mahasiswa adalah: " + rata2);
        System.out.println("Nilai tertinggi mahasiswa adalah: " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa adalah: " + nilaiTerendah);
        System.out.println("Semua nilai mahasiswa:");
        System.out.println();
        for (int i = 0; i < jmlMHS; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + NilaiMHS[i]);
        }
        sc.close();
    }
}