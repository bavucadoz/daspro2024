package Minggu10;
import java.util.Scanner;;
public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int[banyakNilai];
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i]= sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                System.out.println();
                System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+hasil);
                System.out.println();
                break;
            } else {
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan");
                System.out.println();
                break;
            }
        }

        
        sc.close();
    }
}
