import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notunus Yaziniz");
        Matematik = scanner.nextInt();
        System.out.println("Fizik Notunus Yaziniz");
        Fizik = scanner.nextInt();
        System.out.println("Turkce Notunus Yaziniz");
        Turkce = scanner.nextInt();
        System.out.println("Kimya Notunus Yaziniz");
        Kimya = scanner.nextInt();
        System.out.println("Muzik Notunus Yaziniz");
        Muzik = scanner.nextInt();

        if (Matematik < 0 || Matematik > 100)
            Matematik = 0;
        if (Fizik < 0 || Fizik > 100)
            Fizik = 0;
        if (Kimya < 0 || Kimya > 100)
            Kimya = 0;
        if (Turkce < 0 || Turkce > 100)
            Turkce = 0;
        if (Muzik < 0 || Muzik > 100)
            Muzik = 0;

        double avarage = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5;
        if (avarage < 55) {
            System.out.println("Sinifta kaldiniz");
        } else {
            System.out.println("Sinifi Gectiniz Tebrikler");

        }
        System.out.println("Ortalamaniz : " + avarage);

    }

}