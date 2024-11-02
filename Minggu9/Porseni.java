package Minggu9;
import java.util.Scanner;
public class Porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPoltek;
        String namaPoltek;

        do {
            System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
            jumlahPoltek = sc.nextInt();
            sc.nextLine();
        } while (jumlahPoltek < 1);

        for (int i = 1; i <= jumlahPoltek; i++) {
            System.out.println("Politeknik ke-" + i);
            System.out.print("Masukkan nama Politeknik: ");
            namaPoltek = sc.nextLine();

            int cabor = 1;
            while (cabor <= 4) {
                String namaCabor;
                switch(cabor) {
                    case 1:
                        namaCabor = "Badminton";
                        break;
                    case 2:
                        namaCabor = "Tenis Meja";
                        break;
                    case 3:
                        namaCabor = "Basket";
                        break;
                    default:
                        namaCabor = "Bola Voly";
                        break;
                }

                System.out.println("Cabang Olahraga: " + namaCabor);
                for (int atlet = 1; atlet <= 5; atlet++) {
                    System.out.print("atlet ke-" + atlet + ": ");
                    sc.nextLine();
                }
                cabor++;
            }
        }
        System.out.println("Total Politeknik terdaftar: " + jumlahPoltek);
        System.out.println("Total atlet terdaftar: " + (jumlahPoltek * 20) + " orang");
    }
}