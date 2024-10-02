import java.util.Scanner;
public class PemilihanHariDenganIf07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bilanganBulat;
        String dayType;

        System.out.print("Input bilangan bulat: ");
        bilanganBulat = sc.nextLine();

        switch (bilanganBulat) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                dayType = "weekday";
                break;
            case "6":
            case "7":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid number";
        }
        System.out.println(bilanganBulat + " is a " + dayType);
        sc.close();
    }
}
