package printf;

public class Manav {
    public static void main(String[] args) {
        
        String urun[]={"domates","biber","patlican"};
        double fiyat[]={2.3,3.5,2.5};
        double miktar[]={2,3,3.5};

        System.out.println("urun    miktar    br_fiyat  urun_toplam");
        System.out.println("*********************************");
        for (int i = 0; i <urun.length ; i++) {
            System.out.printf("%-8s % 5.2fkg   $%5.2f    $%5.2f\n", urun[i], miktar[i], fiyat[i], miktar[i] * fiyat[i]);
        }
            System.out.println("*********************************");
            double topKilo=0;
            for (int i = 0; i< miktar.length ; i++) {
                topKilo += miktar[i];
            }
        double topFiyat=0;
        for (int i = 0; i< miktar.length ; i++) {
            topFiyat += miktar[i]*fiyat[i];
        }
        System.out.printf("Genel toplam\n        %5.2fkg             %5.2f$ " ,topKilo,topFiyat);

        
    }
}
