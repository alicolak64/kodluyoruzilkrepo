import java.util.Scanner;

public class TaksimetreHesap {

    public static void main(String[] args) {
        
        double price = 2.2 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance : ");

        int distance = scanner.nextInt();

        double total = (price * distance) + 10 ;


        System.out.println(total >= 20 ? "Price : " + total : "Price : 20.00" );




    }

}