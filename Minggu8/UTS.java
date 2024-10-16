package Minggu8;
import java.util.Scanner;
public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nyawaPemain, nyawaMusuh, kekuatanPemain, kekuatanMusuh, ronde=1;
        String kritis;

        System.out.print("Masukkan nyawa awal pemain: ");
        nyawaPemain = input.nextInt();
        System.out.print("Masukkan nyawa awal musuh: ");
        nyawaMusuh = input.nextInt();
        System.out.print("Masukkan kekuatan serangan pemain: ");
        kekuatanPemain = input.nextInt();
        System.out.print("Masukkan kekuatan serangan musuh: ");
        kekuatanMusuh = input.nextInt();

        System.out.println("=== Ronde " + ronde++ + "===");
        int seranganPemain = nyawaMusuh - kekuatanPemain;
        int seranganMusuh = nyawaPemain - kekuatanMusuh;
        System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + seranganPemain);
        System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + seranganMusuh);
        
        System.out.println("=== Ronde " + ronde++ + "===");
        System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + (seranganPemain-kekuatanPemain));
        System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + (seranganMusuh-kekuatanMusuh));
        if (seranganMusuh-kekuatanMusuh <= 20) {
            System.out.println("Pemain berada dalam kondisi kritis!");
            System.out.print("Apakah Anda ingin melarikan diri? (ya/tidak): ");
            kritis = input.nextLine();
            input.nextLine();
                if ( kritis != "tidak") 
                    System.out.println("=== Ronde " + ronde++ + "===");
                    System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + (seranganPemain-kekuatanPemain));
                    System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + (seranganMusuh-kekuatanMusuh));
                if ( kritis != "ya" )
                if (seranganMusuh-kekuatanMusuh <= 0) {
                    System.out.println("Pemain Kalah !");
         if (nyawaPemain > nyawaMusuh) {
            System.out.println("Pemain Menang !");
         } 
            
                } 
            }
            input.close();
        } 
    }



    

  