import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        boolean leapYear = false;
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.println(year + " yılı bir artık yıldır !");
        } else {
            System.out.println(year + " yılı bir artık yıl değildir !");
        }
    }
}