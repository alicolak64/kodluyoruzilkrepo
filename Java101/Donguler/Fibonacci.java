import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci sayısını giriniz: ");
        int sayi = scanner.nextInt();
        int sayac = 0;
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3 = 0;
        System.out.println(sayi1);
        System.out.println(sayi2);
        while (sayac < sayi - 1) {
            sayi3 = sayi1 + sayi2;
            System.out.println(sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
            sayac++;
        }

    }

}
