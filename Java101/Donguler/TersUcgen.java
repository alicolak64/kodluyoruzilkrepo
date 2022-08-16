import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits");
        int digit = scanner.nextInt();

        for (int i = digit; i > 0; i--) {
            for (int j = 0; j < (digit - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
