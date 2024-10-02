import java.util.Scanner;
public class Laundry {
    
    public static void main(String[] args) {
        int jumlahPerKilo, hargaPerKilo = 2000, biayaLaundry;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Banyak Laundry per Kilo: ");
        jumlahPerKilo = sc.nextInt();

        biayaLaundry = jumlahPerKilo*hargaPerKilo;

        System.out.println("Biaya Laundry yang harus dibayar: " + biayaLaundry);

        sc.close();

    }
}
