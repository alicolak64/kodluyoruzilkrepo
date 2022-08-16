import java.util.Scanner;

public class PalindromikWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Word:");
        String str = scanner.nextLine();
        if (isPalindrom(str)) {
            System.out.println("This word is polyndrome .");
        } else {
            System.out.println("This word is not a palindrome !!!");
        }

    }

    public static boolean isPalindrom(String chr) {
        int i = 0;
        int j = chr.length() - 1;
        while (i < j) {
            if (chr.charAt(i) != chr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}