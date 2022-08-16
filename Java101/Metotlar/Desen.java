import java.util.Scanner;

public class Desen {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        pattern(scanner.nextInt());
    }

    public static void pattern(int a){
        if(a>0){
            System.out.print(a + " ");
            pattern(a-5);
        }
        System.out.print(a + " ");
    }
}
