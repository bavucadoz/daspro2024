package Minggu13;
import java.util.Scanner;
public class Kubus07 {
    //fungsi hitungLuas
    static int hitungLuas (int sisi) {
        int luasP = 6*sisi*sisi;
        return luasP;
    }

    //fungsi hitungVolume
    static int hitungVolume (int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }

    //fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s,lP,vol;
        System.out.print("Masukkan Panjang sisi: ");
        s = input.nextInt();

        lP = hitungLuas(s);
        System.out.println("Luas Permukaan Kubus adalah "+lP);
        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah "+vol);

        input.close();
    }
}