import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        int math , physics , chemistry , turkce , history , music ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        math = scanner.nextInt();

        System.out.print("Fizik Notunuz:");
        physics = scanner.nextInt();

        System.out.print("Kimya Notunuz:");
        chemistry = scanner.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = scanner.nextInt();

        System.out.print("Tarih Notunuz:");
        history = scanner.nextInt();

        System.out.print("Müzik Notunuz:");
        music = scanner.nextInt();


        double avarage = ( math + physics + chemistry + turkce + history + music ) / 6.0

        
        String status = avarage > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama " + avarage + " " + status );

    }
    
}