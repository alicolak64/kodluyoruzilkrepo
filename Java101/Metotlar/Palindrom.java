import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int n = scanner.nextInt();
        System.out.println(isPalindrom(n));

    }

    public static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println("Palindrom sayıdır.");
            return true;
        } else {
            System.out.println("Palindrom sayı değildir.");
            return false;
        }
    }

}
