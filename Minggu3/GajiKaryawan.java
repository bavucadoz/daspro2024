import java.util.Scanner;

public class GajiKaryawan {
    
    public static void main(String[] args) {
        //variabel
        int jumlahJam, upahPerJam;
        double persentaseBonus = 0.1, persentasePajak = 0.05;

        //1. input
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah jam kerja karyawan:");
        jumlahJam = sc.nextInt();
        System.out.println("Upah per jam karyawan :");
        upahPerJam = sc.nextInt();

        //2. hitung gaji
        int totalGaji = jumlahJam*upahPerJam;
        double bonus = persentaseBonus*totalGaji;
        int totalGajiPlusBonus = totalGaji+(int)bonus;
        double pajak = persentasePajak*totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus-(int)pajak;

        //output
        System.out.println("Total gaji karyawan :" + totalGaji);
        System.out.println("Bonus penghasilan Karyawan :" + bonus);
        System.out.println("Jumlah gaji dan bonus penghasilan :" + totalGajiPlusBonus);
        System.out.println("Jumlah pajak yang harus di bayar karyawan :" + pajak);
        System.out.println("Gaji bersih yang di terima karyawan :" + gajiBersih);

        sc.close();

    }
}
