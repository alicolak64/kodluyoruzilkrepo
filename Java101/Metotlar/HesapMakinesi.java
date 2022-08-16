import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int select;
        String menu = "\n1- Toplama Islemi\n"
                + "2- Cıkarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabı\n"
                + "0- Cıkıs Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scanner.nextInt();
        switch (select)
        {
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                times();
                break;
            case 4:
                divided();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                dikdortgen();
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.print("Gecerli bir islem giriniz...");
                break;
        }
        } while (select != 0);
    }

    public static void plus()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("0'a basarak sayi girisi durdurulur");
        int number,result=0,i=1;
        while (true)
        {
            System.out.print(i++ +". sayi : ");
            number=scanner.nextInt();
            if (number==0)
            {
                break;
            }
            result+=number;
        }
        System.out.print("Sonuc : "+result);

    }
    public static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    public static void times() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.print("1'e basarak sayi girisi durdurulur");
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
    public static void divided() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    public static void mod()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz :");
        int n1 = scanner.nextInt();
        System.out.print("2.sayiyi giriniz :");
        int n2 = scanner.nextInt();
        int mod;
        if(n1<=0||n2<=0)
        {
            System.out.print("pozitif sayi giriniz");
        }
        else
        {
            mod=n1%n2;
            System.out.print("kalan : "+mod);
        }
    }
    public static void dikdortgen()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzun kenari giriniz :");
        int k1 = scanner.nextInt();
        System.out.print("Kisa kenari giriniz :");
        int k2 = scanner.nextInt();
        int alan,cevre;
        if(k1<=0||k2<=0)
        {
            System.out.print("pozitif sayi giriniz");
        }
        else if(k1<k2)
        {
            System.out.print("yanlis girildi");
        }
        else
        {
            alan=k1*k2;
            cevre=((k1*2)+(k2*2));
            System.out.print("Alan : "+alan);
            System.out.print("\nCevre : "+cevre);
        }
    }
    
}
