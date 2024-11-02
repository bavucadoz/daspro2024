package Minggu9;
import java.util.Scanner;
public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j = 1, nilaiMhs;
        float nilai, totalNilai, rataNilai;

        i=1;
        while(i<=5) {
            totalNilai = 0;
            System.out.println("Input nilai mahasiswa ke-" + i);
            for(j=1; j<=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
        sc.close();
    }
}
   