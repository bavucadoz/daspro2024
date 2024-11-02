package Minggu9;
import java.util.Scanner;
public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
            return;
        }
        for(int iOuter=1; iOuter<=N; iOuter++) {
            for(int i=1; i<=N; i++) {
                if(iOuter==1 || iOuter==N || i==1 || i==N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
