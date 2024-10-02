import java.util.Scanner;

public class TarifListrik {
    public static void main(String[] args) {
        //input
        int penggunaan;
        int batasPenggunaan = 500;
        int tarifPerKwH = 1500;
        Scanner input = new Scanner(System.in);

        //output
        System.out.println("jumlah penggunaan listrik pengguna per KwH :");
        penggunaan = input.nextInt();
        double totalTarif = tarifPerKwH*penggunaan;

        //logaritma penyelesaian
        System.out.println("Apakah melebihi batas penggunaan listrik?");
        boolean melebihiBatas = penggunaan>=batasPenggunaan;
        if (melebihiBatas) {System.out.println("Listrik melebihi batas");}
        boolean tidakMelebihiBatas = penggunaan<batasPenggunaan;
        if (tidakMelebihiBatas) {System.out.println("Tidak melebihi batas");}

        System.out.println("Total tarif listrik yang harus di bayar : " + totalTarif);

        input.close();

    }
}
