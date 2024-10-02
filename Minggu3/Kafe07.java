import java.util.Scanner;

public class Kafe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;


        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga;
        System.out.println("total harga dalam byte: " + totalByte);

        nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar;

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian :" + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti, ");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("Nominal Int Rp " + nominalInt);

        input.close();
    }
    
}
