import java.util.Scanner;
public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();

        if (umur<0) {
            System.out.println("Input tidak valid");
        }else if (umur>=0 && umur<=12){
            System.out.println("Kategori Usia dikategorikan sebagai anak-anak");
        }else if (umur>=13 && umur<=19){
            System.out.println("Kategori Usia dikategorikan sebagai remaja");
        }else if (umur>=20 && umur<=64){
            System.out.println("Kategori Usia dikategorikan sebagai dewasa");
        }else{
            System.out.println("Kategori usia dikategorikan sebagai lansia");
        
        }

        input.close();
    }
}
