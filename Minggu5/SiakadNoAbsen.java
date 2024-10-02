import java.util.Scanner;
public class SiakadNoAbsen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir, nilaiUjian;
        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai uts: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiUjian = (nilaiUAS+nilaiUTS)/2;
        nilaiAkhir = (nilaiKuis*0.20 + nilaiTugas*0.15 + nilaiUTS*0.30 + nilaiUAS*0.35); 

        System.out.println("Masukkan nama: " + nama);
        System.out.println("Masukkan NIM: " + nim);
        System.out.println("Masukkan kelas: " + kelas);
        System.out.println("Masukkan nomor absen: " + absen);
        System.out.println("Masukkan nilai kuis: " + nilaiKuis);
        System.out.println("Masukkan nilai tugas: " + nilaiTugas);
        System.out.println("Masukkan nilai ujian: " + nilaiUjian);
        System.out.println("Mahasiswa dengan nama " + nama + ", (" + nim + "), kelas " + kelas + ", nomor absen " + absen);
        System.out.println("Masukkan nilai akhir: " + nilaiAkhir);

        if (nilaiAkhir>80 && nilaiAkhir<=100) {
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi: Sangat baik");
        }
        else if (nilaiAkhir>73 && nilaiAkhir<=80) {
            System.out.println("Nilai akhir huruf: B+");
            System.out.println("Kualifikasi: Lebih dari baik");
        }
        else if (nilaiAkhir>65 && nilaiAkhir<=73) {
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi: baik");
        }
        else if (nilaiAkhir>60 && nilaiAkhir<=65) {
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi: Lebih dari cukup");
        }
        else if (nilaiAkhir>50 && nilaiAkhir<=60) {
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kualifikasi: Cukup");
        }
        else if (nilaiAkhir>39 && nilaiAkhir<=50) {
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi: Kurang");
        }
        else {
            System.out.println("Nilai akhir huruf: E");
            System.out.println("Kualifikasi: Gagal");
        }

        sc.close();
    }
}
