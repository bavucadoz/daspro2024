package Minggu11;
import java.util.Scanner;
public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahmahasiswa, jumlahMatkul;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahmahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        jumlahMatkul = sc.nextInt();
        int [][] nilai = new int [jumlahmahasiswa][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai [i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPersiswa/jumlahMatkul);
        }
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahmahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/jumlahmahasiswa);
        }
        sc.close();
    }
}
