public class UcgenHesap {


	public static void main(String[] args) {
        int a,b,c;
        Scanner deger=new Scanner(System.in);
        System.out.println("Üçgenin 1. kenarını giriniz");
        a=deger.nextInt();
        System.out.println("Üçgenin 2. kenarını giriniz");
        b=deger.nextInt();
        System.out.println("Üçgenin 3. kenarını giriniz");
        c=deger.nextInt();

       double cevre=(a+b+c) /2;
        double alan=cevre*(cevre-a)*(cevre-b)*(cevre-c);
        System.out.println("üçgenin alanı:   "+alan);

    }


}