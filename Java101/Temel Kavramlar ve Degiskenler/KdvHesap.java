public class KdvHesap {


	 public static void main(String[] args) {

        double tutar,kdv,kdvTutar,kdvliTutar;
        boolean kdvDurum;
        Scanner deger=new Scanner(System.in);
        System.out.println("ücrett tutarını giriniz");
        tutar=deger.nextDouble();

        kdvDurum = (0 < tutar) && (tutar < 1000);
        kdv = kdvDurum ? 0.18 : 0.8;

        kdvTutar = tutar * kdv;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV Oranı : " + kdv);
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı: " + kdvliTutar);
        
    }


}