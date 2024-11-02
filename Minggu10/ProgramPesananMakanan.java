package Minggu10;
import java.util.Scanner;
public class ProgramPesananMakanan {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Pesanan :");
        n = sc.nextInt();

        String[] nama = new String[n];
        int[] harga = new int[n];
        int i = 0;
        int totalBiaya = 0;
        do {
            System.out.println("NAma PEanan ke"+i);
            nama[i]= sc.nextLine();
            System.out.println("Harga Pesanan ke"+i);
            harga[i]= sc.nextInt();
            totalBiaya = totalBiaya+harga[i];
            i++;
        }while(i<n);

        sc.close();
    }
}
