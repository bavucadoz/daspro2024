package Minggu13;
public class CafeMariana {
    public static void main(String[] args) {
        System.out.println("\n<=== Rekap Penjualan ===>");
        TotalPenjualan();
        System.out.println();
        PenjualanPerHari();
        System.out.println();
        MenuTertinggi();
        System.out.println();
        RataRataPenjualan();
    }
     // Data penjualan cafe
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, // Kopi
        {30, 80, 40, 10, 15, 20, 25}, // Teh
        {5, 9, 20, 25, 10, 5, 45},    // Es Degan
        {50, 8, 17, 18, 10, 30, 15 },  // Roti Bakar
        {15, 10, 16, 15, 5, 10, 55 }   // Gorengan
    };
    static String[] menu = {">-> Kopi", ">-> Teh", ">-> Es Degan", ">-> Roti Bakar", ">-> Gorengan"};
    // Fungsi untuk menampilkan total penjualan
    static void TotalPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            System.out.println("Total penjualan " + menu[i] + " : " + total);
        }
    }

// Fungsi untuk menampilkan data penjualan per hari
static void PenjualanPerHari() {
    System.out.println("\n Data penjualan dari hari ke-1 hingga hari ke-7 : ");
    for (int i = 0; i < menu.length; i++) {
        System.out.print(menu[i] + " : [");
        for (int j = 0; j < penjualan[i].length; j++) {
            System.out.print(penjualan[i][j]);
            if (j < penjualan[i].length - 1) { 
                System.out.print("], ["); 
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    static void MenuTertinggi() {
        int maxIndex = 0;
        int maxTotal = 0;
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxIndex = i;
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menu[maxIndex] + " dengan total " + maxTotal);
        System.out.println("Menu dengan penjualan tertinggi: " + menuTerlaris + " (Total : " + maxPenjualan + ")");
        }
    }

    // Fungsi untuk menampilkan rata-rata penjualan
    // Fungsi untuk menghitung rata-rata penjualan per menu
    static void RataRataPenjualan() {
        System.out.println("Rata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(menu[i] + " : " + rataRata);
            System.out.println("Rata-rata penjualan " + menu[i] + " : " + rataRata);
        }
    }
}