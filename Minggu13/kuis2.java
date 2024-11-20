package Minggu13;
import java.util.Scanner;
public class kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] program = new String[3];
        String [] daerah = new String [5];

        for (int i = 0; i < program.length; i++) {
            if (i<program.length) {
                System.out.print("Masukkan nama Program Pemerintah ke-"+(i+1)+": ");
                program[i] = sc.nextLine();
                }
            }
            sc.nextLine();

        for (int j = 0; j < daerah.length; j++) {
            if (j<daerah.length) {
                System.out.print("Masukkan nama Daerah ke-"+(j+1)+": ");
                daerah[j] = sc.nextLine();
                }
            }
            sc.nextLine();

        int [][] nilaiKepuasan = new int [daerah.length][program.length];
        for (int i = 0; i<daerah.length; i++) {
            for (int j = 0; j < program.length; j++) {
                System.out.print("Nilai kepuasan daerah " + daerah[i] + " terhadap program " + program[j] + " (1-5): ");
                nilaiKepuasan[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
