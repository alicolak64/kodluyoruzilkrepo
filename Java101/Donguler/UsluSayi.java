import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int x, y;
        double expo = 1; // exponential is 1 on default
        Scanner scanner = new Scanner(System.in);
        System.out.println("xʸ (x^y) şeklinde üs hesaplayan programa hoşgeldiniz.");

        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();

        if (y > 0)
            for (int i = 1; i <= y; i++) {
                expo *= x;
            }
        else if (y < 0) {
            for (int i = -1; i >= y; i--) {
                expo *= x;
            }
            expo = (1 / expo); // x^(-y) = 1/(x^y)
        }

        System.out.println("(" + x + ") ^ (" + y + ") = " + expo);

    }
}
