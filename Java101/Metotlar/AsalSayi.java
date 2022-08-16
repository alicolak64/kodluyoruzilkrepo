import java.util.Scanner;

public class AsalSayi {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz:  ");
        int sayi=scanner.nextInt();
        asal(sayi,2);
    }


    public static void asal(int sayi,int i){
        if (i == sayi) {
            System.out.print(sayi + " asal sayıdır.");
            return;
        } else if (sayi%i == 0) {
            System.out.print(sayi + " asal sayı değildir.");
            return;
        }

        asal(sayi, i + 1);

    }

}
