package pelvinasOtel;

import storage_project.TryCatch;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

import static pelvinasOtel.HotelRoomsObjectClass.*;

public class HotelOperations extends HotelServices2 {

    static Scanner scan = new Scanner(System.in);
    static long toplamGun;//alacagin localdatetime ile hesapala

    static double toplamGirisUcreti;//reception seciminde toplam tutar
    static double toplamCikisUcreti;//extra klairken aldigi hizmet yani =alinan hizmet +toplamGirisUcret

    static List<String> ucretHizmet = new ArrayList<>(Arrays.asList("ucretsiz ", "ucretsiz", "ucretsiz ", "ucretsiz",
            "ucretsiz ", "ucretli", "ucretli ", "ucretli", "ucretsiz ", "ucretli", "ucretli ", "ucretli"));
    static List<String> otelHizmetleri = new ArrayList<>(Arrays.asList("houseKeeping icin        0 ",
            "degerliEsyaSaklamaKasası icin 1 ",
            "yüzmeHavuzları icin     2 ",
            "sauna icin              3",
            "fitnessMerkezi icin     4",
            "kuaför icin             5",
            "araçKiralamaHizmetleri icin 6",
            "kuruTemizlemeUtuhizmeti icin 7",
            "ucretsizOtopark icin    8",
            "aquaPark icin           9",
            "spa icin                10",
            "turGezi icin            11"));

    public static void yazdirStr(String a) {//yazdirma action  yapan seed(tohum) create edildi
        // System.out.print(a + " ");
        System.out.println("otel hzimetlerimiz asagidadir");
        System.out.println("******************************");
        /*System.out.printf(" %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S" +
                        "", otelHizmetleri.get(0), otelHizmetleri.get(1), otelHizmetleri.get(2), otelHizmetleri.get(3),
                otelHizmetleri.get(4), otelHizmetleri.get(5), otelHizmetleri.get(6), otelHizmetleri.get(7),
                otelHizmetleri.get(8), otelHizmetleri.get(9), otelHizmetleri.get(10), otelHizmetleri.get(11));
   */
        for (int i = 0; i <otelHizmetleri.size() ; i++) {
            System.out.printf("%-40s %-5s\n", otelHizmetleri.get(i), ucretHizmet.get(i));
        }

    }
    public static void otelHizmetleriLambda(List<String> service) {
        System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
        service.stream().
                map(t -> t.toUpperCase(Locale.CHINA)).
                forEach(HotelOperations::yazdirStr);//soutc yaz
               // extraHotelHizmetTalep();

    }

    public void hotelReception() {
        System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        String adSoyad = TryCatchYusufBey.stringGirisi();//degiscek
        System.out.println("Lutfen tc'nizi giriniz: ");
        int tc = TryCatchYusufBey.intGirisi();
        System.out.println("Lutfen telefon numaranizi giriniz: ");
        scan.nextLine();
        String tlf = TryCatch.stringGiris();
        //yas alip cocuklar icin indirim yap
        System.out.println("Lutfen giris yaptiginiz tarihi giriniz: (Ornek: 12-01-2022 12:00:00)");// ay ve gunu ayirmak mi yoksa string almak mi?
        String girisGunu = scan.nextLine();
        System.out.println("Lutfen cikis yapcaaan tarihi giriniz: (Ornek: 12-04-2022 12:00:00)");
        String cikisGunu = scan.nextLine();
        System.out.println("************************************");

        try {
            SimpleDateFormat simpleDateFormat
                    = new SimpleDateFormat(
                    "dd-MM-yyyy HH:mm:ss");

            Date d1 = simpleDateFormat.parse(girisGunu);
            Date d2 = simpleDateFormat.parse(cikisGunu);

            long zaman_farki = d2.getTime() - d1.getTime();
            long gun_farki = (zaman_farki / (1000 * 60 * 60 * 24)) % 365;//gune cevirdi
            long saat_farki = (zaman_farki / (1000 * 60 * 60)) % 24;//saate cevirdi

            toplamGun = gun_farki;//+saat_farki;

            if (toplamGun > 0) {
                System.out.println("Odenecek toplam gun ve saat: " + gun_farki + " gun " + saat_farki + " saat");
                System.out.println("************************************");
                //burdan sonra rooms() calisiyor
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Alıs teslimden sonra olamaz");
            hotelReception();
        }
    }

    public static void extraHotelHizmetTalep(List<String> service) {//lambda show
        System.out.println("***** Listeden diledigin hizmeti sec *****");
        service.stream().
                map(t -> t.toUpperCase(Locale.CHINA)).
                forEach(HotelOperations::yazdirStr);//soutc yaz

        int secim = TryCatch.intGirisi();
        switch (secim) {
            case 0:
                toplamGirisUcreti+=odenecek_Ucret1;
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami ="+toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 1:
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami ="+toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 2:
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami ="+toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 3:
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami ="+toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 4:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 5:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 6:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 7:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 8:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 9:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 10:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 11:
                odemeIslemleri();//sonra odaya ciksin
                break;
            default:
                System.out.println("secmiy misen bi daha bak");
                extraHotelHizmetTalep((extraHotelHizmetTalebi));

        }

    }

    public static void odemeIslemleri() {
        System.out.println("kart ile odeme 1 nakit odeme 2");
        int secim = JOptionPane.showOptionDialog(null,"devam etmek istiymisen","Siparis",JOptionPane.YES_NO_CANCEL_OPTION,3, null, null, "secenekler");



    }
}
