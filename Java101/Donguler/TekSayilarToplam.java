import java.util.Scanner;

public class TekSayilarToplam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0, sayi;
        boolean dogruMu = false;
        while (!dogruMu) {
            System.out.println("Sayı giriniz :");
            sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam = toplam + sayi;
            } else if (sayi % 2 != 0) {
                dogruMu = true;
            }
        }
        System.out.println("Toplam = " + toplam);
    }
}
