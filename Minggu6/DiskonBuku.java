import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double hargaPerBuku, diskon = 0, totalHarga;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input07.nextLine().toLowerCase();  
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = input07.nextInt();
        System.out.print("Masukkan harga per buku: ");
        hargaPerBuku = input07.nextDouble();
        totalHarga = hargaPerBuku * jumlahBuku;

        // Hitung diskon berdasarkan jenis dan jumlah buku
        if (jenisBuku.equals("kamus")) {
            diskon = totalHarga * 0.10;  
            if (jumlahBuku > 2) {
                diskon += totalHarga * 0.02;  
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = totalHarga * 0.07; 
            if (jumlahBuku > 3) {
                diskon += totalHarga * 0.02; 
            } else {
                diskon += totalHarga * 0.01;  
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = totalHarga * 0.05;  
            }
        }

        double totalYangHarusDibayar = totalHarga - diskon;

        System.out.println("Total diskon: " + diskon);
        System.out.println("Total yang harus dibayar: " + totalYangHarusDibayar);

        input07.close();
    }
}