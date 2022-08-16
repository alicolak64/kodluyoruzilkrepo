public class ManavKasa {


	 public static void main(String[] args) {

        double armut, elma, domates, muz, patlican;


        Scanner mey = new Scanner(System.in);

        System.out.print("Kac kilo armut aldin : ");
        armut = mey.nextInt();

        System.out.print("Kac kilo elma aldın : ");
        elma = mey.nextInt();

        System.out.print("Kac kilo domates aldın : ");
        domates = mey.nextInt();

        System.out.print("Kac kilo muz aldın : ");
        muz = mey.nextInt();

        System.out.print("Kac kilo patlıcan aldın : ");
        patlican = mey.nextInt();

        double toplam;

        toplam = elma * 3.67 + armut * 2.14 + domates * 1.11 + muz * 0.95 + patlican * 5;
        System.out.print("toplam para  : " + toplam);


    }


}