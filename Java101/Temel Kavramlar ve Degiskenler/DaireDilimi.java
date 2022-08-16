import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        double hesapla,pi=3.14;
        int alfa,cap;
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("yarıçap değerini giriniz");
        cap=scanner.nextInt();
        
        System.out.println("açı değerini giriniz");
        alfa=scanner.nextInt();
        
        hesapla=pi*(cap*cap)*alfa/360;
        System.out.println("sonuç  :"+hesapla);

    }
}