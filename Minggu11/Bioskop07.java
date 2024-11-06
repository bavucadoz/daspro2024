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

        //menampilkan isi elemen array
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);     
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

    }
}
