package myProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketDailyGain {


    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */


    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adım
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static Scanner scan = new Scanner(System.in);
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gunun kazancini gir : ");
            double gunlukhasilat = scan.nextDouble();
            gunlukKazanclar.add(gunlukhasilat);
            ciro += gunlukhasilat;
            gun++;


        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();

        System.out.println(" g ksaznla : "+ gunlukKazanclar);
        System.out.println("ciro = " + ciro);
        System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc());
        System.out.println("getOrtalamaninUstundeKazancGünleri() = " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("getOrtalamaninAltindaKazancGünleri() = " + getOrtalamaninAltindaKazancGünleri());

    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaninAltiGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {

            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortalamaninAltiGun += gunler.get(i);

            }
        }
        return ortalamaninAltiGun;

    }

    private static String getOrtalamaninUstundeKazancGünleri() {
        String ortalamaninUstuGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {

            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortalamaninUstuGun += gunler.get(i);

            }
        }
        return ortalamaninUstuGun;
    }

    private static double getOrtalamaKazanc() {
        double ortalamaKazanc = ciro / 7;

        return ortalamaKazanc;

    }
}
