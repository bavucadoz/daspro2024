import java.util.Scanner;
public class Pemilihan2Percobaan2Absen07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int harga, potongan = 1000;
        int pilihan_menu;
        double total_bayar;
        double diskon;
        String member, pembayaran;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input07.nextInt();
        input07.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input07.nextLine();
        System.out.print("Metode pembayaran = ");
        pembayaran = input07.nextLine();
        System.out.println("--------------------------------------");
        if (pembayaran.equalsIgnoreCase("qris")) {
            System.out.println("Selamat, Pembayaran metode QRIS anda mendapat potongan 1000!");
        }else
            System.out.println("Metode pembayaran terverifikasi!");

        if (member.equalsIgnoreCase("y")) { // equalsIgnoreCase untuk membandingkan String
            diskon = 0.10;
            System.out.println("Besar diskon member = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl =" + harga);
                
            } if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =" + harga);

            } if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling =" + harga);

            } else {
                System.out.println("Masukkan pilihan menu yang benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar setelah diskon
            total_bayar = (double) harga - (harga*diskon) - potongan;
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl =" + harga);
                
            } if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea =" + harga);

            } if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling =" + harga);

            } else {
                System.out.println("Masukkan pilihan menu yang benar");
                return; 
            }
            //Menghitung total bayar
            harga = harga - potongan;
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------------------------");
    
    }
}
