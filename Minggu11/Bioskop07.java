package Minggu11;

public class Bioskop07 {
    public static void main(String[] args) {
        //buat array 4 baris, 2 kolom
        String[][] penonton = new String[4][2];      

        //isi elemen array
        penonton[0][0] = "Amin";     
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        //Menambahkan kode program
        System.out.println(penonton.length);
        
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        //menampilkan nama penonton untuk setiap baris
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton setiap baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
        }
        
        //kode program menampilkan nama penonton baris ke-3
        System.out.println("Penonton pada baris ke-3: ");

        for (String i : penonton[2]) {
            System.out.println(i);
        }
        
    }
}
