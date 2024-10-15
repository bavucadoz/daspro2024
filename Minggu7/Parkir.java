package Minggu7;
import java.util.Scanner;
public class Parkir {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int jenis, durasi, total = 0;

        System.out.println("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar):");

        do {
            jenis = input07.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input07.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Total biaya parkir: Rp" + total);

        input07.close();
    }
}